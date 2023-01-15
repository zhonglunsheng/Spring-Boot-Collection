package vip.zhonglunsheng.openfeign.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vip.zhonglunsheng.openfeign.demo.entity.KmContent;

@FeignClient(name = "km", url = "http://localhost:8110", path = "/test")
public interface KmClient {

    @GetMapping(value = "/km/data", headers = {"Authorization=${client.token.km}"})
    KmContent getData(@RequestParam("page") int page, @RequestParam("size") int size);

}
