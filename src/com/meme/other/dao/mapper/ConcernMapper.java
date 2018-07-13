package com.meme.other.dao.mapper;

import com.meme.other.bo.Concern;

public interface ConcernMapper {
    int deleteByPrimaryKey(Long concernId);

    int insert(Concern record);

    int insertSelective(Concern record);

    Concern selectByPrimaryKey(Long concernId);

    int updateByPrimaryKeySelective(Concern record);

    int updateByPrimaryKey(Concern record);
}