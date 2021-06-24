package com.cy.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/**
 * @author huohuo
 * @create: 2021/6/19 15:45
 */
@Configuration
@MapperScan({"com.cy.springcloud.dao"})
public class MyBatisConfig {
}
