package com.iotyun.manager.mapper;

import com.iotyun.manager.entity.AlartRecord;
import com.iotyun.manager.entity.AlartRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlartRecordMapper {
    long countByExample(AlartRecordExample example);

    int deleteByExample(AlartRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlartRecord record);

    int insertSelective(AlartRecord record);

    List<AlartRecord> selectByExample(AlartRecordExample example);

    AlartRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlartRecord record, @Param("example") AlartRecordExample example);

    int updateByExample(@Param("record") AlartRecord record, @Param("example") AlartRecordExample example);

    int updateByPrimaryKeySelective(AlartRecord record);

    int updateByPrimaryKey(AlartRecord record);
}