package com.makenv.part1;

import org.springframework.stereotype.Component;

@Component
@Delicious
@Soft
public class Cake implements Dessert {
    public void showType() {
        System.out.println("Cake");
    }
}
