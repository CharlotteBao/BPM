package com.bxl.bpm.dao;

import com.bxl.bpm.model.Application;
import com.bxl.bpm.model.ApplicationExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper extends GenericDao<Application, Integer> {
    int countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    Application selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}