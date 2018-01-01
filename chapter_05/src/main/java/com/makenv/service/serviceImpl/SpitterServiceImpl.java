package com.makenv.service.serviceImpl;

import com.makenv.mapper.SpitterMapper;
import com.makenv.po.Spitter;
import com.makenv.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpitterServiceImpl implements SpitterService{

    @Autowired
    SpitterMapper spitterMapper;

    public int insertSpitter(Spitter spitter) {
        return spitterMapper.insertSpitter(spitter);
    }

    public Spitter selectByUsername(String userName) {
        return spitterMapper.selectByUsername(userName);
    }
}
