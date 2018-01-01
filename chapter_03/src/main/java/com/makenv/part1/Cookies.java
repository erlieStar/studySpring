package com.makenv.part1;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {
    public void showType() {
        System.out.println("Cookies");
    }
}
