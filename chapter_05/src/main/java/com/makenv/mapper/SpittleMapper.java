package com.makenv.mapper;

import com.makenv.po.Spittle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpittleMapper {

    public List<Spittle> selectSpittles();
    public Spittle selectOne(@Param("id") int id);
}
