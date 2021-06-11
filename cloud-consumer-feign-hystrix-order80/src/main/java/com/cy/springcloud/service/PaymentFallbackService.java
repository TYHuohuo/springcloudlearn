package com.cy.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author huohuo
 * @create: 2021/6/1 15:49
 */
@Component
public class PaymentFallbackService implements PaymentHystixService{
    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
