package com.meme.other.dao.mapper;

import com.meme.other.bo.Material;
import com.meme.other.bo.MaterialWithBLOBs;

public interface MaterialMapper {
    int deleteByPrimaryKey(String materialId);

    int insert(MaterialWithBLOBs record);

    int insertSelective(MaterialWithBLOBs record);

    MaterialWithBLOBs selectByPrimaryKey(String materialId);

    int updateByPrimaryKeySelective(MaterialWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MaterialWithBLOBs record);

    int updateByPrimaryKey(Material record);
}