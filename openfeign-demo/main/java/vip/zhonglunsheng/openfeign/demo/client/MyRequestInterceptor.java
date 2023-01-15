package vip.zhonglunsheng.openfeign.demo.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        template.header("my-header","header");
    }
}