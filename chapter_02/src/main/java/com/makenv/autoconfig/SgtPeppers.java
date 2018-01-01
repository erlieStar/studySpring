package com.makenv.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

    private String title = "title";
    private String artist = "artist";

    public void play() {
        System.out.println( artist + " play " + title);
    }
}
