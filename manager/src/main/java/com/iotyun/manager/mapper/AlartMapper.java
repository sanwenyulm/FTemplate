package com.iotyun.manager.mapper;

import com.iotyun.manager.entity.Alart;
import com.iotyun.manager.entity.AlartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlartMapper {
    long countByExample(AlartExample example);

    int deleteByExample(AlartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Alart record);

    int insertSelective(Alart record);

    List<Alart> selectByExample(AlartExample example);

    Alart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Alart record, @Param("example") AlartExample example);

    int updateByExample(@Param("record") Alart record, @Param("example") AlartExample example);

    int updateByPrimaryKeySelective(Alart record);

    int updateByPrimaryKey(Alart record);
}