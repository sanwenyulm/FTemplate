package com.iotyun.manager.entity;

import java.util.Date;

public class Device {
    private Integer id;

    private Integer userid;

    private Integer deviceadd;

    private String snNumber;

    private Integer monitorid;

    private String name;

    private String address;

    private String location;

    private String description;

    private Integer deviceState;

    private Date closeAt;

    private Date openAt;

    private Date createAt;

    private Date updateAt;

    private Integer status;

    private Integer protocol;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDeviceadd() {
        return deviceadd;
    }

    public void setDeviceadd(Integer deviceadd) {
        this.deviceadd = deviceadd;
    }

    public String getSnNumber() {
        return snNumber;
    }

    public void setSnNumber(String snNumber) {
        this.snNumber = snNumber == null ? null : snNumber.trim();
    }

    public Integer getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(Integer monitorid) {
        this.monitorid = monitorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(Integer deviceState) {
        this.deviceState = deviceState;
    }

    public Date getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(Date closeAt) {
        this.closeAt = closeAt;
    }

    public Date getOpenAt() {
        return openAt;
    }

    public void setOpenAt(Date openAt) {
        this.openAt = openAt;
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

    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}