package com.cy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author huohuo
 * @create: 2021/5/28 15:06
 */
@Configuration
public class ApplicationConextConfig {
    @Bean
    public RestTemplate getResTemplate() {
        return new RestTemplate();
    }
}
