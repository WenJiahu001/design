package com.desing.strategypattern.handler;

import java.lang.annotation.Annotation;
import java.util.Objects;

/**
 * ClassName:OrderHandlerTypeImpl
 * Package:
 *
 * @Date:2020/8/2 22:55
 * @Author:WenJiahu
 */
public class OrderHandlerTypeImpl implements OrderHandlerType {

    private String source;
    private String payMethod;

    public OrderHandlerTypeImpl(String source, String payMethod) {
        this.source = source;
        this.payMethod = payMethod;
    }

    @Override
    public String source() {
        return source;
    }

    @Override
    public String payMethod() {
        return payMethod;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return OrderHandlerType.class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof OrderHandlerType)) return false;
        OrderHandlerType that = (OrderHandlerType) o;
        return Objects.equals(source, that.source()) &&
                Objects.equals(payMethod, that.payMethod());
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += (127 * "source".hashCode()) ^ source.hashCode();
        hashCode += (127 * "payMethod".hashCode()) ^ payMethod.hashCode();
        return hashCode;
    }
}
