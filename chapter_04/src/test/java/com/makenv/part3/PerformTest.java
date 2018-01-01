package com.makenv.part3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config2.xml")
public class PerformTest {

    @Autowired
    Performance performance;

    @Test
    public void play() {
        //Silencing cell phones
        //表演开始
        //CLAP CALP!!
        performance.perform();
    }
}
