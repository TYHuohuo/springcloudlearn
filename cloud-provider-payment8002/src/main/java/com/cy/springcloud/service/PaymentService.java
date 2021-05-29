package com.cy.springcloud.service;

import com.cy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author huohuo
 * @create: 2021/5/28 14:05
 */
public interface PaymentService {
    /**
     * 创建订单
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id获取订单
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
