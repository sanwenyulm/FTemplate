package com.sanwenyu.user.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_device")
public class Device implements Serializable{

	@Id
	private String id;//


	
	private String uid;//
	private String device_name;//
	private String device_sn;//
	private String device_os_version;//
	private String device_location;//

	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getUid() {		
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDevice_name() {		
		return device_name;
	}
	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}

	public String getDevice_sn() {		
		return device_sn;
	}
	public void setDevice_sn(String device_sn) {
		this.device_sn = device_sn;
	}

	public String getDevice_os_version() {		
		return device_os_version;
	}
	public void setDevice_os_version(String device_os_version) {
		this.device_os_version = device_os_version;
	}

	public String getDevice_location() {		
		return device_location;
	}
	public void setDevice_location(String device_location) {
		this.device_location = device_location;
	}


	
}
