package com.makenv.part1;

import org.springframework.stereotype.Component;

@Component
@Delicious
@Cold
public class IceCream implements Dessert {
    public void showType() {
        System.out.println("IceCream");
    }
}
