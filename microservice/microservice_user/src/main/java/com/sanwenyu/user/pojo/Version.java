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
@Table(name="tb_version")
public class Version implements Serializable{

	@Id
	private String id;//


	
	private String appname;//
	private Integer appid;//
	private String appversion;//
	private String version_des;//
	private java.util.Date updateTime;//

	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getAppname() {		
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}

	public Integer getAppid() {		
		return appid;
	}
	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	public String getAppversion() {		
		return appversion;
	}
	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	public String getVersion_des() {		
		return version_des;
	}
	public void setVersion_des(String version_des) {
		this.version_des = version_des;
	}

	public java.util.Date getUpdateTime() {		
		return updateTime;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}


	
}
