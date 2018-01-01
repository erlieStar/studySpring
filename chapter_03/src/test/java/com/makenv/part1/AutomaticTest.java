package com.makenv.part1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class AutomaticTest {

    @Delicious
    @Cold
    @Autowired
    Dessert dessert;

    @Test
    public void showType() {
        dessert.showType();
    }

}