package com.cy.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cy.springcloud.common.CommonResult;

/**
 * @author huohuo
 * @create: 2021/6/21 14:39
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "1自定义限流处理信息....CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "2自定义限流处理信息....CustomerBlockHandler");
    }
}
