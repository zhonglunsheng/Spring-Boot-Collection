package com.lsheng.boo.annotation;

import java.lang.annotation.*;

/**
 * @author zhonglunsheng
 * @Description
 * @create 2019-06-02 16:27
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块
     */
    public String title() default "";
    /**
     * 是否保存请求的参数
     */
    public boolean isSaveRequestData() default true;
}
