package com.iotyun.manager.mapper;

import com.iotyun.manager.entity.Sensor;
import com.iotyun.manager.entity.SensorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SensorMapper {
    long countByExample(SensorExample example);

    int deleteByExample(SensorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sensor record);

    int insertSelective(Sensor record);

    List<Sensor> selectByExample(SensorExample example);

    Sensor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByExample(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByPrimaryKeySelective(Sensor record);

    int updateByPrimaryKey(Sensor record);
}