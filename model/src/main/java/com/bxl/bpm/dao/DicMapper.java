package com.bxl.bpm.dao;

import com.bxl.bpm.model.Dic;
import com.bxl.bpm.model.DicExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface DicMapper extends GenericDao<Dic, Integer> {
    int countByExample(DicExample example);

    int deleteByExample(DicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dic record);

    int insertSelective(Dic record);

    List<Dic> selectByExample(DicExample example);

    Dic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByExample(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);
}