package com.meme.other.dao.mapper;

import com.meme.other.bo.Gold;

public interface GoldMapper {
    int deleteByPrimaryKey(Integer goldRecordId);

    int insert(Gold record);

    int insertSelective(Gold record);

    Gold selectByPrimaryKey(Integer goldRecordId);

    int updateByPrimaryKeySelective(Gold record);

    int updateByPrimaryKey(Gold record);
}