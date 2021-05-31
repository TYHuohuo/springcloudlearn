package com.cy.springcloud.controller;

import com.cy.springcloud.common.CommonResult;
import com.cy.springcloud.entities.Payment;
import com.cy.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huohuo
 * @create: 2021/5/31 16:39
 */
@RestController
public class OrderController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
