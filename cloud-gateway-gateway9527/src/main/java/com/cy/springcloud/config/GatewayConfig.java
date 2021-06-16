package com.cy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huohuo
 * @create: 2021/6/11 15:00
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customerRouterLocator(RouteLocatorBuilder locatorBuilder){
        RouteLocatorBuilder.Builder routes = locatorBuilder.routes();
        routes.route("path_route_cy",r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }
    @Bean
    public RouteLocator customerRouterLocator2(RouteLocatorBuilder locatorBuilder){
        RouteLocatorBuilder.Builder routes = locatorBuilder.routes();
        routes.route("path_route_cy",r -> r.path("/guoji").uri("https://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
