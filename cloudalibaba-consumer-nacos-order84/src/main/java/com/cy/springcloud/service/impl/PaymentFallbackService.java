package com.cy.springcloud.service.impl;

import com.cy.springcloud.common.CommonResult;
import com.cy.springcloud.entities.Payment;
import com.cy.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author huohuo
 * @create: 2021/6/21 16:20
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(4444,"降级返回，----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
