package com.makenv.service;

import com.makenv.po.Spittle;

import java.util.List;

public interface SpittleService {

    List<Spittle> selectSpittles();
    Spittle selectOne(int id);
}