package com.meme.other.dao.mapper;

import com.meme.other.bo.Application;

public interface ApplicationMapper {
    int deleteByPrimaryKey(Integer applicationId);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Integer applicationId);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}