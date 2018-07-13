package com.meme.other.dao.mapper;

import com.meme.other.bo.Accusation;

public interface AccusationMapper {
    int deleteByPrimaryKey(Long accusationId);

    int insert(Accusation record);

    int insertSelective(Accusation record);

    Accusation selectByPrimaryKey(Long accusationId);

    int updateByPrimaryKeySelective(Accusation record);

    int updateByPrimaryKey(Accusation record);
}