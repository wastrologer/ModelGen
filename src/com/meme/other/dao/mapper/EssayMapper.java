package com.meme.other.dao.mapper;

import com.meme.other.bo.Essay;

public interface EssayMapper {
    int deleteByPrimaryKey(Long essayId);

    int insert(Essay record);

    int insertSelective(Essay record);

    Essay selectByPrimaryKey(Long essayId);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKeyWithBLOBs(Essay record);

    int updateByPrimaryKey(Essay record);
}