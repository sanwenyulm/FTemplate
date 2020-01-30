package com.iotyun.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlartExample() {
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

        public Criteria andParam1IsNull() {
            addCriterion("param_1 is null");
            return (Criteria) this;
        }

        public Criteria andParam1IsNotNull() {
            addCriterion("param_1 is not null");
            return (Criteria) this;
        }

        public Criteria andParam1EqualTo(String value) {
            addCriterion("param_1 =", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotEqualTo(String value) {
            addCriterion("param_1 <>", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThan(String value) {
            addCriterion("param_1 >", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThanOrEqualTo(String value) {
            addCriterion("param_1 >=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThan(String value) {
            addCriterion("param_1 <", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThanOrEqualTo(String value) {
            addCriterion("param_1 <=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Like(String value) {
            addCriterion("param_1 like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotLike(String value) {
            addCriterion("param_1 not like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1In(List<String> values) {
            addCriterion("param_1 in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotIn(List<String> values) {
            addCriterion("param_1 not in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Between(String value1, String value2) {
            addCriterion("param_1 between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotBetween(String value1, String value2) {
            addCriterion("param_1 not between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1ValueIsNull() {
            addCriterion("param_1_value is null");
            return (Criteria) this;
        }

        public Criteria andParam1ValueIsNotNull() {
            addCriterion("param_1_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam1ValueEqualTo(String value) {
            addCriterion("param_1_value =", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueNotEqualTo(String value) {
            addCriterion("param_1_value <>", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueGreaterThan(String value) {
            addCriterion("param_1_value >", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_1_value >=", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueLessThan(String value) {
            addCriterion("param_1_value <", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueLessThanOrEqualTo(String value) {
            addCriterion("param_1_value <=", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueLike(String value) {
            addCriterion("param_1_value like", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueNotLike(String value) {
            addCriterion("param_1_value not like", value, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueIn(List<String> values) {
            addCriterion("param_1_value in", values, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueNotIn(List<String> values) {
            addCriterion("param_1_value not in", values, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueBetween(String value1, String value2) {
            addCriterion("param_1_value between", value1, value2, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1ValueNotBetween(String value1, String value2) {
            addCriterion("param_1_value not between", value1, value2, "param1Value");
            return (Criteria) this;
        }

        public Criteria andParam1RuleIsNull() {
            addCriterion("param_1_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam1RuleIsNotNull() {
            addCriterion("param_1_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam1RuleEqualTo(Integer value) {
            addCriterion("param_1_rule =", value, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleNotEqualTo(Integer value) {
            addCriterion("param_1_rule <>", value, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleGreaterThan(Integer value) {
            addCriterion("param_1_rule >", value, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_1_rule >=", value, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleLessThan(Integer value) {
            addCriterion("param_1_rule <", value, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_1_rule <=", value, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleIn(List<Integer> values) {
            addCriterion("param_1_rule in", values, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleNotIn(List<Integer> values) {
            addCriterion("param_1_rule not in", values, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_1_rule between", value1, value2, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam1RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_1_rule not between", value1, value2, "param1Rule");
            return (Criteria) this;
        }

        public Criteria andParam2IsNull() {
            addCriterion("param_2 is null");
            return (Criteria) this;
        }

        public Criteria andParam2IsNotNull() {
            addCriterion("param_2 is not null");
            return (Criteria) this;
        }

        public Criteria andParam2EqualTo(String value) {
            addCriterion("param_2 =", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotEqualTo(String value) {
            addCriterion("param_2 <>", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThan(String value) {
            addCriterion("param_2 >", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThanOrEqualTo(String value) {
            addCriterion("param_2 >=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThan(String value) {
            addCriterion("param_2 <", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThanOrEqualTo(String value) {
            addCriterion("param_2 <=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Like(String value) {
            addCriterion("param_2 like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotLike(String value) {
            addCriterion("param_2 not like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2In(List<String> values) {
            addCriterion("param_2 in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotIn(List<String> values) {
            addCriterion("param_2 not in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Between(String value1, String value2) {
            addCriterion("param_2 between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotBetween(String value1, String value2) {
            addCriterion("param_2 not between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2ValueIsNull() {
            addCriterion("param_2_value is null");
            return (Criteria) this;
        }

        public Criteria andParam2ValueIsNotNull() {
            addCriterion("param_2_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam2ValueEqualTo(String value) {
            addCriterion("param_2_value =", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueNotEqualTo(String value) {
            addCriterion("param_2_value <>", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueGreaterThan(String value) {
            addCriterion("param_2_value >", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_2_value >=", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueLessThan(String value) {
            addCriterion("param_2_value <", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueLessThanOrEqualTo(String value) {
            addCriterion("param_2_value <=", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueLike(String value) {
            addCriterion("param_2_value like", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueNotLike(String value) {
            addCriterion("param_2_value not like", value, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueIn(List<String> values) {
            addCriterion("param_2_value in", values, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueNotIn(List<String> values) {
            addCriterion("param_2_value not in", values, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueBetween(String value1, String value2) {
            addCriterion("param_2_value between", value1, value2, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2ValueNotBetween(String value1, String value2) {
            addCriterion("param_2_value not between", value1, value2, "param2Value");
            return (Criteria) this;
        }

        public Criteria andParam2RuleIsNull() {
            addCriterion("param_2_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam2RuleIsNotNull() {
            addCriterion("param_2_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam2RuleEqualTo(Integer value) {
            addCriterion("param_2_rule =", value, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleNotEqualTo(Integer value) {
            addCriterion("param_2_rule <>", value, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleGreaterThan(Integer value) {
            addCriterion("param_2_rule >", value, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_2_rule >=", value, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleLessThan(Integer value) {
            addCriterion("param_2_rule <", value, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_2_rule <=", value, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleIn(List<Integer> values) {
            addCriterion("param_2_rule in", values, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleNotIn(List<Integer> values) {
            addCriterion("param_2_rule not in", values, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_2_rule between", value1, value2, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam2RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_2_rule not between", value1, value2, "param2Rule");
            return (Criteria) this;
        }

        public Criteria andParam3IsNull() {
            addCriterion("param_3 is null");
            return (Criteria) this;
        }

        public Criteria andParam3IsNotNull() {
            addCriterion("param_3 is not null");
            return (Criteria) this;
        }

        public Criteria andParam3EqualTo(String value) {
            addCriterion("param_3 =", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotEqualTo(String value) {
            addCriterion("param_3 <>", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThan(String value) {
            addCriterion("param_3 >", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThanOrEqualTo(String value) {
            addCriterion("param_3 >=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThan(String value) {
            addCriterion("param_3 <", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThanOrEqualTo(String value) {
            addCriterion("param_3 <=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Like(String value) {
            addCriterion("param_3 like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotLike(String value) {
            addCriterion("param_3 not like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3In(List<String> values) {
            addCriterion("param_3 in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotIn(List<String> values) {
            addCriterion("param_3 not in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Between(String value1, String value2) {
            addCriterion("param_3 between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotBetween(String value1, String value2) {
            addCriterion("param_3 not between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3ValueIsNull() {
            addCriterion("param_3_value is null");
            return (Criteria) this;
        }

        public Criteria andParam3ValueIsNotNull() {
            addCriterion("param_3_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam3ValueEqualTo(String value) {
            addCriterion("param_3_value =", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueNotEqualTo(String value) {
            addCriterion("param_3_value <>", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueGreaterThan(String value) {
            addCriterion("param_3_value >", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_3_value >=", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueLessThan(String value) {
            addCriterion("param_3_value <", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueLessThanOrEqualTo(String value) {
            addCriterion("param_3_value <=", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueLike(String value) {
            addCriterion("param_3_value like", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueNotLike(String value) {
            addCriterion("param_3_value not like", value, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueIn(List<String> values) {
            addCriterion("param_3_value in", values, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueNotIn(List<String> values) {
            addCriterion("param_3_value not in", values, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueBetween(String value1, String value2) {
            addCriterion("param_3_value between", value1, value2, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3ValueNotBetween(String value1, String value2) {
            addCriterion("param_3_value not between", value1, value2, "param3Value");
            return (Criteria) this;
        }

        public Criteria andParam3RuleIsNull() {
            addCriterion("param_3_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam3RuleIsNotNull() {
            addCriterion("param_3_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam3RuleEqualTo(Integer value) {
            addCriterion("param_3_rule =", value, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleNotEqualTo(Integer value) {
            addCriterion("param_3_rule <>", value, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleGreaterThan(Integer value) {
            addCriterion("param_3_rule >", value, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_3_rule >=", value, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleLessThan(Integer value) {
            addCriterion("param_3_rule <", value, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_3_rule <=", value, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleIn(List<Integer> values) {
            addCriterion("param_3_rule in", values, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleNotIn(List<Integer> values) {
            addCriterion("param_3_rule not in", values, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_3_rule between", value1, value2, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam3RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_3_rule not between", value1, value2, "param3Rule");
            return (Criteria) this;
        }

        public Criteria andParam4IsNull() {
            addCriterion("param_4 is null");
            return (Criteria) this;
        }

        public Criteria andParam4IsNotNull() {
            addCriterion("param_4 is not null");
            return (Criteria) this;
        }

        public Criteria andParam4EqualTo(String value) {
            addCriterion("param_4 =", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotEqualTo(String value) {
            addCriterion("param_4 <>", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThan(String value) {
            addCriterion("param_4 >", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThanOrEqualTo(String value) {
            addCriterion("param_4 >=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThan(String value) {
            addCriterion("param_4 <", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThanOrEqualTo(String value) {
            addCriterion("param_4 <=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Like(String value) {
            addCriterion("param_4 like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotLike(String value) {
            addCriterion("param_4 not like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4In(List<String> values) {
            addCriterion("param_4 in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotIn(List<String> values) {
            addCriterion("param_4 not in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Between(String value1, String value2) {
            addCriterion("param_4 between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotBetween(String value1, String value2) {
            addCriterion("param_4 not between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4ValueIsNull() {
            addCriterion("param_4_value is null");
            return (Criteria) this;
        }

        public Criteria andParam4ValueIsNotNull() {
            addCriterion("param_4_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam4ValueEqualTo(String value) {
            addCriterion("param_4_value =", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueNotEqualTo(String value) {
            addCriterion("param_4_value <>", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueGreaterThan(String value) {
            addCriterion("param_4_value >", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_4_value >=", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueLessThan(String value) {
            addCriterion("param_4_value <", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueLessThanOrEqualTo(String value) {
            addCriterion("param_4_value <=", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueLike(String value) {
            addCriterion("param_4_value like", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueNotLike(String value) {
            addCriterion("param_4_value not like", value, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueIn(List<String> values) {
            addCriterion("param_4_value in", values, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueNotIn(List<String> values) {
            addCriterion("param_4_value not in", values, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueBetween(String value1, String value2) {
            addCriterion("param_4_value between", value1, value2, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4ValueNotBetween(String value1, String value2) {
            addCriterion("param_4_value not between", value1, value2, "param4Value");
            return (Criteria) this;
        }

        public Criteria andParam4RuleIsNull() {
            addCriterion("param_4_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam4RuleIsNotNull() {
            addCriterion("param_4_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam4RuleEqualTo(Integer value) {
            addCriterion("param_4_rule =", value, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleNotEqualTo(Integer value) {
            addCriterion("param_4_rule <>", value, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleGreaterThan(Integer value) {
            addCriterion("param_4_rule >", value, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_4_rule >=", value, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleLessThan(Integer value) {
            addCriterion("param_4_rule <", value, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_4_rule <=", value, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleIn(List<Integer> values) {
            addCriterion("param_4_rule in", values, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleNotIn(List<Integer> values) {
            addCriterion("param_4_rule not in", values, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_4_rule between", value1, value2, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam4RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_4_rule not between", value1, value2, "param4Rule");
            return (Criteria) this;
        }

        public Criteria andParam5IsNull() {
            addCriterion("param_5 is null");
            return (Criteria) this;
        }

        public Criteria andParam5IsNotNull() {
            addCriterion("param_5 is not null");
            return (Criteria) this;
        }

        public Criteria andParam5EqualTo(String value) {
            addCriterion("param_5 =", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotEqualTo(String value) {
            addCriterion("param_5 <>", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThan(String value) {
            addCriterion("param_5 >", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThanOrEqualTo(String value) {
            addCriterion("param_5 >=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThan(String value) {
            addCriterion("param_5 <", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThanOrEqualTo(String value) {
            addCriterion("param_5 <=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Like(String value) {
            addCriterion("param_5 like", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotLike(String value) {
            addCriterion("param_5 not like", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5In(List<String> values) {
            addCriterion("param_5 in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotIn(List<String> values) {
            addCriterion("param_5 not in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Between(String value1, String value2) {
            addCriterion("param_5 between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotBetween(String value1, String value2) {
            addCriterion("param_5 not between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam6ValueIsNull() {
            addCriterion("param_6_value is null");
            return (Criteria) this;
        }

        public Criteria andParam6ValueIsNotNull() {
            addCriterion("param_6_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam6ValueEqualTo(String value) {
            addCriterion("param_6_value =", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueNotEqualTo(String value) {
            addCriterion("param_6_value <>", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueGreaterThan(String value) {
            addCriterion("param_6_value >", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_6_value >=", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueLessThan(String value) {
            addCriterion("param_6_value <", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueLessThanOrEqualTo(String value) {
            addCriterion("param_6_value <=", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueLike(String value) {
            addCriterion("param_6_value like", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueNotLike(String value) {
            addCriterion("param_6_value not like", value, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueIn(List<String> values) {
            addCriterion("param_6_value in", values, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueNotIn(List<String> values) {
            addCriterion("param_6_value not in", values, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueBetween(String value1, String value2) {
            addCriterion("param_6_value between", value1, value2, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6ValueNotBetween(String value1, String value2) {
            addCriterion("param_6_value not between", value1, value2, "param6Value");
            return (Criteria) this;
        }

        public Criteria andParam6RuleIsNull() {
            addCriterion("param_6_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam6RuleIsNotNull() {
            addCriterion("param_6_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam6RuleEqualTo(Integer value) {
            addCriterion("param_6_rule =", value, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleNotEqualTo(Integer value) {
            addCriterion("param_6_rule <>", value, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleGreaterThan(Integer value) {
            addCriterion("param_6_rule >", value, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_6_rule >=", value, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleLessThan(Integer value) {
            addCriterion("param_6_rule <", value, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_6_rule <=", value, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleIn(List<Integer> values) {
            addCriterion("param_6_rule in", values, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleNotIn(List<Integer> values) {
            addCriterion("param_6_rule not in", values, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_6_rule between", value1, value2, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam6RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_6_rule not between", value1, value2, "param6Rule");
            return (Criteria) this;
        }

        public Criteria andParam7IsNull() {
            addCriterion("param_7 is null");
            return (Criteria) this;
        }

        public Criteria andParam7IsNotNull() {
            addCriterion("param_7 is not null");
            return (Criteria) this;
        }

        public Criteria andParam7EqualTo(String value) {
            addCriterion("param_7 =", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotEqualTo(String value) {
            addCriterion("param_7 <>", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7GreaterThan(String value) {
            addCriterion("param_7 >", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7GreaterThanOrEqualTo(String value) {
            addCriterion("param_7 >=", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7LessThan(String value) {
            addCriterion("param_7 <", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7LessThanOrEqualTo(String value) {
            addCriterion("param_7 <=", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7Like(String value) {
            addCriterion("param_7 like", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotLike(String value) {
            addCriterion("param_7 not like", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7In(List<String> values) {
            addCriterion("param_7 in", values, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotIn(List<String> values) {
            addCriterion("param_7 not in", values, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7Between(String value1, String value2) {
            addCriterion("param_7 between", value1, value2, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotBetween(String value1, String value2) {
            addCriterion("param_7 not between", value1, value2, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7ValueIsNull() {
            addCriterion("param_7_value is null");
            return (Criteria) this;
        }

        public Criteria andParam7ValueIsNotNull() {
            addCriterion("param_7_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam7ValueEqualTo(String value) {
            addCriterion("param_7_value =", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueNotEqualTo(String value) {
            addCriterion("param_7_value <>", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueGreaterThan(String value) {
            addCriterion("param_7_value >", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_7_value >=", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueLessThan(String value) {
            addCriterion("param_7_value <", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueLessThanOrEqualTo(String value) {
            addCriterion("param_7_value <=", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueLike(String value) {
            addCriterion("param_7_value like", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueNotLike(String value) {
            addCriterion("param_7_value not like", value, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueIn(List<String> values) {
            addCriterion("param_7_value in", values, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueNotIn(List<String> values) {
            addCriterion("param_7_value not in", values, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueBetween(String value1, String value2) {
            addCriterion("param_7_value between", value1, value2, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7ValueNotBetween(String value1, String value2) {
            addCriterion("param_7_value not between", value1, value2, "param7Value");
            return (Criteria) this;
        }

        public Criteria andParam7RuleIsNull() {
            addCriterion("param_7_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam7RuleIsNotNull() {
            addCriterion("param_7_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam7RuleEqualTo(Integer value) {
            addCriterion("param_7_rule =", value, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleNotEqualTo(Integer value) {
            addCriterion("param_7_rule <>", value, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleGreaterThan(Integer value) {
            addCriterion("param_7_rule >", value, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_7_rule >=", value, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleLessThan(Integer value) {
            addCriterion("param_7_rule <", value, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_7_rule <=", value, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleIn(List<Integer> values) {
            addCriterion("param_7_rule in", values, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleNotIn(List<Integer> values) {
            addCriterion("param_7_rule not in", values, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_7_rule between", value1, value2, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam7RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_7_rule not between", value1, value2, "param7Rule");
            return (Criteria) this;
        }

        public Criteria andParam8IsNull() {
            addCriterion("param_8 is null");
            return (Criteria) this;
        }

        public Criteria andParam8IsNotNull() {
            addCriterion("param_8 is not null");
            return (Criteria) this;
        }

        public Criteria andParam8EqualTo(String value) {
            addCriterion("param_8 =", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotEqualTo(String value) {
            addCriterion("param_8 <>", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8GreaterThan(String value) {
            addCriterion("param_8 >", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8GreaterThanOrEqualTo(String value) {
            addCriterion("param_8 >=", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8LessThan(String value) {
            addCriterion("param_8 <", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8LessThanOrEqualTo(String value) {
            addCriterion("param_8 <=", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8Like(String value) {
            addCriterion("param_8 like", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotLike(String value) {
            addCriterion("param_8 not like", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8In(List<String> values) {
            addCriterion("param_8 in", values, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotIn(List<String> values) {
            addCriterion("param_8 not in", values, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8Between(String value1, String value2) {
            addCriterion("param_8 between", value1, value2, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotBetween(String value1, String value2) {
            addCriterion("param_8 not between", value1, value2, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8ValueIsNull() {
            addCriterion("param_8_value is null");
            return (Criteria) this;
        }

        public Criteria andParam8ValueIsNotNull() {
            addCriterion("param_8_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam8ValueEqualTo(String value) {
            addCriterion("param_8_value =", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueNotEqualTo(String value) {
            addCriterion("param_8_value <>", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueGreaterThan(String value) {
            addCriterion("param_8_value >", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_8_value >=", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueLessThan(String value) {
            addCriterion("param_8_value <", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueLessThanOrEqualTo(String value) {
            addCriterion("param_8_value <=", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueLike(String value) {
            addCriterion("param_8_value like", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueNotLike(String value) {
            addCriterion("param_8_value not like", value, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueIn(List<String> values) {
            addCriterion("param_8_value in", values, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueNotIn(List<String> values) {
            addCriterion("param_8_value not in", values, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueBetween(String value1, String value2) {
            addCriterion("param_8_value between", value1, value2, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8ValueNotBetween(String value1, String value2) {
            addCriterion("param_8_value not between", value1, value2, "param8Value");
            return (Criteria) this;
        }

        public Criteria andParam8RuleIsNull() {
            addCriterion("param_8_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam8RuleIsNotNull() {
            addCriterion("param_8_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam8RuleEqualTo(Integer value) {
            addCriterion("param_8_rule =", value, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleNotEqualTo(Integer value) {
            addCriterion("param_8_rule <>", value, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleGreaterThan(Integer value) {
            addCriterion("param_8_rule >", value, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_8_rule >=", value, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleLessThan(Integer value) {
            addCriterion("param_8_rule <", value, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_8_rule <=", value, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleIn(List<Integer> values) {
            addCriterion("param_8_rule in", values, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleNotIn(List<Integer> values) {
            addCriterion("param_8_rule not in", values, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_8_rule between", value1, value2, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam8RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_8_rule not between", value1, value2, "param8Rule");
            return (Criteria) this;
        }

        public Criteria andParam9IsNull() {
            addCriterion("param_9 is null");
            return (Criteria) this;
        }

        public Criteria andParam9IsNotNull() {
            addCriterion("param_9 is not null");
            return (Criteria) this;
        }

        public Criteria andParam9EqualTo(String value) {
            addCriterion("param_9 =", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotEqualTo(String value) {
            addCriterion("param_9 <>", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9GreaterThan(String value) {
            addCriterion("param_9 >", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9GreaterThanOrEqualTo(String value) {
            addCriterion("param_9 >=", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9LessThan(String value) {
            addCriterion("param_9 <", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9LessThanOrEqualTo(String value) {
            addCriterion("param_9 <=", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9Like(String value) {
            addCriterion("param_9 like", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotLike(String value) {
            addCriterion("param_9 not like", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9In(List<String> values) {
            addCriterion("param_9 in", values, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotIn(List<String> values) {
            addCriterion("param_9 not in", values, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9Between(String value1, String value2) {
            addCriterion("param_9 between", value1, value2, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotBetween(String value1, String value2) {
            addCriterion("param_9 not between", value1, value2, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9ValueIsNull() {
            addCriterion("param_9_value is null");
            return (Criteria) this;
        }

        public Criteria andParam9ValueIsNotNull() {
            addCriterion("param_9_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam9ValueEqualTo(String value) {
            addCriterion("param_9_value =", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueNotEqualTo(String value) {
            addCriterion("param_9_value <>", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueGreaterThan(String value) {
            addCriterion("param_9_value >", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_9_value >=", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueLessThan(String value) {
            addCriterion("param_9_value <", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueLessThanOrEqualTo(String value) {
            addCriterion("param_9_value <=", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueLike(String value) {
            addCriterion("param_9_value like", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueNotLike(String value) {
            addCriterion("param_9_value not like", value, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueIn(List<String> values) {
            addCriterion("param_9_value in", values, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueNotIn(List<String> values) {
            addCriterion("param_9_value not in", values, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueBetween(String value1, String value2) {
            addCriterion("param_9_value between", value1, value2, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9ValueNotBetween(String value1, String value2) {
            addCriterion("param_9_value not between", value1, value2, "param9Value");
            return (Criteria) this;
        }

        public Criteria andParam9RuleIsNull() {
            addCriterion("param_9_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam9RuleIsNotNull() {
            addCriterion("param_9_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam9RuleEqualTo(Integer value) {
            addCriterion("param_9_rule =", value, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleNotEqualTo(Integer value) {
            addCriterion("param_9_rule <>", value, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleGreaterThan(Integer value) {
            addCriterion("param_9_rule >", value, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_9_rule >=", value, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleLessThan(Integer value) {
            addCriterion("param_9_rule <", value, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_9_rule <=", value, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleIn(List<Integer> values) {
            addCriterion("param_9_rule in", values, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleNotIn(List<Integer> values) {
            addCriterion("param_9_rule not in", values, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_9_rule between", value1, value2, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam9RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_9_rule not between", value1, value2, "param9Rule");
            return (Criteria) this;
        }

        public Criteria andParam10IsNull() {
            addCriterion("param_10 is null");
            return (Criteria) this;
        }

        public Criteria andParam10IsNotNull() {
            addCriterion("param_10 is not null");
            return (Criteria) this;
        }

        public Criteria andParam10EqualTo(String value) {
            addCriterion("param_10 =", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotEqualTo(String value) {
            addCriterion("param_10 <>", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10GreaterThan(String value) {
            addCriterion("param_10 >", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10GreaterThanOrEqualTo(String value) {
            addCriterion("param_10 >=", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10LessThan(String value) {
            addCriterion("param_10 <", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10LessThanOrEqualTo(String value) {
            addCriterion("param_10 <=", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10Like(String value) {
            addCriterion("param_10 like", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotLike(String value) {
            addCriterion("param_10 not like", value, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10In(List<String> values) {
            addCriterion("param_10 in", values, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotIn(List<String> values) {
            addCriterion("param_10 not in", values, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10Between(String value1, String value2) {
            addCriterion("param_10 between", value1, value2, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10NotBetween(String value1, String value2) {
            addCriterion("param_10 not between", value1, value2, "param10");
            return (Criteria) this;
        }

        public Criteria andParam10ValueIsNull() {
            addCriterion("param_10_value is null");
            return (Criteria) this;
        }

        public Criteria andParam10ValueIsNotNull() {
            addCriterion("param_10_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam10ValueEqualTo(String value) {
            addCriterion("param_10_value =", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueNotEqualTo(String value) {
            addCriterion("param_10_value <>", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueGreaterThan(String value) {
            addCriterion("param_10_value >", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_10_value >=", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueLessThan(String value) {
            addCriterion("param_10_value <", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueLessThanOrEqualTo(String value) {
            addCriterion("param_10_value <=", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueLike(String value) {
            addCriterion("param_10_value like", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueNotLike(String value) {
            addCriterion("param_10_value not like", value, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueIn(List<String> values) {
            addCriterion("param_10_value in", values, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueNotIn(List<String> values) {
            addCriterion("param_10_value not in", values, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueBetween(String value1, String value2) {
            addCriterion("param_10_value between", value1, value2, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10ValueNotBetween(String value1, String value2) {
            addCriterion("param_10_value not between", value1, value2, "param10Value");
            return (Criteria) this;
        }

        public Criteria andParam10RuleIsNull() {
            addCriterion("param_10_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam10RuleIsNotNull() {
            addCriterion("param_10_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam10RuleEqualTo(Integer value) {
            addCriterion("param_10_rule =", value, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleNotEqualTo(Integer value) {
            addCriterion("param_10_rule <>", value, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleGreaterThan(Integer value) {
            addCriterion("param_10_rule >", value, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_10_rule >=", value, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleLessThan(Integer value) {
            addCriterion("param_10_rule <", value, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_10_rule <=", value, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleIn(List<Integer> values) {
            addCriterion("param_10_rule in", values, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleNotIn(List<Integer> values) {
            addCriterion("param_10_rule not in", values, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_10_rule between", value1, value2, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam10RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_10_rule not between", value1, value2, "param10Rule");
            return (Criteria) this;
        }

        public Criteria andParam11IsNull() {
            addCriterion("param_11 is null");
            return (Criteria) this;
        }

        public Criteria andParam11IsNotNull() {
            addCriterion("param_11 is not null");
            return (Criteria) this;
        }

        public Criteria andParam11EqualTo(String value) {
            addCriterion("param_11 =", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11NotEqualTo(String value) {
            addCriterion("param_11 <>", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11GreaterThan(String value) {
            addCriterion("param_11 >", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11GreaterThanOrEqualTo(String value) {
            addCriterion("param_11 >=", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11LessThan(String value) {
            addCriterion("param_11 <", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11LessThanOrEqualTo(String value) {
            addCriterion("param_11 <=", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11Like(String value) {
            addCriterion("param_11 like", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11NotLike(String value) {
            addCriterion("param_11 not like", value, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11In(List<String> values) {
            addCriterion("param_11 in", values, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11NotIn(List<String> values) {
            addCriterion("param_11 not in", values, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11Between(String value1, String value2) {
            addCriterion("param_11 between", value1, value2, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11NotBetween(String value1, String value2) {
            addCriterion("param_11 not between", value1, value2, "param11");
            return (Criteria) this;
        }

        public Criteria andParam11ValueIsNull() {
            addCriterion("param_11_value is null");
            return (Criteria) this;
        }

        public Criteria andParam11ValueIsNotNull() {
            addCriterion("param_11_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam11ValueEqualTo(String value) {
            addCriterion("param_11_value =", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueNotEqualTo(String value) {
            addCriterion("param_11_value <>", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueGreaterThan(String value) {
            addCriterion("param_11_value >", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_11_value >=", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueLessThan(String value) {
            addCriterion("param_11_value <", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueLessThanOrEqualTo(String value) {
            addCriterion("param_11_value <=", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueLike(String value) {
            addCriterion("param_11_value like", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueNotLike(String value) {
            addCriterion("param_11_value not like", value, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueIn(List<String> values) {
            addCriterion("param_11_value in", values, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueNotIn(List<String> values) {
            addCriterion("param_11_value not in", values, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueBetween(String value1, String value2) {
            addCriterion("param_11_value between", value1, value2, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11ValueNotBetween(String value1, String value2) {
            addCriterion("param_11_value not between", value1, value2, "param11Value");
            return (Criteria) this;
        }

        public Criteria andParam11RuleIsNull() {
            addCriterion("param_11_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam11RuleIsNotNull() {
            addCriterion("param_11_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam11RuleEqualTo(Integer value) {
            addCriterion("param_11_rule =", value, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleNotEqualTo(Integer value) {
            addCriterion("param_11_rule <>", value, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleGreaterThan(Integer value) {
            addCriterion("param_11_rule >", value, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_11_rule >=", value, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleLessThan(Integer value) {
            addCriterion("param_11_rule <", value, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_11_rule <=", value, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleIn(List<Integer> values) {
            addCriterion("param_11_rule in", values, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleNotIn(List<Integer> values) {
            addCriterion("param_11_rule not in", values, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_11_rule between", value1, value2, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam11RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_11_rule not between", value1, value2, "param11Rule");
            return (Criteria) this;
        }

        public Criteria andParam12IsNull() {
            addCriterion("param_12 is null");
            return (Criteria) this;
        }

        public Criteria andParam12IsNotNull() {
            addCriterion("param_12 is not null");
            return (Criteria) this;
        }

        public Criteria andParam12EqualTo(String value) {
            addCriterion("param_12 =", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12NotEqualTo(String value) {
            addCriterion("param_12 <>", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12GreaterThan(String value) {
            addCriterion("param_12 >", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12GreaterThanOrEqualTo(String value) {
            addCriterion("param_12 >=", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12LessThan(String value) {
            addCriterion("param_12 <", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12LessThanOrEqualTo(String value) {
            addCriterion("param_12 <=", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12Like(String value) {
            addCriterion("param_12 like", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12NotLike(String value) {
            addCriterion("param_12 not like", value, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12In(List<String> values) {
            addCriterion("param_12 in", values, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12NotIn(List<String> values) {
            addCriterion("param_12 not in", values, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12Between(String value1, String value2) {
            addCriterion("param_12 between", value1, value2, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12NotBetween(String value1, String value2) {
            addCriterion("param_12 not between", value1, value2, "param12");
            return (Criteria) this;
        }

        public Criteria andParam12ValueIsNull() {
            addCriterion("param_12_value is null");
            return (Criteria) this;
        }

        public Criteria andParam12ValueIsNotNull() {
            addCriterion("param_12_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam12ValueEqualTo(String value) {
            addCriterion("param_12_value =", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueNotEqualTo(String value) {
            addCriterion("param_12_value <>", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueGreaterThan(String value) {
            addCriterion("param_12_value >", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_12_value >=", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueLessThan(String value) {
            addCriterion("param_12_value <", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueLessThanOrEqualTo(String value) {
            addCriterion("param_12_value <=", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueLike(String value) {
            addCriterion("param_12_value like", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueNotLike(String value) {
            addCriterion("param_12_value not like", value, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueIn(List<String> values) {
            addCriterion("param_12_value in", values, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueNotIn(List<String> values) {
            addCriterion("param_12_value not in", values, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueBetween(String value1, String value2) {
            addCriterion("param_12_value between", value1, value2, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12ValueNotBetween(String value1, String value2) {
            addCriterion("param_12_value not between", value1, value2, "param12Value");
            return (Criteria) this;
        }

        public Criteria andParam12RuleIsNull() {
            addCriterion("param_12_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam12RuleIsNotNull() {
            addCriterion("param_12_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam12RuleEqualTo(Integer value) {
            addCriterion("param_12_rule =", value, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleNotEqualTo(Integer value) {
            addCriterion("param_12_rule <>", value, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleGreaterThan(Integer value) {
            addCriterion("param_12_rule >", value, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_12_rule >=", value, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleLessThan(Integer value) {
            addCriterion("param_12_rule <", value, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_12_rule <=", value, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleIn(List<Integer> values) {
            addCriterion("param_12_rule in", values, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleNotIn(List<Integer> values) {
            addCriterion("param_12_rule not in", values, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_12_rule between", value1, value2, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam12RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_12_rule not between", value1, value2, "param12Rule");
            return (Criteria) this;
        }

        public Criteria andParam13IsNull() {
            addCriterion("param_13 is null");
            return (Criteria) this;
        }

        public Criteria andParam13IsNotNull() {
            addCriterion("param_13 is not null");
            return (Criteria) this;
        }

        public Criteria andParam13EqualTo(String value) {
            addCriterion("param_13 =", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13NotEqualTo(String value) {
            addCriterion("param_13 <>", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13GreaterThan(String value) {
            addCriterion("param_13 >", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13GreaterThanOrEqualTo(String value) {
            addCriterion("param_13 >=", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13LessThan(String value) {
            addCriterion("param_13 <", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13LessThanOrEqualTo(String value) {
            addCriterion("param_13 <=", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13Like(String value) {
            addCriterion("param_13 like", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13NotLike(String value) {
            addCriterion("param_13 not like", value, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13In(List<String> values) {
            addCriterion("param_13 in", values, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13NotIn(List<String> values) {
            addCriterion("param_13 not in", values, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13Between(String value1, String value2) {
            addCriterion("param_13 between", value1, value2, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13NotBetween(String value1, String value2) {
            addCriterion("param_13 not between", value1, value2, "param13");
            return (Criteria) this;
        }

        public Criteria andParam13ValueIsNull() {
            addCriterion("param_13_value is null");
            return (Criteria) this;
        }

        public Criteria andParam13ValueIsNotNull() {
            addCriterion("param_13_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam13ValueEqualTo(String value) {
            addCriterion("param_13_value =", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueNotEqualTo(String value) {
            addCriterion("param_13_value <>", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueGreaterThan(String value) {
            addCriterion("param_13_value >", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_13_value >=", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueLessThan(String value) {
            addCriterion("param_13_value <", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueLessThanOrEqualTo(String value) {
            addCriterion("param_13_value <=", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueLike(String value) {
            addCriterion("param_13_value like", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueNotLike(String value) {
            addCriterion("param_13_value not like", value, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueIn(List<String> values) {
            addCriterion("param_13_value in", values, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueNotIn(List<String> values) {
            addCriterion("param_13_value not in", values, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueBetween(String value1, String value2) {
            addCriterion("param_13_value between", value1, value2, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13ValueNotBetween(String value1, String value2) {
            addCriterion("param_13_value not between", value1, value2, "param13Value");
            return (Criteria) this;
        }

        public Criteria andParam13RuleIsNull() {
            addCriterion("param_13_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam13RuleIsNotNull() {
            addCriterion("param_13_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam13RuleEqualTo(Integer value) {
            addCriterion("param_13_rule =", value, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleNotEqualTo(Integer value) {
            addCriterion("param_13_rule <>", value, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleGreaterThan(Integer value) {
            addCriterion("param_13_rule >", value, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_13_rule >=", value, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleLessThan(Integer value) {
            addCriterion("param_13_rule <", value, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_13_rule <=", value, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleIn(List<Integer> values) {
            addCriterion("param_13_rule in", values, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleNotIn(List<Integer> values) {
            addCriterion("param_13_rule not in", values, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_13_rule between", value1, value2, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam13RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_13_rule not between", value1, value2, "param13Rule");
            return (Criteria) this;
        }

        public Criteria andParam14IsNull() {
            addCriterion("param_14 is null");
            return (Criteria) this;
        }

        public Criteria andParam14IsNotNull() {
            addCriterion("param_14 is not null");
            return (Criteria) this;
        }

        public Criteria andParam14EqualTo(String value) {
            addCriterion("param_14 =", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14NotEqualTo(String value) {
            addCriterion("param_14 <>", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14GreaterThan(String value) {
            addCriterion("param_14 >", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14GreaterThanOrEqualTo(String value) {
            addCriterion("param_14 >=", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14LessThan(String value) {
            addCriterion("param_14 <", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14LessThanOrEqualTo(String value) {
            addCriterion("param_14 <=", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14Like(String value) {
            addCriterion("param_14 like", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14NotLike(String value) {
            addCriterion("param_14 not like", value, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14In(List<String> values) {
            addCriterion("param_14 in", values, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14NotIn(List<String> values) {
            addCriterion("param_14 not in", values, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14Between(String value1, String value2) {
            addCriterion("param_14 between", value1, value2, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14NotBetween(String value1, String value2) {
            addCriterion("param_14 not between", value1, value2, "param14");
            return (Criteria) this;
        }

        public Criteria andParam14ValueIsNull() {
            addCriterion("param_14_value is null");
            return (Criteria) this;
        }

        public Criteria andParam14ValueIsNotNull() {
            addCriterion("param_14_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam14ValueEqualTo(String value) {
            addCriterion("param_14_value =", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueNotEqualTo(String value) {
            addCriterion("param_14_value <>", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueGreaterThan(String value) {
            addCriterion("param_14_value >", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_14_value >=", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueLessThan(String value) {
            addCriterion("param_14_value <", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueLessThanOrEqualTo(String value) {
            addCriterion("param_14_value <=", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueLike(String value) {
            addCriterion("param_14_value like", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueNotLike(String value) {
            addCriterion("param_14_value not like", value, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueIn(List<String> values) {
            addCriterion("param_14_value in", values, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueNotIn(List<String> values) {
            addCriterion("param_14_value not in", values, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueBetween(String value1, String value2) {
            addCriterion("param_14_value between", value1, value2, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14ValueNotBetween(String value1, String value2) {
            addCriterion("param_14_value not between", value1, value2, "param14Value");
            return (Criteria) this;
        }

        public Criteria andParam14RuleIsNull() {
            addCriterion("param_14_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam14RuleIsNotNull() {
            addCriterion("param_14_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam14RuleEqualTo(Integer value) {
            addCriterion("param_14_rule =", value, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleNotEqualTo(Integer value) {
            addCriterion("param_14_rule <>", value, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleGreaterThan(Integer value) {
            addCriterion("param_14_rule >", value, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_14_rule >=", value, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleLessThan(Integer value) {
            addCriterion("param_14_rule <", value, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_14_rule <=", value, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleIn(List<Integer> values) {
            addCriterion("param_14_rule in", values, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleNotIn(List<Integer> values) {
            addCriterion("param_14_rule not in", values, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_14_rule between", value1, value2, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam14RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_14_rule not between", value1, value2, "param14Rule");
            return (Criteria) this;
        }

        public Criteria andParam15IsNull() {
            addCriterion("param_15 is null");
            return (Criteria) this;
        }

        public Criteria andParam15IsNotNull() {
            addCriterion("param_15 is not null");
            return (Criteria) this;
        }

        public Criteria andParam15EqualTo(String value) {
            addCriterion("param_15 =", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15NotEqualTo(String value) {
            addCriterion("param_15 <>", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15GreaterThan(String value) {
            addCriterion("param_15 >", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15GreaterThanOrEqualTo(String value) {
            addCriterion("param_15 >=", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15LessThan(String value) {
            addCriterion("param_15 <", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15LessThanOrEqualTo(String value) {
            addCriterion("param_15 <=", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15Like(String value) {
            addCriterion("param_15 like", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15NotLike(String value) {
            addCriterion("param_15 not like", value, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15In(List<String> values) {
            addCriterion("param_15 in", values, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15NotIn(List<String> values) {
            addCriterion("param_15 not in", values, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15Between(String value1, String value2) {
            addCriterion("param_15 between", value1, value2, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15NotBetween(String value1, String value2) {
            addCriterion("param_15 not between", value1, value2, "param15");
            return (Criteria) this;
        }

        public Criteria andParam15ValueIsNull() {
            addCriterion("param_15_value is null");
            return (Criteria) this;
        }

        public Criteria andParam15ValueIsNotNull() {
            addCriterion("param_15_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam15ValueEqualTo(String value) {
            addCriterion("param_15_value =", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueNotEqualTo(String value) {
            addCriterion("param_15_value <>", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueGreaterThan(String value) {
            addCriterion("param_15_value >", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_15_value >=", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueLessThan(String value) {
            addCriterion("param_15_value <", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueLessThanOrEqualTo(String value) {
            addCriterion("param_15_value <=", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueLike(String value) {
            addCriterion("param_15_value like", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueNotLike(String value) {
            addCriterion("param_15_value not like", value, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueIn(List<String> values) {
            addCriterion("param_15_value in", values, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueNotIn(List<String> values) {
            addCriterion("param_15_value not in", values, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueBetween(String value1, String value2) {
            addCriterion("param_15_value between", value1, value2, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15ValueNotBetween(String value1, String value2) {
            addCriterion("param_15_value not between", value1, value2, "param15Value");
            return (Criteria) this;
        }

        public Criteria andParam15RuleIsNull() {
            addCriterion("param_15_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam15RuleIsNotNull() {
            addCriterion("param_15_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam15RuleEqualTo(Integer value) {
            addCriterion("param_15_rule =", value, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleNotEqualTo(Integer value) {
            addCriterion("param_15_rule <>", value, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleGreaterThan(Integer value) {
            addCriterion("param_15_rule >", value, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_15_rule >=", value, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleLessThan(Integer value) {
            addCriterion("param_15_rule <", value, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_15_rule <=", value, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleIn(List<Integer> values) {
            addCriterion("param_15_rule in", values, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleNotIn(List<Integer> values) {
            addCriterion("param_15_rule not in", values, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_15_rule between", value1, value2, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam15RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_15_rule not between", value1, value2, "param15Rule");
            return (Criteria) this;
        }

        public Criteria andParam16IsNull() {
            addCriterion("param_16 is null");
            return (Criteria) this;
        }

        public Criteria andParam16IsNotNull() {
            addCriterion("param_16 is not null");
            return (Criteria) this;
        }

        public Criteria andParam16EqualTo(String value) {
            addCriterion("param_16 =", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16NotEqualTo(String value) {
            addCriterion("param_16 <>", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16GreaterThan(String value) {
            addCriterion("param_16 >", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16GreaterThanOrEqualTo(String value) {
            addCriterion("param_16 >=", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16LessThan(String value) {
            addCriterion("param_16 <", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16LessThanOrEqualTo(String value) {
            addCriterion("param_16 <=", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16Like(String value) {
            addCriterion("param_16 like", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16NotLike(String value) {
            addCriterion("param_16 not like", value, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16In(List<String> values) {
            addCriterion("param_16 in", values, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16NotIn(List<String> values) {
            addCriterion("param_16 not in", values, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16Between(String value1, String value2) {
            addCriterion("param_16 between", value1, value2, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16NotBetween(String value1, String value2) {
            addCriterion("param_16 not between", value1, value2, "param16");
            return (Criteria) this;
        }

        public Criteria andParam16ValueIsNull() {
            addCriterion("param_16_value is null");
            return (Criteria) this;
        }

        public Criteria andParam16ValueIsNotNull() {
            addCriterion("param_16_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam16ValueEqualTo(String value) {
            addCriterion("param_16_value =", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueNotEqualTo(String value) {
            addCriterion("param_16_value <>", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueGreaterThan(String value) {
            addCriterion("param_16_value >", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_16_value >=", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueLessThan(String value) {
            addCriterion("param_16_value <", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueLessThanOrEqualTo(String value) {
            addCriterion("param_16_value <=", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueLike(String value) {
            addCriterion("param_16_value like", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueNotLike(String value) {
            addCriterion("param_16_value not like", value, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueIn(List<String> values) {
            addCriterion("param_16_value in", values, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueNotIn(List<String> values) {
            addCriterion("param_16_value not in", values, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueBetween(String value1, String value2) {
            addCriterion("param_16_value between", value1, value2, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16ValueNotBetween(String value1, String value2) {
            addCriterion("param_16_value not between", value1, value2, "param16Value");
            return (Criteria) this;
        }

        public Criteria andParam16RuleIsNull() {
            addCriterion("param_16_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam16RuleIsNotNull() {
            addCriterion("param_16_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam16RuleEqualTo(Integer value) {
            addCriterion("param_16_rule =", value, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleNotEqualTo(Integer value) {
            addCriterion("param_16_rule <>", value, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleGreaterThan(Integer value) {
            addCriterion("param_16_rule >", value, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_16_rule >=", value, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleLessThan(Integer value) {
            addCriterion("param_16_rule <", value, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_16_rule <=", value, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleIn(List<Integer> values) {
            addCriterion("param_16_rule in", values, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleNotIn(List<Integer> values) {
            addCriterion("param_16_rule not in", values, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_16_rule between", value1, value2, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam16RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_16_rule not between", value1, value2, "param16Rule");
            return (Criteria) this;
        }

        public Criteria andParam17IsNull() {
            addCriterion("param_17 is null");
            return (Criteria) this;
        }

        public Criteria andParam17IsNotNull() {
            addCriterion("param_17 is not null");
            return (Criteria) this;
        }

        public Criteria andParam17EqualTo(String value) {
            addCriterion("param_17 =", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17NotEqualTo(String value) {
            addCriterion("param_17 <>", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17GreaterThan(String value) {
            addCriterion("param_17 >", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17GreaterThanOrEqualTo(String value) {
            addCriterion("param_17 >=", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17LessThan(String value) {
            addCriterion("param_17 <", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17LessThanOrEqualTo(String value) {
            addCriterion("param_17 <=", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17Like(String value) {
            addCriterion("param_17 like", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17NotLike(String value) {
            addCriterion("param_17 not like", value, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17In(List<String> values) {
            addCriterion("param_17 in", values, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17NotIn(List<String> values) {
            addCriterion("param_17 not in", values, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17Between(String value1, String value2) {
            addCriterion("param_17 between", value1, value2, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17NotBetween(String value1, String value2) {
            addCriterion("param_17 not between", value1, value2, "param17");
            return (Criteria) this;
        }

        public Criteria andParam17ValueIsNull() {
            addCriterion("param_17_value is null");
            return (Criteria) this;
        }

        public Criteria andParam17ValueIsNotNull() {
            addCriterion("param_17_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam17ValueEqualTo(String value) {
            addCriterion("param_17_value =", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueNotEqualTo(String value) {
            addCriterion("param_17_value <>", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueGreaterThan(String value) {
            addCriterion("param_17_value >", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_17_value >=", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueLessThan(String value) {
            addCriterion("param_17_value <", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueLessThanOrEqualTo(String value) {
            addCriterion("param_17_value <=", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueLike(String value) {
            addCriterion("param_17_value like", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueNotLike(String value) {
            addCriterion("param_17_value not like", value, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueIn(List<String> values) {
            addCriterion("param_17_value in", values, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueNotIn(List<String> values) {
            addCriterion("param_17_value not in", values, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueBetween(String value1, String value2) {
            addCriterion("param_17_value between", value1, value2, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17ValueNotBetween(String value1, String value2) {
            addCriterion("param_17_value not between", value1, value2, "param17Value");
            return (Criteria) this;
        }

        public Criteria andParam17RuleIsNull() {
            addCriterion("param_17_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam17RuleIsNotNull() {
            addCriterion("param_17_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam17RuleEqualTo(Integer value) {
            addCriterion("param_17_rule =", value, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleNotEqualTo(Integer value) {
            addCriterion("param_17_rule <>", value, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleGreaterThan(Integer value) {
            addCriterion("param_17_rule >", value, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_17_rule >=", value, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleLessThan(Integer value) {
            addCriterion("param_17_rule <", value, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_17_rule <=", value, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleIn(List<Integer> values) {
            addCriterion("param_17_rule in", values, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleNotIn(List<Integer> values) {
            addCriterion("param_17_rule not in", values, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_17_rule between", value1, value2, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam17RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_17_rule not between", value1, value2, "param17Rule");
            return (Criteria) this;
        }

        public Criteria andParam18IsNull() {
            addCriterion("param_18 is null");
            return (Criteria) this;
        }

        public Criteria andParam18IsNotNull() {
            addCriterion("param_18 is not null");
            return (Criteria) this;
        }

        public Criteria andParam18EqualTo(String value) {
            addCriterion("param_18 =", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18NotEqualTo(String value) {
            addCriterion("param_18 <>", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18GreaterThan(String value) {
            addCriterion("param_18 >", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18GreaterThanOrEqualTo(String value) {
            addCriterion("param_18 >=", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18LessThan(String value) {
            addCriterion("param_18 <", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18LessThanOrEqualTo(String value) {
            addCriterion("param_18 <=", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18Like(String value) {
            addCriterion("param_18 like", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18NotLike(String value) {
            addCriterion("param_18 not like", value, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18In(List<String> values) {
            addCriterion("param_18 in", values, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18NotIn(List<String> values) {
            addCriterion("param_18 not in", values, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18Between(String value1, String value2) {
            addCriterion("param_18 between", value1, value2, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18NotBetween(String value1, String value2) {
            addCriterion("param_18 not between", value1, value2, "param18");
            return (Criteria) this;
        }

        public Criteria andParam18ValueIsNull() {
            addCriterion("param_18_value is null");
            return (Criteria) this;
        }

        public Criteria andParam18ValueIsNotNull() {
            addCriterion("param_18_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam18ValueEqualTo(String value) {
            addCriterion("param_18_value =", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueNotEqualTo(String value) {
            addCriterion("param_18_value <>", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueGreaterThan(String value) {
            addCriterion("param_18_value >", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_18_value >=", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueLessThan(String value) {
            addCriterion("param_18_value <", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueLessThanOrEqualTo(String value) {
            addCriterion("param_18_value <=", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueLike(String value) {
            addCriterion("param_18_value like", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueNotLike(String value) {
            addCriterion("param_18_value not like", value, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueIn(List<String> values) {
            addCriterion("param_18_value in", values, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueNotIn(List<String> values) {
            addCriterion("param_18_value not in", values, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueBetween(String value1, String value2) {
            addCriterion("param_18_value between", value1, value2, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18ValueNotBetween(String value1, String value2) {
            addCriterion("param_18_value not between", value1, value2, "param18Value");
            return (Criteria) this;
        }

        public Criteria andParam18RuleIsNull() {
            addCriterion("param_18_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam18RuleIsNotNull() {
            addCriterion("param_18_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam18RuleEqualTo(Integer value) {
            addCriterion("param_18_rule =", value, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleNotEqualTo(Integer value) {
            addCriterion("param_18_rule <>", value, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleGreaterThan(Integer value) {
            addCriterion("param_18_rule >", value, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_18_rule >=", value, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleLessThan(Integer value) {
            addCriterion("param_18_rule <", value, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_18_rule <=", value, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleIn(List<Integer> values) {
            addCriterion("param_18_rule in", values, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleNotIn(List<Integer> values) {
            addCriterion("param_18_rule not in", values, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_18_rule between", value1, value2, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam18RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_18_rule not between", value1, value2, "param18Rule");
            return (Criteria) this;
        }

        public Criteria andParam19IsNull() {
            addCriterion("param_19 is null");
            return (Criteria) this;
        }

        public Criteria andParam19IsNotNull() {
            addCriterion("param_19 is not null");
            return (Criteria) this;
        }

        public Criteria andParam19EqualTo(String value) {
            addCriterion("param_19 =", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19NotEqualTo(String value) {
            addCriterion("param_19 <>", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19GreaterThan(String value) {
            addCriterion("param_19 >", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19GreaterThanOrEqualTo(String value) {
            addCriterion("param_19 >=", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19LessThan(String value) {
            addCriterion("param_19 <", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19LessThanOrEqualTo(String value) {
            addCriterion("param_19 <=", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19Like(String value) {
            addCriterion("param_19 like", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19NotLike(String value) {
            addCriterion("param_19 not like", value, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19In(List<String> values) {
            addCriterion("param_19 in", values, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19NotIn(List<String> values) {
            addCriterion("param_19 not in", values, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19Between(String value1, String value2) {
            addCriterion("param_19 between", value1, value2, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19NotBetween(String value1, String value2) {
            addCriterion("param_19 not between", value1, value2, "param19");
            return (Criteria) this;
        }

        public Criteria andParam19ValueIsNull() {
            addCriterion("param_19_value is null");
            return (Criteria) this;
        }

        public Criteria andParam19ValueIsNotNull() {
            addCriterion("param_19_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam19ValueEqualTo(String value) {
            addCriterion("param_19_value =", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueNotEqualTo(String value) {
            addCriterion("param_19_value <>", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueGreaterThan(String value) {
            addCriterion("param_19_value >", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_19_value >=", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueLessThan(String value) {
            addCriterion("param_19_value <", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueLessThanOrEqualTo(String value) {
            addCriterion("param_19_value <=", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueLike(String value) {
            addCriterion("param_19_value like", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueNotLike(String value) {
            addCriterion("param_19_value not like", value, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueIn(List<String> values) {
            addCriterion("param_19_value in", values, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueNotIn(List<String> values) {
            addCriterion("param_19_value not in", values, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueBetween(String value1, String value2) {
            addCriterion("param_19_value between", value1, value2, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19ValueNotBetween(String value1, String value2) {
            addCriterion("param_19_value not between", value1, value2, "param19Value");
            return (Criteria) this;
        }

        public Criteria andParam19RuleIsNull() {
            addCriterion("param_19_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam19RuleIsNotNull() {
            addCriterion("param_19_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam19RuleEqualTo(Integer value) {
            addCriterion("param_19_rule =", value, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleNotEqualTo(Integer value) {
            addCriterion("param_19_rule <>", value, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleGreaterThan(Integer value) {
            addCriterion("param_19_rule >", value, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_19_rule >=", value, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleLessThan(Integer value) {
            addCriterion("param_19_rule <", value, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_19_rule <=", value, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleIn(List<Integer> values) {
            addCriterion("param_19_rule in", values, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleNotIn(List<Integer> values) {
            addCriterion("param_19_rule not in", values, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_19_rule between", value1, value2, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam19RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_19_rule not between", value1, value2, "param19Rule");
            return (Criteria) this;
        }

        public Criteria andParam20IsNull() {
            addCriterion("param_20 is null");
            return (Criteria) this;
        }

        public Criteria andParam20IsNotNull() {
            addCriterion("param_20 is not null");
            return (Criteria) this;
        }

        public Criteria andParam20EqualTo(String value) {
            addCriterion("param_20 =", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20NotEqualTo(String value) {
            addCriterion("param_20 <>", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20GreaterThan(String value) {
            addCriterion("param_20 >", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20GreaterThanOrEqualTo(String value) {
            addCriterion("param_20 >=", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20LessThan(String value) {
            addCriterion("param_20 <", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20LessThanOrEqualTo(String value) {
            addCriterion("param_20 <=", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20Like(String value) {
            addCriterion("param_20 like", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20NotLike(String value) {
            addCriterion("param_20 not like", value, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20In(List<String> values) {
            addCriterion("param_20 in", values, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20NotIn(List<String> values) {
            addCriterion("param_20 not in", values, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20Between(String value1, String value2) {
            addCriterion("param_20 between", value1, value2, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20NotBetween(String value1, String value2) {
            addCriterion("param_20 not between", value1, value2, "param20");
            return (Criteria) this;
        }

        public Criteria andParam20ValueIsNull() {
            addCriterion("param_20_value is null");
            return (Criteria) this;
        }

        public Criteria andParam20ValueIsNotNull() {
            addCriterion("param_20_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam20ValueEqualTo(String value) {
            addCriterion("param_20_value =", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueNotEqualTo(String value) {
            addCriterion("param_20_value <>", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueGreaterThan(String value) {
            addCriterion("param_20_value >", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_20_value >=", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueLessThan(String value) {
            addCriterion("param_20_value <", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueLessThanOrEqualTo(String value) {
            addCriterion("param_20_value <=", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueLike(String value) {
            addCriterion("param_20_value like", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueNotLike(String value) {
            addCriterion("param_20_value not like", value, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueIn(List<String> values) {
            addCriterion("param_20_value in", values, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueNotIn(List<String> values) {
            addCriterion("param_20_value not in", values, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueBetween(String value1, String value2) {
            addCriterion("param_20_value between", value1, value2, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20ValueNotBetween(String value1, String value2) {
            addCriterion("param_20_value not between", value1, value2, "param20Value");
            return (Criteria) this;
        }

        public Criteria andParam20RuleIsNull() {
            addCriterion("param_20_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam20RuleIsNotNull() {
            addCriterion("param_20_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam20RuleEqualTo(Integer value) {
            addCriterion("param_20_rule =", value, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleNotEqualTo(Integer value) {
            addCriterion("param_20_rule <>", value, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleGreaterThan(Integer value) {
            addCriterion("param_20_rule >", value, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_20_rule >=", value, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleLessThan(Integer value) {
            addCriterion("param_20_rule <", value, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_20_rule <=", value, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleIn(List<Integer> values) {
            addCriterion("param_20_rule in", values, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleNotIn(List<Integer> values) {
            addCriterion("param_20_rule not in", values, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_20_rule between", value1, value2, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam20RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_20_rule not between", value1, value2, "param20Rule");
            return (Criteria) this;
        }

        public Criteria andParam21IsNull() {
            addCriterion("param_21 is null");
            return (Criteria) this;
        }

        public Criteria andParam21IsNotNull() {
            addCriterion("param_21 is not null");
            return (Criteria) this;
        }

        public Criteria andParam21EqualTo(String value) {
            addCriterion("param_21 =", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21NotEqualTo(String value) {
            addCriterion("param_21 <>", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21GreaterThan(String value) {
            addCriterion("param_21 >", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21GreaterThanOrEqualTo(String value) {
            addCriterion("param_21 >=", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21LessThan(String value) {
            addCriterion("param_21 <", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21LessThanOrEqualTo(String value) {
            addCriterion("param_21 <=", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21Like(String value) {
            addCriterion("param_21 like", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21NotLike(String value) {
            addCriterion("param_21 not like", value, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21In(List<String> values) {
            addCriterion("param_21 in", values, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21NotIn(List<String> values) {
            addCriterion("param_21 not in", values, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21Between(String value1, String value2) {
            addCriterion("param_21 between", value1, value2, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21NotBetween(String value1, String value2) {
            addCriterion("param_21 not between", value1, value2, "param21");
            return (Criteria) this;
        }

        public Criteria andParam21ValueIsNull() {
            addCriterion("param_21_value is null");
            return (Criteria) this;
        }

        public Criteria andParam21ValueIsNotNull() {
            addCriterion("param_21_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam21ValueEqualTo(String value) {
            addCriterion("param_21_value =", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueNotEqualTo(String value) {
            addCriterion("param_21_value <>", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueGreaterThan(String value) {
            addCriterion("param_21_value >", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_21_value >=", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueLessThan(String value) {
            addCriterion("param_21_value <", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueLessThanOrEqualTo(String value) {
            addCriterion("param_21_value <=", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueLike(String value) {
            addCriterion("param_21_value like", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueNotLike(String value) {
            addCriterion("param_21_value not like", value, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueIn(List<String> values) {
            addCriterion("param_21_value in", values, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueNotIn(List<String> values) {
            addCriterion("param_21_value not in", values, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueBetween(String value1, String value2) {
            addCriterion("param_21_value between", value1, value2, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21ValueNotBetween(String value1, String value2) {
            addCriterion("param_21_value not between", value1, value2, "param21Value");
            return (Criteria) this;
        }

        public Criteria andParam21RuleIsNull() {
            addCriterion("param_21_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam21RuleIsNotNull() {
            addCriterion("param_21_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam21RuleEqualTo(Integer value) {
            addCriterion("param_21_rule =", value, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleNotEqualTo(Integer value) {
            addCriterion("param_21_rule <>", value, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleGreaterThan(Integer value) {
            addCriterion("param_21_rule >", value, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_21_rule >=", value, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleLessThan(Integer value) {
            addCriterion("param_21_rule <", value, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_21_rule <=", value, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleIn(List<Integer> values) {
            addCriterion("param_21_rule in", values, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleNotIn(List<Integer> values) {
            addCriterion("param_21_rule not in", values, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_21_rule between", value1, value2, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam21RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_21_rule not between", value1, value2, "param21Rule");
            return (Criteria) this;
        }

        public Criteria andParam22IsNull() {
            addCriterion("param_22 is null");
            return (Criteria) this;
        }

        public Criteria andParam22IsNotNull() {
            addCriterion("param_22 is not null");
            return (Criteria) this;
        }

        public Criteria andParam22EqualTo(String value) {
            addCriterion("param_22 =", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22NotEqualTo(String value) {
            addCriterion("param_22 <>", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22GreaterThan(String value) {
            addCriterion("param_22 >", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22GreaterThanOrEqualTo(String value) {
            addCriterion("param_22 >=", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22LessThan(String value) {
            addCriterion("param_22 <", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22LessThanOrEqualTo(String value) {
            addCriterion("param_22 <=", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22Like(String value) {
            addCriterion("param_22 like", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22NotLike(String value) {
            addCriterion("param_22 not like", value, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22In(List<String> values) {
            addCriterion("param_22 in", values, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22NotIn(List<String> values) {
            addCriterion("param_22 not in", values, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22Between(String value1, String value2) {
            addCriterion("param_22 between", value1, value2, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22NotBetween(String value1, String value2) {
            addCriterion("param_22 not between", value1, value2, "param22");
            return (Criteria) this;
        }

        public Criteria andParam22ValueIsNull() {
            addCriterion("param_22_value is null");
            return (Criteria) this;
        }

        public Criteria andParam22ValueIsNotNull() {
            addCriterion("param_22_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam22ValueEqualTo(String value) {
            addCriterion("param_22_value =", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueNotEqualTo(String value) {
            addCriterion("param_22_value <>", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueGreaterThan(String value) {
            addCriterion("param_22_value >", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_22_value >=", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueLessThan(String value) {
            addCriterion("param_22_value <", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueLessThanOrEqualTo(String value) {
            addCriterion("param_22_value <=", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueLike(String value) {
            addCriterion("param_22_value like", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueNotLike(String value) {
            addCriterion("param_22_value not like", value, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueIn(List<String> values) {
            addCriterion("param_22_value in", values, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueNotIn(List<String> values) {
            addCriterion("param_22_value not in", values, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueBetween(String value1, String value2) {
            addCriterion("param_22_value between", value1, value2, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22ValueNotBetween(String value1, String value2) {
            addCriterion("param_22_value not between", value1, value2, "param22Value");
            return (Criteria) this;
        }

        public Criteria andParam22RuleIsNull() {
            addCriterion("param_22_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam22RuleIsNotNull() {
            addCriterion("param_22_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam22RuleEqualTo(Integer value) {
            addCriterion("param_22_rule =", value, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleNotEqualTo(Integer value) {
            addCriterion("param_22_rule <>", value, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleGreaterThan(Integer value) {
            addCriterion("param_22_rule >", value, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_22_rule >=", value, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleLessThan(Integer value) {
            addCriterion("param_22_rule <", value, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_22_rule <=", value, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleIn(List<Integer> values) {
            addCriterion("param_22_rule in", values, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleNotIn(List<Integer> values) {
            addCriterion("param_22_rule not in", values, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_22_rule between", value1, value2, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam22RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_22_rule not between", value1, value2, "param22Rule");
            return (Criteria) this;
        }

        public Criteria andParam23IsNull() {
            addCriterion("param_23 is null");
            return (Criteria) this;
        }

        public Criteria andParam23IsNotNull() {
            addCriterion("param_23 is not null");
            return (Criteria) this;
        }

        public Criteria andParam23EqualTo(String value) {
            addCriterion("param_23 =", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23NotEqualTo(String value) {
            addCriterion("param_23 <>", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23GreaterThan(String value) {
            addCriterion("param_23 >", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23GreaterThanOrEqualTo(String value) {
            addCriterion("param_23 >=", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23LessThan(String value) {
            addCriterion("param_23 <", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23LessThanOrEqualTo(String value) {
            addCriterion("param_23 <=", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23Like(String value) {
            addCriterion("param_23 like", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23NotLike(String value) {
            addCriterion("param_23 not like", value, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23In(List<String> values) {
            addCriterion("param_23 in", values, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23NotIn(List<String> values) {
            addCriterion("param_23 not in", values, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23Between(String value1, String value2) {
            addCriterion("param_23 between", value1, value2, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23NotBetween(String value1, String value2) {
            addCriterion("param_23 not between", value1, value2, "param23");
            return (Criteria) this;
        }

        public Criteria andParam23ValueIsNull() {
            addCriterion("param_23_value is null");
            return (Criteria) this;
        }

        public Criteria andParam23ValueIsNotNull() {
            addCriterion("param_23_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam23ValueEqualTo(String value) {
            addCriterion("param_23_value =", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueNotEqualTo(String value) {
            addCriterion("param_23_value <>", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueGreaterThan(String value) {
            addCriterion("param_23_value >", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_23_value >=", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueLessThan(String value) {
            addCriterion("param_23_value <", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueLessThanOrEqualTo(String value) {
            addCriterion("param_23_value <=", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueLike(String value) {
            addCriterion("param_23_value like", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueNotLike(String value) {
            addCriterion("param_23_value not like", value, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueIn(List<String> values) {
            addCriterion("param_23_value in", values, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueNotIn(List<String> values) {
            addCriterion("param_23_value not in", values, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueBetween(String value1, String value2) {
            addCriterion("param_23_value between", value1, value2, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23ValueNotBetween(String value1, String value2) {
            addCriterion("param_23_value not between", value1, value2, "param23Value");
            return (Criteria) this;
        }

        public Criteria andParam23RuleIsNull() {
            addCriterion("param_23_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam23RuleIsNotNull() {
            addCriterion("param_23_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam23RuleEqualTo(Integer value) {
            addCriterion("param_23_rule =", value, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleNotEqualTo(Integer value) {
            addCriterion("param_23_rule <>", value, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleGreaterThan(Integer value) {
            addCriterion("param_23_rule >", value, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_23_rule >=", value, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleLessThan(Integer value) {
            addCriterion("param_23_rule <", value, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_23_rule <=", value, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleIn(List<Integer> values) {
            addCriterion("param_23_rule in", values, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleNotIn(List<Integer> values) {
            addCriterion("param_23_rule not in", values, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_23_rule between", value1, value2, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam23RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_23_rule not between", value1, value2, "param23Rule");
            return (Criteria) this;
        }

        public Criteria andParam24IsNull() {
            addCriterion("param_24 is null");
            return (Criteria) this;
        }

        public Criteria andParam24IsNotNull() {
            addCriterion("param_24 is not null");
            return (Criteria) this;
        }

        public Criteria andParam24EqualTo(String value) {
            addCriterion("param_24 =", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24NotEqualTo(String value) {
            addCriterion("param_24 <>", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24GreaterThan(String value) {
            addCriterion("param_24 >", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24GreaterThanOrEqualTo(String value) {
            addCriterion("param_24 >=", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24LessThan(String value) {
            addCriterion("param_24 <", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24LessThanOrEqualTo(String value) {
            addCriterion("param_24 <=", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24Like(String value) {
            addCriterion("param_24 like", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24NotLike(String value) {
            addCriterion("param_24 not like", value, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24In(List<String> values) {
            addCriterion("param_24 in", values, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24NotIn(List<String> values) {
            addCriterion("param_24 not in", values, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24Between(String value1, String value2) {
            addCriterion("param_24 between", value1, value2, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24NotBetween(String value1, String value2) {
            addCriterion("param_24 not between", value1, value2, "param24");
            return (Criteria) this;
        }

        public Criteria andParam24ValueIsNull() {
            addCriterion("param_24_value is null");
            return (Criteria) this;
        }

        public Criteria andParam24ValueIsNotNull() {
            addCriterion("param_24_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam24ValueEqualTo(String value) {
            addCriterion("param_24_value =", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueNotEqualTo(String value) {
            addCriterion("param_24_value <>", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueGreaterThan(String value) {
            addCriterion("param_24_value >", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_24_value >=", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueLessThan(String value) {
            addCriterion("param_24_value <", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueLessThanOrEqualTo(String value) {
            addCriterion("param_24_value <=", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueLike(String value) {
            addCriterion("param_24_value like", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueNotLike(String value) {
            addCriterion("param_24_value not like", value, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueIn(List<String> values) {
            addCriterion("param_24_value in", values, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueNotIn(List<String> values) {
            addCriterion("param_24_value not in", values, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueBetween(String value1, String value2) {
            addCriterion("param_24_value between", value1, value2, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24ValueNotBetween(String value1, String value2) {
            addCriterion("param_24_value not between", value1, value2, "param24Value");
            return (Criteria) this;
        }

        public Criteria andParam24RuleIsNull() {
            addCriterion("param_24_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam24RuleIsNotNull() {
            addCriterion("param_24_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam24RuleEqualTo(Integer value) {
            addCriterion("param_24_rule =", value, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleNotEqualTo(Integer value) {
            addCriterion("param_24_rule <>", value, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleGreaterThan(Integer value) {
            addCriterion("param_24_rule >", value, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_24_rule >=", value, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleLessThan(Integer value) {
            addCriterion("param_24_rule <", value, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_24_rule <=", value, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleIn(List<Integer> values) {
            addCriterion("param_24_rule in", values, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleNotIn(List<Integer> values) {
            addCriterion("param_24_rule not in", values, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_24_rule between", value1, value2, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam24RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_24_rule not between", value1, value2, "param24Rule");
            return (Criteria) this;
        }

        public Criteria andParam25IsNull() {
            addCriterion("param_25 is null");
            return (Criteria) this;
        }

        public Criteria andParam25IsNotNull() {
            addCriterion("param_25 is not null");
            return (Criteria) this;
        }

        public Criteria andParam25EqualTo(String value) {
            addCriterion("param_25 =", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25NotEqualTo(String value) {
            addCriterion("param_25 <>", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25GreaterThan(String value) {
            addCriterion("param_25 >", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25GreaterThanOrEqualTo(String value) {
            addCriterion("param_25 >=", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25LessThan(String value) {
            addCriterion("param_25 <", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25LessThanOrEqualTo(String value) {
            addCriterion("param_25 <=", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25Like(String value) {
            addCriterion("param_25 like", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25NotLike(String value) {
            addCriterion("param_25 not like", value, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25In(List<String> values) {
            addCriterion("param_25 in", values, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25NotIn(List<String> values) {
            addCriterion("param_25 not in", values, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25Between(String value1, String value2) {
            addCriterion("param_25 between", value1, value2, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25NotBetween(String value1, String value2) {
            addCriterion("param_25 not between", value1, value2, "param25");
            return (Criteria) this;
        }

        public Criteria andParam25ValueIsNull() {
            addCriterion("param_25_value is null");
            return (Criteria) this;
        }

        public Criteria andParam25ValueIsNotNull() {
            addCriterion("param_25_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam25ValueEqualTo(String value) {
            addCriterion("param_25_value =", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueNotEqualTo(String value) {
            addCriterion("param_25_value <>", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueGreaterThan(String value) {
            addCriterion("param_25_value >", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_25_value >=", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueLessThan(String value) {
            addCriterion("param_25_value <", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueLessThanOrEqualTo(String value) {
            addCriterion("param_25_value <=", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueLike(String value) {
            addCriterion("param_25_value like", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueNotLike(String value) {
            addCriterion("param_25_value not like", value, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueIn(List<String> values) {
            addCriterion("param_25_value in", values, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueNotIn(List<String> values) {
            addCriterion("param_25_value not in", values, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueBetween(String value1, String value2) {
            addCriterion("param_25_value between", value1, value2, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25ValueNotBetween(String value1, String value2) {
            addCriterion("param_25_value not between", value1, value2, "param25Value");
            return (Criteria) this;
        }

        public Criteria andParam25RuleIsNull() {
            addCriterion("param_25_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam25RuleIsNotNull() {
            addCriterion("param_25_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam25RuleEqualTo(Integer value) {
            addCriterion("param_25_rule =", value, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleNotEqualTo(Integer value) {
            addCriterion("param_25_rule <>", value, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleGreaterThan(Integer value) {
            addCriterion("param_25_rule >", value, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_25_rule >=", value, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleLessThan(Integer value) {
            addCriterion("param_25_rule <", value, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_25_rule <=", value, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleIn(List<Integer> values) {
            addCriterion("param_25_rule in", values, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleNotIn(List<Integer> values) {
            addCriterion("param_25_rule not in", values, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_25_rule between", value1, value2, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam25RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_25_rule not between", value1, value2, "param25Rule");
            return (Criteria) this;
        }

        public Criteria andParam26IsNull() {
            addCriterion("param_26 is null");
            return (Criteria) this;
        }

        public Criteria andParam26IsNotNull() {
            addCriterion("param_26 is not null");
            return (Criteria) this;
        }

        public Criteria andParam26EqualTo(String value) {
            addCriterion("param_26 =", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26NotEqualTo(String value) {
            addCriterion("param_26 <>", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26GreaterThan(String value) {
            addCriterion("param_26 >", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26GreaterThanOrEqualTo(String value) {
            addCriterion("param_26 >=", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26LessThan(String value) {
            addCriterion("param_26 <", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26LessThanOrEqualTo(String value) {
            addCriterion("param_26 <=", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26Like(String value) {
            addCriterion("param_26 like", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26NotLike(String value) {
            addCriterion("param_26 not like", value, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26In(List<String> values) {
            addCriterion("param_26 in", values, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26NotIn(List<String> values) {
            addCriterion("param_26 not in", values, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26Between(String value1, String value2) {
            addCriterion("param_26 between", value1, value2, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26NotBetween(String value1, String value2) {
            addCriterion("param_26 not between", value1, value2, "param26");
            return (Criteria) this;
        }

        public Criteria andParam26ValueIsNull() {
            addCriterion("param_26_value is null");
            return (Criteria) this;
        }

        public Criteria andParam26ValueIsNotNull() {
            addCriterion("param_26_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam26ValueEqualTo(String value) {
            addCriterion("param_26_value =", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueNotEqualTo(String value) {
            addCriterion("param_26_value <>", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueGreaterThan(String value) {
            addCriterion("param_26_value >", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_26_value >=", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueLessThan(String value) {
            addCriterion("param_26_value <", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueLessThanOrEqualTo(String value) {
            addCriterion("param_26_value <=", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueLike(String value) {
            addCriterion("param_26_value like", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueNotLike(String value) {
            addCriterion("param_26_value not like", value, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueIn(List<String> values) {
            addCriterion("param_26_value in", values, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueNotIn(List<String> values) {
            addCriterion("param_26_value not in", values, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueBetween(String value1, String value2) {
            addCriterion("param_26_value between", value1, value2, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26ValueNotBetween(String value1, String value2) {
            addCriterion("param_26_value not between", value1, value2, "param26Value");
            return (Criteria) this;
        }

        public Criteria andParam26RuleIsNull() {
            addCriterion("param_26_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam26RuleIsNotNull() {
            addCriterion("param_26_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam26RuleEqualTo(Integer value) {
            addCriterion("param_26_rule =", value, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleNotEqualTo(Integer value) {
            addCriterion("param_26_rule <>", value, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleGreaterThan(Integer value) {
            addCriterion("param_26_rule >", value, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_26_rule >=", value, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleLessThan(Integer value) {
            addCriterion("param_26_rule <", value, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_26_rule <=", value, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleIn(List<Integer> values) {
            addCriterion("param_26_rule in", values, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleNotIn(List<Integer> values) {
            addCriterion("param_26_rule not in", values, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_26_rule between", value1, value2, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam26RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_26_rule not between", value1, value2, "param26Rule");
            return (Criteria) this;
        }

        public Criteria andParam27IsNull() {
            addCriterion("param_27 is null");
            return (Criteria) this;
        }

        public Criteria andParam27IsNotNull() {
            addCriterion("param_27 is not null");
            return (Criteria) this;
        }

        public Criteria andParam27EqualTo(String value) {
            addCriterion("param_27 =", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27NotEqualTo(String value) {
            addCriterion("param_27 <>", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27GreaterThan(String value) {
            addCriterion("param_27 >", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27GreaterThanOrEqualTo(String value) {
            addCriterion("param_27 >=", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27LessThan(String value) {
            addCriterion("param_27 <", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27LessThanOrEqualTo(String value) {
            addCriterion("param_27 <=", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27Like(String value) {
            addCriterion("param_27 like", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27NotLike(String value) {
            addCriterion("param_27 not like", value, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27In(List<String> values) {
            addCriterion("param_27 in", values, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27NotIn(List<String> values) {
            addCriterion("param_27 not in", values, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27Between(String value1, String value2) {
            addCriterion("param_27 between", value1, value2, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27NotBetween(String value1, String value2) {
            addCriterion("param_27 not between", value1, value2, "param27");
            return (Criteria) this;
        }

        public Criteria andParam27ValueIsNull() {
            addCriterion("param_27_value is null");
            return (Criteria) this;
        }

        public Criteria andParam27ValueIsNotNull() {
            addCriterion("param_27_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam27ValueEqualTo(String value) {
            addCriterion("param_27_value =", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueNotEqualTo(String value) {
            addCriterion("param_27_value <>", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueGreaterThan(String value) {
            addCriterion("param_27_value >", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_27_value >=", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueLessThan(String value) {
            addCriterion("param_27_value <", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueLessThanOrEqualTo(String value) {
            addCriterion("param_27_value <=", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueLike(String value) {
            addCriterion("param_27_value like", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueNotLike(String value) {
            addCriterion("param_27_value not like", value, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueIn(List<String> values) {
            addCriterion("param_27_value in", values, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueNotIn(List<String> values) {
            addCriterion("param_27_value not in", values, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueBetween(String value1, String value2) {
            addCriterion("param_27_value between", value1, value2, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27ValueNotBetween(String value1, String value2) {
            addCriterion("param_27_value not between", value1, value2, "param27Value");
            return (Criteria) this;
        }

        public Criteria andParam27RuleIsNull() {
            addCriterion("param_27_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam27RuleIsNotNull() {
            addCriterion("param_27_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam27RuleEqualTo(Integer value) {
            addCriterion("param_27_rule =", value, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleNotEqualTo(Integer value) {
            addCriterion("param_27_rule <>", value, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleGreaterThan(Integer value) {
            addCriterion("param_27_rule >", value, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_27_rule >=", value, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleLessThan(Integer value) {
            addCriterion("param_27_rule <", value, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_27_rule <=", value, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleIn(List<Integer> values) {
            addCriterion("param_27_rule in", values, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleNotIn(List<Integer> values) {
            addCriterion("param_27_rule not in", values, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_27_rule between", value1, value2, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam27RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_27_rule not between", value1, value2, "param27Rule");
            return (Criteria) this;
        }

        public Criteria andParam28IsNull() {
            addCriterion("param_28 is null");
            return (Criteria) this;
        }

        public Criteria andParam28IsNotNull() {
            addCriterion("param_28 is not null");
            return (Criteria) this;
        }

        public Criteria andParam28EqualTo(String value) {
            addCriterion("param_28 =", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28NotEqualTo(String value) {
            addCriterion("param_28 <>", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28GreaterThan(String value) {
            addCriterion("param_28 >", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28GreaterThanOrEqualTo(String value) {
            addCriterion("param_28 >=", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28LessThan(String value) {
            addCriterion("param_28 <", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28LessThanOrEqualTo(String value) {
            addCriterion("param_28 <=", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28Like(String value) {
            addCriterion("param_28 like", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28NotLike(String value) {
            addCriterion("param_28 not like", value, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28In(List<String> values) {
            addCriterion("param_28 in", values, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28NotIn(List<String> values) {
            addCriterion("param_28 not in", values, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28Between(String value1, String value2) {
            addCriterion("param_28 between", value1, value2, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28NotBetween(String value1, String value2) {
            addCriterion("param_28 not between", value1, value2, "param28");
            return (Criteria) this;
        }

        public Criteria andParam28ValueIsNull() {
            addCriterion("param_28_value is null");
            return (Criteria) this;
        }

        public Criteria andParam28ValueIsNotNull() {
            addCriterion("param_28_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam28ValueEqualTo(String value) {
            addCriterion("param_28_value =", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueNotEqualTo(String value) {
            addCriterion("param_28_value <>", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueGreaterThan(String value) {
            addCriterion("param_28_value >", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_28_value >=", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueLessThan(String value) {
            addCriterion("param_28_value <", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueLessThanOrEqualTo(String value) {
            addCriterion("param_28_value <=", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueLike(String value) {
            addCriterion("param_28_value like", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueNotLike(String value) {
            addCriterion("param_28_value not like", value, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueIn(List<String> values) {
            addCriterion("param_28_value in", values, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueNotIn(List<String> values) {
            addCriterion("param_28_value not in", values, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueBetween(String value1, String value2) {
            addCriterion("param_28_value between", value1, value2, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28ValueNotBetween(String value1, String value2) {
            addCriterion("param_28_value not between", value1, value2, "param28Value");
            return (Criteria) this;
        }

        public Criteria andParam28RuleIsNull() {
            addCriterion("param_28_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam28RuleIsNotNull() {
            addCriterion("param_28_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam28RuleEqualTo(Integer value) {
            addCriterion("param_28_rule =", value, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleNotEqualTo(Integer value) {
            addCriterion("param_28_rule <>", value, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleGreaterThan(Integer value) {
            addCriterion("param_28_rule >", value, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_28_rule >=", value, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleLessThan(Integer value) {
            addCriterion("param_28_rule <", value, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_28_rule <=", value, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleIn(List<Integer> values) {
            addCriterion("param_28_rule in", values, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleNotIn(List<Integer> values) {
            addCriterion("param_28_rule not in", values, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_28_rule between", value1, value2, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam28RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_28_rule not between", value1, value2, "param28Rule");
            return (Criteria) this;
        }

        public Criteria andParam29IsNull() {
            addCriterion("param_29 is null");
            return (Criteria) this;
        }

        public Criteria andParam29IsNotNull() {
            addCriterion("param_29 is not null");
            return (Criteria) this;
        }

        public Criteria andParam29EqualTo(String value) {
            addCriterion("param_29 =", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29NotEqualTo(String value) {
            addCriterion("param_29 <>", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29GreaterThan(String value) {
            addCriterion("param_29 >", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29GreaterThanOrEqualTo(String value) {
            addCriterion("param_29 >=", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29LessThan(String value) {
            addCriterion("param_29 <", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29LessThanOrEqualTo(String value) {
            addCriterion("param_29 <=", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29Like(String value) {
            addCriterion("param_29 like", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29NotLike(String value) {
            addCriterion("param_29 not like", value, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29In(List<String> values) {
            addCriterion("param_29 in", values, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29NotIn(List<String> values) {
            addCriterion("param_29 not in", values, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29Between(String value1, String value2) {
            addCriterion("param_29 between", value1, value2, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29NotBetween(String value1, String value2) {
            addCriterion("param_29 not between", value1, value2, "param29");
            return (Criteria) this;
        }

        public Criteria andParam29ValueIsNull() {
            addCriterion("param_29_value is null");
            return (Criteria) this;
        }

        public Criteria andParam29ValueIsNotNull() {
            addCriterion("param_29_value is not null");
            return (Criteria) this;
        }

        public Criteria andParam29ValueEqualTo(String value) {
            addCriterion("param_29_value =", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueNotEqualTo(String value) {
            addCriterion("param_29_value <>", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueGreaterThan(String value) {
            addCriterion("param_29_value >", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_29_value >=", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueLessThan(String value) {
            addCriterion("param_29_value <", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueLessThanOrEqualTo(String value) {
            addCriterion("param_29_value <=", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueLike(String value) {
            addCriterion("param_29_value like", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueNotLike(String value) {
            addCriterion("param_29_value not like", value, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueIn(List<String> values) {
            addCriterion("param_29_value in", values, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueNotIn(List<String> values) {
            addCriterion("param_29_value not in", values, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueBetween(String value1, String value2) {
            addCriterion("param_29_value between", value1, value2, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29ValueNotBetween(String value1, String value2) {
            addCriterion("param_29_value not between", value1, value2, "param29Value");
            return (Criteria) this;
        }

        public Criteria andParam29RuleIsNull() {
            addCriterion("param_29_rule is null");
            return (Criteria) this;
        }

        public Criteria andParam29RuleIsNotNull() {
            addCriterion("param_29_rule is not null");
            return (Criteria) this;
        }

        public Criteria andParam29RuleEqualTo(Integer value) {
            addCriterion("param_29_rule =", value, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleNotEqualTo(Integer value) {
            addCriterion("param_29_rule <>", value, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleGreaterThan(Integer value) {
            addCriterion("param_29_rule >", value, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_29_rule >=", value, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleLessThan(Integer value) {
            addCriterion("param_29_rule <", value, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleLessThanOrEqualTo(Integer value) {
            addCriterion("param_29_rule <=", value, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleIn(List<Integer> values) {
            addCriterion("param_29_rule in", values, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleNotIn(List<Integer> values) {
            addCriterion("param_29_rule not in", values, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleBetween(Integer value1, Integer value2) {
            addCriterion("param_29_rule between", value1, value2, "param29Rule");
            return (Criteria) this;
        }

        public Criteria andParam29RuleNotBetween(Integer value1, Integer value2) {
            addCriterion("param_29_rule not between", value1, value2, "param29Rule");
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