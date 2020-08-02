package com.desing.strategypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ClassName:OrderService
 * Package:
 *
 * @Date:2020/8/2 22:35
 * @Author:WenJiahu
 */
@Service
public class OrderService {

    private Map<OrderHandlerType, OrderHandler> orderHandleMap;

    @Autowired
    public void setOrderHandleMap(List<OrderHandler> orderHandlerList) {
        orderHandleMap = orderHandlerList.stream().collect(
                Collectors.toMap(
                        orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class),
                        v -> v,
                        (v1, v2) -> v1
                )
        );
    }

    public void pay(Order order) {
        OrderHandlerTypeImpl orderHandlerType = new OrderHandlerTypeImpl(order.getSource(), order.getPayMethod());
        OrderHandler orderHandler = orderHandleMap.get(orderHandlerType);
        orderHandler.handle(order);
    }
}
