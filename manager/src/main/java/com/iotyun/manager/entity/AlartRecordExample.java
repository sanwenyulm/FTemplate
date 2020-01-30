package com.iotyun.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlartRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlartRecordExample() {
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

        public Criteria andDeviceNIsNull() {
            addCriterion("device_n is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNIsNotNull() {
            addCriterion("device_n is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNEqualTo(String value) {
            addCriterion("device_n =", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNNotEqualTo(String value) {
            addCriterion("device_n <>", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNGreaterThan(String value) {
            addCriterion("device_n >", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNGreaterThanOrEqualTo(String value) {
            addCriterion("device_n >=", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNLessThan(String value) {
            addCriterion("device_n <", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNLessThanOrEqualTo(String value) {
            addCriterion("device_n <=", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNLike(String value) {
            addCriterion("device_n like", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNNotLike(String value) {
            addCriterion("device_n not like", value, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNIn(List<String> values) {
            addCriterion("device_n in", values, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNNotIn(List<String> values) {
            addCriterion("device_n not in", values, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNBetween(String value1, String value2) {
            addCriterion("device_n between", value1, value2, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceNNotBetween(String value1, String value2) {
            addCriterion("device_n not between", value1, value2, "deviceN");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(Integer value) {
            addCriterion("deviceid =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(Integer value) {
            addCriterion("deviceid <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(Integer value) {
            addCriterion("deviceid >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceid >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(Integer value) {
            addCriterion("deviceid <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(Integer value) {
            addCriterion("deviceid <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<Integer> values) {
            addCriterion("deviceid in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<Integer> values) {
            addCriterion("deviceid not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(Integer value1, Integer value2) {
            addCriterion("deviceid between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceid not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andOpUserIsNull() {
            addCriterion("op_user is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("op_user is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserEqualTo(Integer value) {
            addCriterion("op_user =", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotEqualTo(Integer value) {
            addCriterion("op_user <>", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThan(Integer value) {
            addCriterion("op_user >", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_user >=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThan(Integer value) {
            addCriterion("op_user <", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThanOrEqualTo(Integer value) {
            addCriterion("op_user <=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserIn(List<Integer> values) {
            addCriterion("op_user in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotIn(List<Integer> values) {
            addCriterion("op_user not in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserBetween(Integer value1, Integer value2) {
            addCriterion("op_user between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotBetween(Integer value1, Integer value2) {
            addCriterion("op_user not between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andCreatAtIsNull() {
            addCriterion("creat_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatAtIsNotNull() {
            addCriterion("creat_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatAtEqualTo(Date value) {
            addCriterion("creat_at =", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtNotEqualTo(Date value) {
            addCriterion("creat_at <>", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtGreaterThan(Date value) {
            addCriterion("creat_at >", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_at >=", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtLessThan(Date value) {
            addCriterion("creat_at <", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtLessThanOrEqualTo(Date value) {
            addCriterion("creat_at <=", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtIn(List<Date> values) {
            addCriterion("creat_at in", values, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtNotIn(List<Date> values) {
            addCriterion("creat_at not in", values, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtBetween(Date value1, Date value2) {
            addCriterion("creat_at between", value1, value2, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtNotBetween(Date value1, Date value2) {
            addCriterion("creat_at not between", value1, value2, "creatAt");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNull() {
            addCriterion("param_value is null");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNotNull() {
            addCriterion("param_value is not null");
            return (Criteria) this;
        }

        public Criteria andParamValueEqualTo(String value) {
            addCriterion("param_value =", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotEqualTo(String value) {
            addCriterion("param_value <>", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThan(String value) {
            addCriterion("param_value >", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_value >=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThan(String value) {
            addCriterion("param_value <", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThanOrEqualTo(String value) {
            addCriterion("param_value <=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLike(String value) {
            addCriterion("param_value like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotLike(String value) {
            addCriterion("param_value not like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueIn(List<String> values) {
            addCriterion("param_value in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotIn(List<String> values) {
            addCriterion("param_value not in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueBetween(String value1, String value2) {
            addCriterion("param_value between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotBetween(String value1, String value2) {
            addCriterion("param_value not between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamRuleIsNull() {
            addCriterion("param_rule is null");
            return (Criteria) this;
        }

        public Criteria andParamRuleIsNotNull() {
            addCriterion("param_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParamRuleEqualTo(Integer value) {
            addCriterion("param_rule =", value, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleNotEqualTo(Integer value) {
            addCriterion("param_rule <>", value, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleGreaterThan(Integer value) {
            addCriterion("param_rule >", value, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_rule >=", value, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleLessThan(Integer value) {
            addCriterion("param_rule <", value, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_rule <=", value, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleIn(List<Integer> values) {
            addCriterion("param_rule in", values, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleNotIn(List<Integer> values) {
            addCriterion("param_rule not in", values, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleBetween(Integer value1, Integer value2) {
            addCriterion("param_rule between", value1, value2, "paramRule");
            return (Criteria) this;
        }

        public Criteria andParamRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_rule not between", value1, value2, "paramRule");
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