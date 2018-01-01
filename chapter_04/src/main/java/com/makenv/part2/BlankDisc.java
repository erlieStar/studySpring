package com.makenv.part2;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    //磁道列表
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void playTrack(int index) {
        String str = tracks.get(index);
        System.out.println(str);
    }
}
