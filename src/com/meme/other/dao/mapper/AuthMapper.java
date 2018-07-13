package com.meme.other.dao.mapper;

import com.meme.other.bo.Auth;

public interface AuthMapper {
    int deleteByPrimaryKey(String authId);

    int insert(Auth record);

    int insertSelective(Auth record);

    Auth selectByPrimaryKey(String authId);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);
}