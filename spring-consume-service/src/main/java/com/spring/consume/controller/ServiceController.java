package com.spring.consume.controller;


import com.spring.common.util.SuccessEntity;
import com.spring.consume.client.AssetClient;
import com.spring.consume.entity.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private AssetClient assetClient;

    @RequestMapping(value = "consumerService")
    public SuccessEntity login(@RequestBody ServiceInfo serviceInfo) {
        return assetClient.login(serviceInfo);
    }
}
