package com.cy.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huohuo
 * @create: 2021/5/28 15:04
 */
@Data
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}