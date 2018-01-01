package com.makenv.part2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc blackDisc() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("title");
        cd.setArtist("artist");
        List<String> tracks = new ArrayList<String>();
        tracks.add("A");
        tracks.add("B");
        tracks.add("C");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
