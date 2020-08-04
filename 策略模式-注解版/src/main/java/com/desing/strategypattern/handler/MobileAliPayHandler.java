package com.desing.strategypattern.handler;

import com.desing.strategypattern.model.Order;

/**
 * ClassName:MobileOrderHandler
 * Package:
 *
 * @Date:2020/8/2 22:38
 * @Author:WenJiahu
 */
@OrderHandlerType(source = "mobile",payMethod = "aliPay")
public class MobileAliPayHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("调用了手机支付宝支付");
    }
}
