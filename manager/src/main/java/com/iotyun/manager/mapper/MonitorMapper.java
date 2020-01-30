package com.iotyun.manager.mapper;

import com.iotyun.manager.entity.Monitor;
import com.iotyun.manager.entity.MonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorMapper {
    long countByExample(MonitorExample example);

    int deleteByExample(MonitorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Monitor record);

    int insertSelective(Monitor record);

    List<Monitor> selectByExample(MonitorExample example);

    Monitor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Monitor record, @Param("example") MonitorExample example);

    int updateByExample(@Param("record") Monitor record, @Param("example") MonitorExample example);

    int updateByPrimaryKeySelective(Monitor record);

    int updateByPrimaryKey(Monitor record);
}