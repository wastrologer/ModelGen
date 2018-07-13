package com.meme.other.dao.mapper;

import com.meme.other.bo.Coin;

public interface CoinMapper {
    int deleteByPrimaryKey(Integer coinRecordId);

    int insert(Coin record);

    int insertSelective(Coin record);

    Coin selectByPrimaryKey(Integer coinRecordId);

    int updateByPrimaryKeySelective(Coin record);

    int updateByPrimaryKey(Coin record);
}