package com.cy.springcloud.service.impl;

import com.cy.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author huohuo
 * @create: 2021/6/16 14:41
 */
@EnableBinding(Source.class)//定义消息推动管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;//消息通道
    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        System.out.println("*************serial:" + uuid);
        return null;
    }
}
