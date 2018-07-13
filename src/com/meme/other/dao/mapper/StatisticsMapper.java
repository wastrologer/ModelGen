package com.meme.other.dao.mapper;

import com.meme.other.bo.Statistics;

public interface StatisticsMapper {
    int deleteByPrimaryKey(Long statisticId);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    Statistics selectByPrimaryKey(Long statisticId);

    int updateByPrimaryKeySelective(Statistics record);

    int updateByPrimaryKey(Statistics record);
}