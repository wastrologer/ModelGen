package com.meme.other.dao.mapper;

import com.meme.other.bo.Recommend;

public interface RecommendMapper {
    int deleteByPrimaryKey(Long recommendId);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    Recommend selectByPrimaryKey(Long recommendId);

    int updateByPrimaryKeySelective(Recommend record);

    int updateByPrimaryKey(Recommend record);
}