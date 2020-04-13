package com.dao;

import com.pojo.Dynamics;

public interface DynamicsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dynamics record);

    int insertSelective(Dynamics record);

    Dynamics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dynamics record);

    int updateByPrimaryKey(Dynamics record);
}