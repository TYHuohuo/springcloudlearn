package com.cy.springcloud.dao;

import com.cy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huohuo
 * Date: 2021/5/28
 *
 * @author huohuo
 */
@Mapper
public interface PaymentDao {
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
