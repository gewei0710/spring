package com.spring.consume.client;

import com.spring.common.util.SuccessEntity;
import com.spring.consume.entity.ServiceInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "spring-asset-service")
public interface AssetClient {

    @PostMapping(value = "/service/hello")
    SuccessEntity login(@RequestBody ServiceInfo serviceInfo);
}
