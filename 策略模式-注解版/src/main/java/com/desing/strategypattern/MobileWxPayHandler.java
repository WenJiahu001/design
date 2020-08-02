package com.desing.strategypattern;

/**
 * ClassName:MobileOrderHandler
 * Package:
 *
 * @Date:2020/8/2 22:38
 * @Author:WenJiahu
 */
@OrderHandlerType(source = "mobile",payMethod = "wxPay")
public class MobileWxPayHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("调用了手机微信支付");
    }
}
