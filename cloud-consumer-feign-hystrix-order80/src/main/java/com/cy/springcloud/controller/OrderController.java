package com.cy.springcloud.controller;

import com.cy.springcloud.service.PaymentHystixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huohuo
 * @create: 2021/6/1 14:49
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")  //全局的
public class OrderController {
    @Resource
    private PaymentHystixService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfoOK(id);
        log.info("*****result : " + result);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")  //1.5秒钟以内就是正常的业务逻辑
//    })
    @HystrixCommand
    public String paymentInfoTimeout(@PathVariable("id") Integer id){
        //int a = 1/0;
        String result = paymentService.paymentInfoTimeout(id);
        log.info("*****result : " + result);
        return result;
    }


    //兜底方法
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }


    //下面是全局fallback方法
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试,(┬＿┬)";
    }
}
