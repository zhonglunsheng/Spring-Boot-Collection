package vip.zhonglunsheng.openfeign.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.zhonglunsheng.openfeign.demo.client.KmClient;

@RestController
@RequestMapping("/test")
public class IndexController {

    @Autowired
    private KmClient kmClient;

    @GetMapping("/km")
    public Object testClient () {
        return kmClient.getData(1, 1);
    }

    @GetMapping("/km/data")
    public Object server () throws InterruptedException {
        String data = "{\n" +
                "    \"code\": 200,\n" +
                "    \"message\": \"请求成功\",\n" +
                "    \"data\": {\n" +
                "        \"records\": [\n" +
                "            {\n" +
                "                \"id\": 423,\n" +
                "                \"title\": \"Feign客户端调用组件使用\",\n" +
                "                \"content\": \"> Feign在请求调用进行了封装，使得我们调用远程服务跟调用本地方法一样，非常好用，之前有一个误解，以为一定要配合eureka使用，其实不管是服务有没有注册eurek，还是调用其他接口都可以使用feign组件来调用，包括平时调用别人的系统也可以使用\\n\\n非eureka注册服务调用，url自填，当然可以直接使用配置中心的配置\\n```\\n@FeignClient(name = \\\"provider\\\", url = \\\"http://localhost:8081\\\")\\n@FeignClient(url = \\\"${user.api.url}\\\", name = \\\"user\\\", configuration = FooConfiguration.class)\\n```\\nhttps://blog.csdn.net/zhanghan18333611647/article/details/85638863\\n\\n\\nheader参数携带,支持多个，应该也可以直接作用与类上面 通过@RequestMapping 注解（待实践）@RequestMapping不能和@FeignClient同时使用，看有的博客可以应该是版本不一样 推荐直接复制吧，也还好\\n```\\n@PostMapping(value = \\\"/book/api\\\", headers = {\\\"Content-Type=application/json;charset=UTF-8\\\", \\\"App-Secret=${app.secret}\\\"})\\n```\\nhttps://blog.csdn.net/hkk666123/article/details/113964715\\n\\n**全局/单个超时控制**\\n全局\\n```\\nfeign:\\n  client:\\n    config:\\n      default:\\n        # 日志级别\\n        loggerLevel: full\\n        # 超时设置 1.5 秒超时\\n        connectTimeout: 1500\\n        readTimeout: 1500\\n```\\n局部,指定feign 接口的 contextId 设置当前 feign 的超时时间为 5s.\\n```\\nfeign:\\n  client:\\n    config:\\n      default:\\n        # 日志级别\\n        loggerLevel: full\\n        # 超时设置\\n        connectTimeout: 1500\\n        readTimeout: 1500\\n      payment-core:\\n        connectTimeout: 5000\\n        readTimeout: 5000\\n\\n@FeignClient(name = \\\"payment-service\\\", contextId = \\\"payment-core\\\",  path = \\\"/payment\\\")\\n这里可以直接用payment-service，可以不用contextId\\n```\\n\\n**重试**\\n是否只有eureka上面的服务才能进行重试\\n\\n\\n**熔断处理**\\n\\n**请求日志**\\n推荐放到配置文件里面，方便修改，默认是不打印日志的，但是当接口报错的时候会把请求参数和错误日志打印，建议还是打印比较好，进行留痕，像数据采集服务的可以在这里配置不同级别\\n```\\nfeign:\\n  client:\\n    config:\\n      default:\\n        logger-level: full\\n        connect-timeout: 1000\\n        read-timeout: 1000\\n      km:\\n        logger-level: basic\\n        connect-timeout: 1000\\n        read-timeout: 1000\\n```\\n还有一种方案就是，增加一个拦截器，设置到拦截器里面，打印请求日志和参数\",\n" +
                "                \"mastery\": 0,\n" +
                "                \"summary\": null,\n" +
                "                \"recall\": null,\n" +
                "                \"score\": 100,\n" +
                "                \"createTime\": \"2023-01-14 17:31:56\",\n" +
                "                \"updateTime\": \"2023-01-14 20:38:56\",\n" +
                "                \"tags\": \"Spring cloud组件\",\n" +
                "                \"source\": \"\",\n" +
                "                \"flag\": 0,\n" +
                "                \"reviewStatus\": false,\n" +
                "                \"reviewLogs\": null,\n" +
                "                \"reviewSchedules\": null\n" +
                "            }\n" +
                "        ],\n" +
                "        \"total\": 256,\n" +
                "        \"size\": 10,\n" +
                "        \"current\": 1,\n" +
                "        \"orders\": [],\n" +
                "        \"optimizeCountSql\": true,\n" +
                "        \"searchCount\": true,\n" +
                "        \"countId\": null,\n" +
                "        \"maxLimit\": null,\n" +
                "        \"pages\": 26\n" +
                "    }\n" +
                "}";
        return JSONObject.parse(data);
    }
}
