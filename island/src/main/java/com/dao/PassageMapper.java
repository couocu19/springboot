package com.dao;

import com.pojo.Passage;

public interface PassageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Passage record);

    int insertSelective(Passage record);

    Passage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Passage record);

    int updateByPrimaryKey(Passage record);
}