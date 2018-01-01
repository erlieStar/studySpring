package com.makenv.service.serviceImpl;

import com.makenv.mapper.SpittleMapper;
import com.makenv.po.Spittle;
import com.makenv.service.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpittleServiceImpl implements SpittleService{

    @Autowired
    SpittleMapper spittleMapper;

    public List<Spittle> selectSpittles() {
        return spittleMapper.selectSpittles();
    }

    public Spittle selectOne(int id) {
        return spittleMapper.selectOne(id);
    }
}