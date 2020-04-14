package com.spring.consume.controller;


import com.spring.common.util.SuccessEntity;
import com.spring.consume.entity.ServiceInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "service")
public class ServiceController {

    @RequestMapping(value = "hello")
    public SuccessEntity login(@RequestBody ServiceInfo serviceInfo) {
        return SuccessEntity.ok("Service2:Welcome " + serviceInfo.getName() + "!");
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo) {

        return "Service2:Welcome " + serviceInfo.getName() + " !";
    }
}
