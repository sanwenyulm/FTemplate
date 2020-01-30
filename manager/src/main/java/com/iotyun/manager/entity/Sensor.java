package com.iotyun.manager.entity;

import java.util.Date;

public class Sensor {
    private Integer id;

    private Integer sensorsn;

    private Integer deviceid;

    private Integer funcode;

    private String name;

    private Integer type;

    private Integer deviceAddr;

    private Integer deviceOffset;

    private String value;

    private Integer valueCons;

    private String unit;

    private Integer icon;

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

    public Integer getSensorsn() {
        return sensorsn;
    }

    public void setSensorsn(Integer sensorsn) {
        this.sensorsn = sensorsn;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    public Integer getFuncode() {
        return funcode;
    }

    public void setFuncode(Integer funcode) {
        this.funcode = funcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
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