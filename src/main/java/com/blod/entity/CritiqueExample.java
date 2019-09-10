package com.blod.entity;

import java.util.ArrayList;
import java.util.List;

public class CritiqueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CritiqueExample() {
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

        public Criteria andCtIdIsNull() {
            addCriterion("ct_id is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("ct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(Integer value) {
            addCriterion("ct_id =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(Integer value) {
            addCriterion("ct_id <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(Integer value) {
            addCriterion("ct_id >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_id >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(Integer value) {
            addCriterion("ct_id <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_id <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<Integer> values) {
            addCriterion("ct_id in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<Integer> values) {
            addCriterion("ct_id not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_id between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_id not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdIsNull() {
            addCriterion("ct_art_id is null");
            return (Criteria) this;
        }

        public Criteria andCtArtIdIsNotNull() {
            addCriterion("ct_art_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtArtIdEqualTo(Integer value) {
            addCriterion("ct_art_id =", value, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdNotEqualTo(Integer value) {
            addCriterion("ct_art_id <>", value, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdGreaterThan(Integer value) {
            addCriterion("ct_art_id >", value, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ct_art_id >=", value, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdLessThan(Integer value) {
            addCriterion("ct_art_id <", value, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ct_art_id <=", value, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdIn(List<Integer> values) {
            addCriterion("ct_art_id in", values, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdNotIn(List<Integer> values) {
            addCriterion("ct_art_id not in", values, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdBetween(Integer value1, Integer value2) {
            addCriterion("ct_art_id between", value1, value2, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ct_art_id not between", value1, value2, "ctArtId");
            return (Criteria) this;
        }

        public Criteria andCtTimeIsNull() {
            addCriterion("ct_time is null");
            return (Criteria) this;
        }

        public Criteria andCtTimeIsNotNull() {
            addCriterion("ct_time is not null");
            return (Criteria) this;
        }

        public Criteria andCtTimeEqualTo(String value) {
            addCriterion("ct_time =", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeNotEqualTo(String value) {
            addCriterion("ct_time <>", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeGreaterThan(String value) {
            addCriterion("ct_time >", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ct_time >=", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeLessThan(String value) {
            addCriterion("ct_time <", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeLessThanOrEqualTo(String value) {
            addCriterion("ct_time <=", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeLike(String value) {
            addCriterion("ct_time like", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeNotLike(String value) {
            addCriterion("ct_time not like", value, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeIn(List<String> values) {
            addCriterion("ct_time in", values, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeNotIn(List<String> values) {
            addCriterion("ct_time not in", values, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeBetween(String value1, String value2) {
            addCriterion("ct_time between", value1, value2, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtTimeNotBetween(String value1, String value2) {
            addCriterion("ct_time not between", value1, value2, "ctTime");
            return (Criteria) this;
        }

        public Criteria andCtUsernameIsNull() {
            addCriterion("ct_username is null");
            return (Criteria) this;
        }

        public Criteria andCtUsernameIsNotNull() {
            addCriterion("ct_username is not null");
            return (Criteria) this;
        }

        public Criteria andCtUsernameEqualTo(String value) {
            addCriterion("ct_username =", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotEqualTo(String value) {
            addCriterion("ct_username <>", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameGreaterThan(String value) {
            addCriterion("ct_username >", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("ct_username >=", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameLessThan(String value) {
            addCriterion("ct_username <", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameLessThanOrEqualTo(String value) {
            addCriterion("ct_username <=", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameLike(String value) {
            addCriterion("ct_username like", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotLike(String value) {
            addCriterion("ct_username not like", value, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameIn(List<String> values) {
            addCriterion("ct_username in", values, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotIn(List<String> values) {
            addCriterion("ct_username not in", values, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameBetween(String value1, String value2) {
            addCriterion("ct_username between", value1, value2, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtUsernameNotBetween(String value1, String value2) {
            addCriterion("ct_username not between", value1, value2, "ctUsername");
            return (Criteria) this;
        }

        public Criteria andCtEmailIsNull() {
            addCriterion("ct_email is null");
            return (Criteria) this;
        }

        public Criteria andCtEmailIsNotNull() {
            addCriterion("ct_email is not null");
            return (Criteria) this;
        }

        public Criteria andCtEmailEqualTo(String value) {
            addCriterion("ct_email =", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotEqualTo(String value) {
            addCriterion("ct_email <>", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailGreaterThan(String value) {
            addCriterion("ct_email >", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ct_email >=", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailLessThan(String value) {
            addCriterion("ct_email <", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailLessThanOrEqualTo(String value) {
            addCriterion("ct_email <=", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailLike(String value) {
            addCriterion("ct_email like", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotLike(String value) {
            addCriterion("ct_email not like", value, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailIn(List<String> values) {
            addCriterion("ct_email in", values, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotIn(List<String> values) {
            addCriterion("ct_email not in", values, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailBetween(String value1, String value2) {
            addCriterion("ct_email between", value1, value2, "ctEmail");
            return (Criteria) this;
        }

        public Criteria andCtEmailNotBetween(String value1, String value2) {
            addCriterion("ct_email not between", value1, value2, "ctEmail");
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