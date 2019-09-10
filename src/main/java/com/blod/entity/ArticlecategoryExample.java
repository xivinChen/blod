package com.blod.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticlecategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlecategoryExample() {
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

        public Criteria andCtgIdIsNull() {
            addCriterion("ctg_id is null");
            return (Criteria) this;
        }

        public Criteria andCtgIdIsNotNull() {
            addCriterion("ctg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtgIdEqualTo(Integer value) {
            addCriterion("ctg_id =", value, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdNotEqualTo(Integer value) {
            addCriterion("ctg_id <>", value, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdGreaterThan(Integer value) {
            addCriterion("ctg_id >", value, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctg_id >=", value, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdLessThan(Integer value) {
            addCriterion("ctg_id <", value, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ctg_id <=", value, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdIn(List<Integer> values) {
            addCriterion("ctg_id in", values, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdNotIn(List<Integer> values) {
            addCriterion("ctg_id not in", values, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdBetween(Integer value1, Integer value2) {
            addCriterion("ctg_id between", value1, value2, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ctg_id not between", value1, value2, "ctgId");
            return (Criteria) this;
        }

        public Criteria andCtgNameIsNull() {
            addCriterion("ctg_name is null");
            return (Criteria) this;
        }

        public Criteria andCtgNameIsNotNull() {
            addCriterion("ctg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCtgNameEqualTo(String value) {
            addCriterion("ctg_name =", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameNotEqualTo(String value) {
            addCriterion("ctg_name <>", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameGreaterThan(String value) {
            addCriterion("ctg_name >", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ctg_name >=", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameLessThan(String value) {
            addCriterion("ctg_name <", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameLessThanOrEqualTo(String value) {
            addCriterion("ctg_name <=", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameLike(String value) {
            addCriterion("ctg_name like", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameNotLike(String value) {
            addCriterion("ctg_name not like", value, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameIn(List<String> values) {
            addCriterion("ctg_name in", values, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameNotIn(List<String> values) {
            addCriterion("ctg_name not in", values, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameBetween(String value1, String value2) {
            addCriterion("ctg_name between", value1, value2, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgNameNotBetween(String value1, String value2) {
            addCriterion("ctg_name not between", value1, value2, "ctgName");
            return (Criteria) this;
        }

        public Criteria andCtgDescIsNull() {
            addCriterion("ctg_desc is null");
            return (Criteria) this;
        }

        public Criteria andCtgDescIsNotNull() {
            addCriterion("ctg_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCtgDescEqualTo(String value) {
            addCriterion("ctg_desc =", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescNotEqualTo(String value) {
            addCriterion("ctg_desc <>", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescGreaterThan(String value) {
            addCriterion("ctg_desc >", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescGreaterThanOrEqualTo(String value) {
            addCriterion("ctg_desc >=", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescLessThan(String value) {
            addCriterion("ctg_desc <", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescLessThanOrEqualTo(String value) {
            addCriterion("ctg_desc <=", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescLike(String value) {
            addCriterion("ctg_desc like", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescNotLike(String value) {
            addCriterion("ctg_desc not like", value, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescIn(List<String> values) {
            addCriterion("ctg_desc in", values, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescNotIn(List<String> values) {
            addCriterion("ctg_desc not in", values, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescBetween(String value1, String value2) {
            addCriterion("ctg_desc between", value1, value2, "ctgDesc");
            return (Criteria) this;
        }

        public Criteria andCtgDescNotBetween(String value1, String value2) {
            addCriterion("ctg_desc not between", value1, value2, "ctgDesc");
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