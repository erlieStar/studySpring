package com.makenv.xmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//用来初始化Spring的上下文环境
@ContextConfiguration(locations = "classpath:app.xml")
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        //Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles
        //-Track: Sgt. Pepper's Lonely Hearts Club Band
        //-Track: With a Little Help from My Friends
        //-Track: Lucy in the Sky with Diamonds
        player.play();
    }
}
