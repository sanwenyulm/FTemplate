package com.sanwenyu.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sanwenyu.user.pojo.Device;
/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface DeviceDao extends JpaRepository<Device,String>,JpaSpecificationExecutor<Device>{
	
}
