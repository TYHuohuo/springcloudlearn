package com.cy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author huohuo
 * @create: 2021/5/31 15:26
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> instanceList);
}
