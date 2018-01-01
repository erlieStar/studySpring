package com.makenv.service;

import com.makenv.po.Spitter;

public interface SpitterService {
    public int insertSpitter(Spitter spitter);
    public Spitter selectByUsername(String userName);
}
