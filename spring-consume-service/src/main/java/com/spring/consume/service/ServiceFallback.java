package com.spring.consume.service;

import com.spring.common.util.SuccessEntity;
import com.spring.consume.client.AssetClient;
import com.spring.consume.entity.ServiceInfo;
import org.springframework.stereotype.Component;

@Component
public class ServiceFallback implements AssetClient {
    @Override
    public SuccessEntity login(ServiceInfo serviceInfo) {

        return SuccessEntity.fail();
    }
}
