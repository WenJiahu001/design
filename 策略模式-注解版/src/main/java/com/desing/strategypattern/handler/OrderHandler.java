package com.desing.strategypattern.handler;

import com.desing.strategypattern.model.Order;

/**
 * ClassName:OrderHandler
 * Package:
 *
 * @Date:2020/8/2 22:36
 * @Author:WenJiahu
 */
public interface OrderHandler {
    void handle(Order order);
}
