package com.iotyun.manager.entity;

import java.util.Date;

public class SensorData {
    private Integer id;

    private Integer sensorid;

    private Integer type;

    private Integer deviceAddr;

    private Integer deviceOffset;

    private String value;

    private Integer valueCons;

    private String unit;

    private Integer state;

    private Date createAt;

    private Date updateAt;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSensorid() {
        return sensorid;
    }

    public void setSensorid(Integer sensorid) {
        this.sensorid = sensorid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDeviceAddr() {
        return deviceAddr;
    }

    public void setDeviceAddr(Integer deviceAddr) {
        this.deviceAddr = deviceAddr;
    }

    public Integer getDeviceOffset() {
        return deviceOffset;
    }

    public void setDeviceOffset(Integer deviceOffset) {
        this.deviceOffset = deviceOffset;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getValueCons() {
        return valueCons;
    }

    public void setValueCons(Integer valueCons) {
        this.valueCons = valueCons;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}