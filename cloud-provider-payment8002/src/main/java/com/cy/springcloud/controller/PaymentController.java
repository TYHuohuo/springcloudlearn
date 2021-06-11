package com.cy.springcloud.controller;

import com.cy.springcloud.common.CommonResult;
import com.cy.springcloud.entities.Payment;
import com.cy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author huohuo
 * @create: 2021/5/28 14:08
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果：{}",result);
        if (result > 0) {
            return new CommonResult(200,"插入成功,serverPort: "+serverPort,result);
        } else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,payment);
        } else {
            return new CommonResult(444,"没有找到记录，查询ID:"+id,null);
        }
    }
    @GetMapping("/payment/lb")
    public String getPort(){
        return serverPort;
    }
    @GetMapping("/payment/feign/timeout")
    public String getPaymentTimeout(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
