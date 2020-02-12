package com.sanwenyu.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sanwenyu.user.pojo.Occupation;
/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface OccupationDao extends JpaRepository<Occupation,String>,JpaSpecificationExecutor<Occupation>{
	
}
