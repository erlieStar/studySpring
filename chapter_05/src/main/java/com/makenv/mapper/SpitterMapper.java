package com.makenv.mapper;

import com.makenv.po.Spitter;
import org.apache.ibatis.annotations.Param;

public interface SpitterMapper {

    public int insertSpitter(Spitter spitter);
    public Spitter selectByUsername(@Param("username") String userName);
}
