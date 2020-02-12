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
@Table(name="tb_occupation")
public class Occupation implements Serializable{

	@Id
	private String id;//


	
	private String uid;//
	private String home;//
	private String company;//
	private String occupation;//

	
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

	public String getHome() {		
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}

	public String getCompany() {		
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getOccupation() {		
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	
}
