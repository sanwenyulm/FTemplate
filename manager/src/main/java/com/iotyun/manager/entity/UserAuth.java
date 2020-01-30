package com.iotyun.manager.entity;

import java.util.Date;

public class UserAuth {
    private Integer id;

    private String name;

    private Integer level;

    private String description;

    private String fun1;

    private Boolean fun1Enable;

    private String fun2;

    private Boolean fun2Enable;

    private String fun3;

    private Boolean fun3Enable;

    private Date creatAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFun1() {
        return fun1;
    }

    public void setFun1(String fun1) {
        this.fun1 = fun1 == null ? null : fun1.trim();
    }

    public Boolean getFun1Enable() {
        return fun1Enable;
    }

    public void setFun1Enable(Boolean fun1Enable) {
        this.fun1Enable = fun1Enable;
    }

    public String getFun2() {
        return fun2;
    }

    public void setFun2(String fun2) {
        this.fun2 = fun2 == null ? null : fun2.trim();
    }

    public Boolean getFun2Enable() {
        return fun2Enable;
    }

    public void setFun2Enable(Boolean fun2Enable) {
        this.fun2Enable = fun2Enable;
    }

    public String getFun3() {
        return fun3;
    }

    public void setFun3(String fun3) {
        this.fun3 = fun3 == null ? null : fun3.trim();
    }

    public Boolean getFun3Enable() {
        return fun3Enable;
    }

    public void setFun3Enable(Boolean fun3Enable) {
        this.fun3Enable = fun3Enable;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}