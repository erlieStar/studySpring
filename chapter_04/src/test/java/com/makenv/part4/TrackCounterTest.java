package com.makenv.part4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app.xml")
public class TrackCounterTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {

        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(2);
        //BBC21（一行显示一个）
        System.out.println(counter.getPlayCount(1));
        System.out.println(counter.getPlayCount(2));
        //测试条为绿色，测试通过
        Assert.assertEquals(2,counter.getPlayCount(1));
        Assert.assertEquals(1,counter.getPlayCount(2));
    }
}
