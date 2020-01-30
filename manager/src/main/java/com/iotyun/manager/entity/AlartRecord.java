package com.iotyun.manager.entity;

import java.util.Date;

public class AlartRecord {
    private Integer id;

    private String deviceN;

    private Integer deviceid;

    private Integer level;

    private Integer status;

    private String address;

    private String location;

    private Integer opUser;

    private Date creatAt;

    private Date updateTime;

    private String paramValue;

    private Integer paramRule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceN() {
        return deviceN;
    }

    public void setDeviceN(String deviceN) {
        this.deviceN = deviceN == null ? null : deviceN.trim();
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getOpUser() {
        return opUser;
    }

    public void setOpUser(Integer opUser) {
        this.opUser = opUser;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public Integer getParamRule() {
        return paramRule;
    }

    public void setParamRule(Integer paramRule) {
        this.paramRule = paramRule;
    }
}