package com.cy.springcloud.lb.impl;

import com.cy.springcloud.lb.LoadBalance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 自己是实现负载均衡
 * @author huohuo
 * @create: 2021/5/31 15:28
 */
@Component
public class MyLoadBalance implements LoadBalance {
    private AtomicInteger atomicInteger =  new AtomicInteger(0);
    public final int getIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******次数next" + next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> instanceList) {
        int index = getIncrement() % instanceList.size();
        return instanceList.get(index);
    }
}
