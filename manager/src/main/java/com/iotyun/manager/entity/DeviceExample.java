package com.iotyun.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 
     * 分页参数：起始行 
     */  
    private Integer startRow;  
      
    /** 
     * 分页参数：分页大小 
     */  
    private Integer pageSize;  
      
    public Integer getStartRow() {  
        return startRow;  
    }  
      
    public void setStartRow(Integer startRow) {  
        this.startRow = startRow;  
    }  
      
    public Integer getPageSize() {  
        return pageSize;  
    }  
      
    public void setPageSize(Integer pageSize) {  
        this.pageSize = pageSize;  
    }  
    public DeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDeviceaddIsNull() {
            addCriterion("deviceAdd is null");
            return (Criteria) this;
        }

        public Criteria andDeviceaddIsNotNull() {
            addCriterion("deviceAdd is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceaddEqualTo(Integer value) {
            addCriterion("deviceAdd =", value, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddNotEqualTo(Integer value) {
            addCriterion("deviceAdd <>", value, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddGreaterThan(Integer value) {
            addCriterion("deviceAdd >", value, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceAdd >=", value, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddLessThan(Integer value) {
            addCriterion("deviceAdd <", value, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddLessThanOrEqualTo(Integer value) {
            addCriterion("deviceAdd <=", value, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddIn(List<Integer> values) {
            addCriterion("deviceAdd in", values, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddNotIn(List<Integer> values) {
            addCriterion("deviceAdd not in", values, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddBetween(Integer value1, Integer value2) {
            addCriterion("deviceAdd between", value1, value2, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andDeviceaddNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceAdd not between", value1, value2, "deviceadd");
            return (Criteria) this;
        }

        public Criteria andSnNumberIsNull() {
            addCriterion("sn_number is null");
            return (Criteria) this;
        }

        public Criteria andSnNumberIsNotNull() {
            addCriterion("sn_number is not null");
            return (Criteria) this;
        }

        public Criteria andSnNumberEqualTo(String value) {
            addCriterion("sn_number =", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotEqualTo(String value) {
            addCriterion("sn_number <>", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberGreaterThan(String value) {
            addCriterion("sn_number >", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sn_number >=", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberLessThan(String value) {
            addCriterion("sn_number <", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberLessThanOrEqualTo(String value) {
            addCriterion("sn_number <=", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberLike(String value) {
            addCriterion("sn_number like", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotLike(String value) {
            addCriterion("sn_number not like", value, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberIn(List<String> values) {
            addCriterion("sn_number in", values, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotIn(List<String> values) {
            addCriterion("sn_number not in", values, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberBetween(String value1, String value2) {
            addCriterion("sn_number between", value1, value2, "snNumber");
            return (Criteria) this;
        }

        public Criteria andSnNumberNotBetween(String value1, String value2) {
            addCriterion("sn_number not between", value1, value2, "snNumber");
            return (Criteria) this;
        }

        public Criteria andMonitoridIsNull() {
            addCriterion("monitorid is null");
            return (Criteria) this;
        }

        public Criteria andMonitoridIsNotNull() {
            addCriterion("monitorid is not null");
            return (Criteria) this;
        }

        public Criteria andMonitoridEqualTo(Integer value) {
            addCriterion("monitorid =", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotEqualTo(Integer value) {
            addCriterion("monitorid <>", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridGreaterThan(Integer value) {
            addCriterion("monitorid >", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitorid >=", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridLessThan(Integer value) {
            addCriterion("monitorid <", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridLessThanOrEqualTo(Integer value) {
            addCriterion("monitorid <=", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridIn(List<Integer> values) {
            addCriterion("monitorid in", values, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotIn(List<Integer> values) {
            addCriterion("monitorid not in", values, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridBetween(Integer value1, Integer value2) {
            addCriterion("monitorid between", value1, value2, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotBetween(Integer value1, Integer value2) {
            addCriterion("monitorid not between", value1, value2, "monitorid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIsNull() {
            addCriterion("device_state is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIsNotNull() {
            addCriterion("device_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateEqualTo(Integer value) {
            addCriterion("device_state =", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotEqualTo(Integer value) {
            addCriterion("device_state <>", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGreaterThan(Integer value) {
            addCriterion("device_state >", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_state >=", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateLessThan(Integer value) {
            addCriterion("device_state <", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateLessThanOrEqualTo(Integer value) {
            addCriterion("device_state <=", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIn(List<Integer> values) {
            addCriterion("device_state in", values, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotIn(List<Integer> values) {
            addCriterion("device_state not in", values, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateBetween(Integer value1, Integer value2) {
            addCriterion("device_state between", value1, value2, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotBetween(Integer value1, Integer value2) {
            addCriterion("device_state not between", value1, value2, "deviceState");
            return (Criteria) this;
        }

        public Criteria andCloseAtIsNull() {
            addCriterion("close_at is null");
            return (Criteria) this;
        }

        public Criteria andCloseAtIsNotNull() {
            addCriterion("close_at is not null");
            return (Criteria) this;
        }

        public Criteria andCloseAtEqualTo(Date value) {
            addCriterion("close_at =", value, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtNotEqualTo(Date value) {
            addCriterion("close_at <>", value, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtGreaterThan(Date value) {
            addCriterion("close_at >", value, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtGreaterThanOrEqualTo(Date value) {
            addCriterion("close_at >=", value, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtLessThan(Date value) {
            addCriterion("close_at <", value, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtLessThanOrEqualTo(Date value) {
            addCriterion("close_at <=", value, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtIn(List<Date> values) {
            addCriterion("close_at in", values, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtNotIn(List<Date> values) {
            addCriterion("close_at not in", values, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtBetween(Date value1, Date value2) {
            addCriterion("close_at between", value1, value2, "closeAt");
            return (Criteria) this;
        }

        public Criteria andCloseAtNotBetween(Date value1, Date value2) {
            addCriterion("close_at not between", value1, value2, "closeAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtIsNull() {
            addCriterion("open_at is null");
            return (Criteria) this;
        }

        public Criteria andOpenAtIsNotNull() {
            addCriterion("open_at is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAtEqualTo(Date value) {
            addCriterion("open_at =", value, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtNotEqualTo(Date value) {
            addCriterion("open_at <>", value, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtGreaterThan(Date value) {
            addCriterion("open_at >", value, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtGreaterThanOrEqualTo(Date value) {
            addCriterion("open_at >=", value, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtLessThan(Date value) {
            addCriterion("open_at <", value, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtLessThanOrEqualTo(Date value) {
            addCriterion("open_at <=", value, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtIn(List<Date> values) {
            addCriterion("open_at in", values, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtNotIn(List<Date> values) {
            addCriterion("open_at not in", values, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtBetween(Date value1, Date value2) {
            addCriterion("open_at between", value1, value2, "openAt");
            return (Criteria) this;
        }

        public Criteria andOpenAtNotBetween(Date value1, Date value2) {
            addCriterion("open_at not between", value1, value2, "openAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("protocol is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("protocol is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(Integer value) {
            addCriterion("protocol =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(Integer value) {
            addCriterion("protocol <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(Integer value) {
            addCriterion("protocol >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocol >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(Integer value) {
            addCriterion("protocol <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(Integer value) {
            addCriterion("protocol <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<Integer> values) {
            addCriterion("protocol in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<Integer> values) {
            addCriterion("protocol not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(Integer value1, Integer value2) {
            addCriterion("protocol between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(Integer value1, Integer value2) {
            addCriterion("protocol not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}