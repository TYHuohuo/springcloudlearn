package com.cy.springcloud.domain;

import lombok.Data;
/**
 * @author huohuo
 * @create: 2021/6/19 15:45
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
