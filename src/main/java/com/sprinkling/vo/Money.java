package com.sprinkling.vo;

import lombok.Data;

@Data
public class Money {
    private final int money;
    private final String msg = "%,d is inappropriate Value. Please enter as a positive integer.";

    private void validator(Integer price){
        if(price <= 0) {
            throw new IllegalArgumentException(String.format(msg, price));
        }
    }
}
