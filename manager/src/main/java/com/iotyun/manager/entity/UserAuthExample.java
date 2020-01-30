package com.iotyun.manager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAuthExample() {
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

        public Criteria andFun1IsNull() {
            addCriterion("fun_1 is null");
            return (Criteria) this;
        }

        public Criteria andFun1IsNotNull() {
            addCriterion("fun_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFun1EqualTo(String value) {
            addCriterion("fun_1 =", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1NotEqualTo(String value) {
            addCriterion("fun_1 <>", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1GreaterThan(String value) {
            addCriterion("fun_1 >", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1GreaterThanOrEqualTo(String value) {
            addCriterion("fun_1 >=", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1LessThan(String value) {
            addCriterion("fun_1 <", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1LessThanOrEqualTo(String value) {
            addCriterion("fun_1 <=", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1Like(String value) {
            addCriterion("fun_1 like", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1NotLike(String value) {
            addCriterion("fun_1 not like", value, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1In(List<String> values) {
            addCriterion("fun_1 in", values, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1NotIn(List<String> values) {
            addCriterion("fun_1 not in", values, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1Between(String value1, String value2) {
            addCriterion("fun_1 between", value1, value2, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1NotBetween(String value1, String value2) {
            addCriterion("fun_1 not between", value1, value2, "fun1");
            return (Criteria) this;
        }

        public Criteria andFun1EnableIsNull() {
            addCriterion("fun_1_enable is null");
            return (Criteria) this;
        }

        public Criteria andFun1EnableIsNotNull() {
            addCriterion("fun_1_enable is not null");
            return (Criteria) this;
        }

        public Criteria andFun1EnableEqualTo(Boolean value) {
            addCriterion("fun_1_enable =", value, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableNotEqualTo(Boolean value) {
            addCriterion("fun_1_enable <>", value, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableGreaterThan(Boolean value) {
            addCriterion("fun_1_enable >", value, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fun_1_enable >=", value, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableLessThan(Boolean value) {
            addCriterion("fun_1_enable <", value, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableLessThanOrEqualTo(Boolean value) {
            addCriterion("fun_1_enable <=", value, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableIn(List<Boolean> values) {
            addCriterion("fun_1_enable in", values, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableNotIn(List<Boolean> values) {
            addCriterion("fun_1_enable not in", values, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableBetween(Boolean value1, Boolean value2) {
            addCriterion("fun_1_enable between", value1, value2, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun1EnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fun_1_enable not between", value1, value2, "fun1Enable");
            return (Criteria) this;
        }

        public Criteria andFun2IsNull() {
            addCriterion("fun_2 is null");
            return (Criteria) this;
        }

        public Criteria andFun2IsNotNull() {
            addCriterion("fun_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFun2EqualTo(String value) {
            addCriterion("fun_2 =", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2NotEqualTo(String value) {
            addCriterion("fun_2 <>", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2GreaterThan(String value) {
            addCriterion("fun_2 >", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2GreaterThanOrEqualTo(String value) {
            addCriterion("fun_2 >=", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2LessThan(String value) {
            addCriterion("fun_2 <", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2LessThanOrEqualTo(String value) {
            addCriterion("fun_2 <=", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2Like(String value) {
            addCriterion("fun_2 like", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2NotLike(String value) {
            addCriterion("fun_2 not like", value, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2In(List<String> values) {
            addCriterion("fun_2 in", values, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2NotIn(List<String> values) {
            addCriterion("fun_2 not in", values, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2Between(String value1, String value2) {
            addCriterion("fun_2 between", value1, value2, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2NotBetween(String value1, String value2) {
            addCriterion("fun_2 not between", value1, value2, "fun2");
            return (Criteria) this;
        }

        public Criteria andFun2EnableIsNull() {
            addCriterion("fun_2_enable is null");
            return (Criteria) this;
        }

        public Criteria andFun2EnableIsNotNull() {
            addCriterion("fun_2_enable is not null");
            return (Criteria) this;
        }

        public Criteria andFun2EnableEqualTo(Boolean value) {
            addCriterion("fun_2_enable =", value, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableNotEqualTo(Boolean value) {
            addCriterion("fun_2_enable <>", value, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableGreaterThan(Boolean value) {
            addCriterion("fun_2_enable >", value, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fun_2_enable >=", value, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableLessThan(Boolean value) {
            addCriterion("fun_2_enable <", value, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableLessThanOrEqualTo(Boolean value) {
            addCriterion("fun_2_enable <=", value, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableIn(List<Boolean> values) {
            addCriterion("fun_2_enable in", values, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableNotIn(List<Boolean> values) {
            addCriterion("fun_2_enable not in", values, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableBetween(Boolean value1, Boolean value2) {
            addCriterion("fun_2_enable between", value1, value2, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun2EnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fun_2_enable not between", value1, value2, "fun2Enable");
            return (Criteria) this;
        }

        public Criteria andFun3IsNull() {
            addCriterion("fun_3 is null");
            return (Criteria) this;
        }

        public Criteria andFun3IsNotNull() {
            addCriterion("fun_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFun3EqualTo(String value) {
            addCriterion("fun_3 =", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3NotEqualTo(String value) {
            addCriterion("fun_3 <>", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3GreaterThan(String value) {
            addCriterion("fun_3 >", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3GreaterThanOrEqualTo(String value) {
            addCriterion("fun_3 >=", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3LessThan(String value) {
            addCriterion("fun_3 <", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3LessThanOrEqualTo(String value) {
            addCriterion("fun_3 <=", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3Like(String value) {
            addCriterion("fun_3 like", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3NotLike(String value) {
            addCriterion("fun_3 not like", value, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3In(List<String> values) {
            addCriterion("fun_3 in", values, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3NotIn(List<String> values) {
            addCriterion("fun_3 not in", values, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3Between(String value1, String value2) {
            addCriterion("fun_3 between", value1, value2, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3NotBetween(String value1, String value2) {
            addCriterion("fun_3 not between", value1, value2, "fun3");
            return (Criteria) this;
        }

        public Criteria andFun3EnableIsNull() {
            addCriterion("fun_3_enable is null");
            return (Criteria) this;
        }

        public Criteria andFun3EnableIsNotNull() {
            addCriterion("fun_3_enable is not null");
            return (Criteria) this;
        }

        public Criteria andFun3EnableEqualTo(Boolean value) {
            addCriterion("fun_3_enable =", value, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableNotEqualTo(Boolean value) {
            addCriterion("fun_3_enable <>", value, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableGreaterThan(Boolean value) {
            addCriterion("fun_3_enable >", value, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fun_3_enable >=", value, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableLessThan(Boolean value) {
            addCriterion("fun_3_enable <", value, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableLessThanOrEqualTo(Boolean value) {
            addCriterion("fun_3_enable <=", value, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableIn(List<Boolean> values) {
            addCriterion("fun_3_enable in", values, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableNotIn(List<Boolean> values) {
            addCriterion("fun_3_enable not in", values, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableBetween(Boolean value1, Boolean value2) {
            addCriterion("fun_3_enable between", value1, value2, "fun3Enable");
            return (Criteria) this;
        }

        public Criteria andFun3EnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fun_3_enable not between", value1, value2, "fun3Enable");
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