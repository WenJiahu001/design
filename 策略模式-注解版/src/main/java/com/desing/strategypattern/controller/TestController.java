package com.desing.strategypattern.controller;

import com.desing.strategypattern.Order;
import com.desing.strategypattern.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * ClassName:TestController
 * Package:
 *
 * @Date:2020/8/2 23:09
 * @Author:WenJiahu
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    OrderService orderService;

    @GetMapping("test01")
    public void test01() {
        Order order = new Order();
        order.setAmount(BigDecimal.valueOf(1));
        order.setCode("1");
        order.setPayMethod("wxPay");
        order.setSource("mobile");
        orderService.pay(order);

        order.setPayMethod("aliPay");
        orderService.pay(order);

        order.setSource("PC");
        orderService.pay(order);

    }

}
