package com.dao;

import com.pojo.Island;

public interface IslandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Island record);

    int insertSelective(Island record);

    Island selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Island record);

    int updateByPrimaryKey(Island record);
}