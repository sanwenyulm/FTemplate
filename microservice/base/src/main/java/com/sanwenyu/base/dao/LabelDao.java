package com.sanwenyu.base.dao;

import com.sanwenyu.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface LabelDao extends JpaRepository<Label,String> , JpaSpecificationExecutor<Label>{
  public List<Label> findByRecommend(String recommend); //按照名称自动生成 where recommend = ?
}
