package com.cy.springcloud.controller;

import com.cy.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huohuo
 * @create: 2021/6/16 14:49
 */
@RestController
public class SendController {
    @Resource
    private IMessageProvider provider;
    @GetMapping("/sendMessage")
    public String send() {
        return provider.send();
    }
}
