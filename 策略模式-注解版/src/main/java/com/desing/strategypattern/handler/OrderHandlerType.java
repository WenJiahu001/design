package com.desing.strategypattern.handler;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * ClassName:OrderHandlerType
 * Package:
 *
 * @Date:2020/8/2 22:37
 * @Author:WenJiahu
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerType {
    String source();

    String payMethod();

}
