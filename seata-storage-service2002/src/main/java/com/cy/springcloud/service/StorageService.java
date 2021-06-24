package com.cy.springcloud.service;

/**
 * @author huohuo
 * @create: 2021/6/19 15:45
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
