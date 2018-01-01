package com.makenv.xmlconfig;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    //磁道列表
    private List<String> tracks;

    public BlankDisc(String title,String artist,List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
