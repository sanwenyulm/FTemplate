package com.sanwenyu.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sanwenyu.user.pojo.Version;
/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface VersionDao extends JpaRepository<Version,String>,JpaSpecificationExecutor<Version>{
	
}
