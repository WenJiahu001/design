package com.desing.strategypattern.handler;

import com.desing.strategypattern.model.Order;

/**
 * ClassName:PCOrderHandler
 * Package:
 *
 * @Date:2020/8/2 22:38
 * @Author:WenJiahu
 */
@OrderHandlerType(source = "PC",payMethod = "aliPay")
public class PCAliPayHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("调用了PC支付宝支付");
    }
}
