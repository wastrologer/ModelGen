package com.meme.other.dao.mapper;

import com.meme.other.bo.Topic;

public interface TopicMapper {
    int deleteByPrimaryKey(Long topicId);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Long topicId);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);
}