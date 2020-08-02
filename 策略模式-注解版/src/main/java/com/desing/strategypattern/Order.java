package com.desing.strategypattern;

import java.math.BigDecimal;

/**
 * ClassName:Order
 * Package:
 *
 * @Date:2020/8/2 22:34
 * @Author:WenJiahu
 */
public class Order {
    private String Source;
    private String payMethod;
    private String code;
    private BigDecimal amount;

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
