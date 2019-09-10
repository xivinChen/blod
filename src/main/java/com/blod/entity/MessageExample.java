package com.blod.entity;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Long value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Long value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Long value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Long value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Long> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Long> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Long value1, Long value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameIsNull() {
            addCriterion("msg_username is null");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameIsNotNull() {
            addCriterion("msg_username is not null");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameEqualTo(String value) {
            addCriterion("msg_username =", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameNotEqualTo(String value) {
            addCriterion("msg_username <>", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameGreaterThan(String value) {
            addCriterion("msg_username >", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("msg_username >=", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameLessThan(String value) {
            addCriterion("msg_username <", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameLessThanOrEqualTo(String value) {
            addCriterion("msg_username <=", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameLike(String value) {
            addCriterion("msg_username like", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameNotLike(String value) {
            addCriterion("msg_username not like", value, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameIn(List<String> values) {
            addCriterion("msg_username in", values, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameNotIn(List<String> values) {
            addCriterion("msg_username not in", values, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameBetween(String value1, String value2) {
            addCriterion("msg_username between", value1, value2, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgUsernameNotBetween(String value1, String value2) {
            addCriterion("msg_username not between", value1, value2, "msgUsername");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIsNull() {
            addCriterion("msg_time is null");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIsNotNull() {
            addCriterion("msg_time is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTimeEqualTo(String value) {
            addCriterion("msg_time =", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotEqualTo(String value) {
            addCriterion("msg_time <>", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeGreaterThan(String value) {
            addCriterion("msg_time >", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_time >=", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLessThan(String value) {
            addCriterion("msg_time <", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLessThanOrEqualTo(String value) {
            addCriterion("msg_time <=", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeLike(String value) {
            addCriterion("msg_time like", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotLike(String value) {
            addCriterion("msg_time not like", value, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeIn(List<String> values) {
            addCriterion("msg_time in", values, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotIn(List<String> values) {
            addCriterion("msg_time not in", values, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeBetween(String value1, String value2) {
            addCriterion("msg_time between", value1, value2, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgTimeNotBetween(String value1, String value2) {
            addCriterion("msg_time not between", value1, value2, "msgTime");
            return (Criteria) this;
        }

        public Criteria andMsgNameIsNull() {
            addCriterion("msg_name is null");
            return (Criteria) this;
        }

        public Criteria andMsgNameIsNotNull() {
            addCriterion("msg_name is not null");
            return (Criteria) this;
        }

        public Criteria andMsgNameEqualTo(String value) {
            addCriterion("msg_name =", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotEqualTo(String value) {
            addCriterion("msg_name <>", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameGreaterThan(String value) {
            addCriterion("msg_name >", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameGreaterThanOrEqualTo(String value) {
            addCriterion("msg_name >=", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameLessThan(String value) {
            addCriterion("msg_name <", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameLessThanOrEqualTo(String value) {
            addCriterion("msg_name <=", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameLike(String value) {
            addCriterion("msg_name like", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotLike(String value) {
            addCriterion("msg_name not like", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameIn(List<String> values) {
            addCriterion("msg_name in", values, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotIn(List<String> values) {
            addCriterion("msg_name not in", values, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameBetween(String value1, String value2) {
            addCriterion("msg_name between", value1, value2, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotBetween(String value1, String value2) {
            addCriterion("msg_name not between", value1, value2, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgEmailIsNull() {
            addCriterion("msg_email is null");
            return (Criteria) this;
        }

        public Criteria andMsgEmailIsNotNull() {
            addCriterion("msg_email is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEmailEqualTo(String value) {
            addCriterion("msg_email =", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailNotEqualTo(String value) {
            addCriterion("msg_email <>", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailGreaterThan(String value) {
            addCriterion("msg_email >", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailGreaterThanOrEqualTo(String value) {
            addCriterion("msg_email >=", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailLessThan(String value) {
            addCriterion("msg_email <", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailLessThanOrEqualTo(String value) {
            addCriterion("msg_email <=", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailLike(String value) {
            addCriterion("msg_email like", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailNotLike(String value) {
            addCriterion("msg_email not like", value, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailIn(List<String> values) {
            addCriterion("msg_email in", values, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailNotIn(List<String> values) {
            addCriterion("msg_email not in", values, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailBetween(String value1, String value2) {
            addCriterion("msg_email between", value1, value2, "msgEmail");
            return (Criteria) this;
        }

        public Criteria andMsgEmailNotBetween(String value1, String value2) {
            addCriterion("msg_email not between", value1, value2, "msgEmail");
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