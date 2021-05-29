package com.cy.springcloud.service.impl;

import com.cy.springcloud.dao.PaymentDao;
import com.cy.springcloud.entities.Payment;
import com.cy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huohuo
 * @create: 2021/5/28 14:06
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
