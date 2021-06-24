package com.cy.springcloud.controller;

import com.cy.springcloud.domain.CommonResult;
import com.cy.springcloud.domain.Order;
import com.cy.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huohuo
 * @create: 2021/6/19 15:45
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
