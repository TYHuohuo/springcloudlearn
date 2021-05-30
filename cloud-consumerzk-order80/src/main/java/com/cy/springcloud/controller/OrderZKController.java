package com.cy.springcloud.controller;

import com.cy.springcloud.common.CommonResult;
import com.cy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author huohuo
 * @create: 2021/5/30 15:22
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String PAYMENT_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate template;
    @GetMapping("/consumer/payment/zk")
    public String getPaymentInfo(){
        return template.getForObject(PAYMENT_URL + "/payment/zk",String.class);
    }
}
