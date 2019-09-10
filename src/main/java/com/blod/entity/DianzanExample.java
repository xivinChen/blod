package com.blod.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DianzanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DianzanExample() {
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

        public Criteria andCkIdIsNull() {
            addCriterion("ck_id is null");
            return (Criteria) this;
        }

        public Criteria andCkIdIsNotNull() {
            addCriterion("ck_id is not null");
            return (Criteria) this;
        }

        public Criteria andCkIdEqualTo(Integer value) {
            addCriterion("ck_id =", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotEqualTo(Integer value) {
            addCriterion("ck_id <>", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdGreaterThan(Integer value) {
            addCriterion("ck_id >", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ck_id >=", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdLessThan(Integer value) {
            addCriterion("ck_id <", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdLessThanOrEqualTo(Integer value) {
            addCriterion("ck_id <=", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdIn(List<Integer> values) {
            addCriterion("ck_id in", values, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotIn(List<Integer> values) {
            addCriterion("ck_id not in", values, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdBetween(Integer value1, Integer value2) {
            addCriterion("ck_id between", value1, value2, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ck_id not between", value1, value2, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdIsNull() {
            addCriterion("ck_art_id is null");
            return (Criteria) this;
        }

        public Criteria andCkArtIdIsNotNull() {
            addCriterion("ck_art_id is not null");
            return (Criteria) this;
        }

        public Criteria andCkArtIdEqualTo(String value) {
            addCriterion("ck_art_id =", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdNotEqualTo(String value) {
            addCriterion("ck_art_id <>", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdGreaterThan(String value) {
            addCriterion("ck_art_id >", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdGreaterThanOrEqualTo(String value) {
            addCriterion("ck_art_id >=", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdLessThan(String value) {
            addCriterion("ck_art_id <", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdLessThanOrEqualTo(String value) {
            addCriterion("ck_art_id <=", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdLike(String value) {
            addCriterion("ck_art_id like", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdNotLike(String value) {
            addCriterion("ck_art_id not like", value, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdIn(List<String> values) {
            addCriterion("ck_art_id in", values, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdNotIn(List<String> values) {
            addCriterion("ck_art_id not in", values, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdBetween(String value1, String value2) {
            addCriterion("ck_art_id between", value1, value2, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkArtIdNotBetween(String value1, String value2) {
            addCriterion("ck_art_id not between", value1, value2, "ckArtId");
            return (Criteria) this;
        }

        public Criteria andCkIpIsNull() {
            addCriterion("ck_ip is null");
            return (Criteria) this;
        }

        public Criteria andCkIpIsNotNull() {
            addCriterion("ck_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCkIpEqualTo(String value) {
            addCriterion("ck_ip =", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpNotEqualTo(String value) {
            addCriterion("ck_ip <>", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpGreaterThan(String value) {
            addCriterion("ck_ip >", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpGreaterThanOrEqualTo(String value) {
            addCriterion("ck_ip >=", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpLessThan(String value) {
            addCriterion("ck_ip <", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpLessThanOrEqualTo(String value) {
            addCriterion("ck_ip <=", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpLike(String value) {
            addCriterion("ck_ip like", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpNotLike(String value) {
            addCriterion("ck_ip not like", value, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpIn(List<String> values) {
            addCriterion("ck_ip in", values, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpNotIn(List<String> values) {
            addCriterion("ck_ip not in", values, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpBetween(String value1, String value2) {
            addCriterion("ck_ip between", value1, value2, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkIpNotBetween(String value1, String value2) {
            addCriterion("ck_ip not between", value1, value2, "ckIp");
            return (Criteria) this;
        }

        public Criteria andCkTimeIsNull() {
            addCriterion("ck_time is null");
            return (Criteria) this;
        }

        public Criteria andCkTimeIsNotNull() {
            addCriterion("ck_time is not null");
            return (Criteria) this;
        }

        public Criteria andCkTimeEqualTo(Date value) {
            addCriterion("ck_time =", value, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeNotEqualTo(Date value) {
            addCriterion("ck_time <>", value, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeGreaterThan(Date value) {
            addCriterion("ck_time >", value, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ck_time >=", value, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeLessThan(Date value) {
            addCriterion("ck_time <", value, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeLessThanOrEqualTo(Date value) {
            addCriterion("ck_time <=", value, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeIn(List<Date> values) {
            addCriterion("ck_time in", values, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeNotIn(List<Date> values) {
            addCriterion("ck_time not in", values, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeBetween(Date value1, Date value2) {
            addCriterion("ck_time between", value1, value2, "ckTime");
            return (Criteria) this;
        }

        public Criteria andCkTimeNotBetween(Date value1, Date value2) {
            addCriterion("ck_time not between", value1, value2, "ckTime");
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