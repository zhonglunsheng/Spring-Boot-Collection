package com.lsheng.boo.aspectj;

import com.lsheng.boo.annotation.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhonglunsheng
 * @Description
 * @create 2019-06-02 16:22
 */
@Slf4j
@Aspect
@Component
public class LogAspectJ {

    /**
     * 配置织入点
     */
    @Pointcut("@annotation(com.lsheng.boo.annotation.Log)")
    public void logPointCut() {
    }

    @AfterReturning(pointcut = "logPointCut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        handleLog(joinPoint, null);
    }

    private void handleLog(final JoinPoint joinPoint, final Exception e) {
        try {
            // 获取注解
            Log controllerLog = getAnnotationLog(joinPoint);
            if (controllerLog == null) {
                return;
            }
            log.info(joinPoint.getTarget().getClass().getName());
            log.info(joinPoint.getSignature().getName());
            log.info(controllerLog.title());
            log.info(controllerLog.isSaveRequestData() + "");
        } catch (Exception exp) {
            log.error("获取操作日志出错：{}", exp.getMessage());
        }
    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private Log getAnnotationLog(JoinPoint joinPoint) throws Exception {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null) {
            return method.getAnnotation(Log.class);
        }
        return null;
    }
}
