package com.blod.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArtIdIsNull() {
            addCriterion("art_id is null");
            return (Criteria) this;
        }

        public Criteria andArtIdIsNotNull() {
            addCriterion("art_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtIdEqualTo(Integer value) {
            addCriterion("art_id =", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotEqualTo(Integer value) {
            addCriterion("art_id <>", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThan(Integer value) {
            addCriterion("art_id >", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_id >=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThan(Integer value) {
            addCriterion("art_id <", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("art_id <=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdIn(List<Integer> values) {
            addCriterion("art_id in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotIn(List<Integer> values) {
            addCriterion("art_id not in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdBetween(Integer value1, Integer value2) {
            addCriterion("art_id between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("art_id not between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNull() {
            addCriterion("art_title is null");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNotNull() {
            addCriterion("art_title is not null");
            return (Criteria) this;
        }

        public Criteria andArtTitleEqualTo(String value) {
            addCriterion("art_title =", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotEqualTo(String value) {
            addCriterion("art_title <>", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThan(String value) {
            addCriterion("art_title >", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("art_title >=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThan(String value) {
            addCriterion("art_title <", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThanOrEqualTo(String value) {
            addCriterion("art_title <=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLike(String value) {
            addCriterion("art_title like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotLike(String value) {
            addCriterion("art_title not like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleIn(List<String> values) {
            addCriterion("art_title in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotIn(List<String> values) {
            addCriterion("art_title not in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleBetween(String value1, String value2) {
            addCriterion("art_title between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotBetween(String value1, String value2) {
            addCriterion("art_title not between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtUsernameIsNull() {
            addCriterion("art_username is null");
            return (Criteria) this;
        }

        public Criteria andArtUsernameIsNotNull() {
            addCriterion("art_username is not null");
            return (Criteria) this;
        }

        public Criteria andArtUsernameEqualTo(String value) {
            addCriterion("art_username =", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameNotEqualTo(String value) {
            addCriterion("art_username <>", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameGreaterThan(String value) {
            addCriterion("art_username >", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("art_username >=", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameLessThan(String value) {
            addCriterion("art_username <", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameLessThanOrEqualTo(String value) {
            addCriterion("art_username <=", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameLike(String value) {
            addCriterion("art_username like", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameNotLike(String value) {
            addCriterion("art_username not like", value, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameIn(List<String> values) {
            addCriterion("art_username in", values, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameNotIn(List<String> values) {
            addCriterion("art_username not in", values, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameBetween(String value1, String value2) {
            addCriterion("art_username between", value1, value2, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtUsernameNotBetween(String value1, String value2) {
            addCriterion("art_username not between", value1, value2, "artUsername");
            return (Criteria) this;
        }

        public Criteria andArtDateIsNull() {
            addCriterion("art_date is null");
            return (Criteria) this;
        }

        public Criteria andArtDateIsNotNull() {
            addCriterion("art_date is not null");
            return (Criteria) this;
        }

        public Criteria andArtDateEqualTo(Date value) {
            addCriterion("art_date =", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotEqualTo(Date value) {
            addCriterion("art_date <>", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateGreaterThan(Date value) {
            addCriterion("art_date >", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("art_date >=", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateLessThan(Date value) {
            addCriterion("art_date <", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateLessThanOrEqualTo(Date value) {
            addCriterion("art_date <=", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateIn(List<Date> values) {
            addCriterion("art_date in", values, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotIn(List<Date> values) {
            addCriterion("art_date not in", values, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateBetween(Date value1, Date value2) {
            addCriterion("art_date between", value1, value2, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotBetween(Date value1, Date value2) {
            addCriterion("art_date not between", value1, value2, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberIsNull() {
            addCriterion("art_readnumber is null");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberIsNotNull() {
            addCriterion("art_readnumber is not null");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberEqualTo(Integer value) {
            addCriterion("art_readnumber =", value, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberNotEqualTo(Integer value) {
            addCriterion("art_readnumber <>", value, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberGreaterThan(Integer value) {
            addCriterion("art_readnumber >", value, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_readnumber >=", value, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberLessThan(Integer value) {
            addCriterion("art_readnumber <", value, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberLessThanOrEqualTo(Integer value) {
            addCriterion("art_readnumber <=", value, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberIn(List<Integer> values) {
            addCriterion("art_readnumber in", values, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberNotIn(List<Integer> values) {
            addCriterion("art_readnumber not in", values, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberBetween(Integer value1, Integer value2) {
            addCriterion("art_readnumber between", value1, value2, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtReadnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("art_readnumber not between", value1, value2, "artReadnumber");
            return (Criteria) this;
        }

        public Criteria andArtDianzanIsNull() {
            addCriterion("art_dianzan is null");
            return (Criteria) this;
        }

        public Criteria andArtDianzanIsNotNull() {
            addCriterion("art_dianzan is not null");
            return (Criteria) this;
        }

        public Criteria andArtDianzanEqualTo(Integer value) {
            addCriterion("art_dianzan =", value, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanNotEqualTo(Integer value) {
            addCriterion("art_dianzan <>", value, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanGreaterThan(Integer value) {
            addCriterion("art_dianzan >", value, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_dianzan >=", value, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanLessThan(Integer value) {
            addCriterion("art_dianzan <", value, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanLessThanOrEqualTo(Integer value) {
            addCriterion("art_dianzan <=", value, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanIn(List<Integer> values) {
            addCriterion("art_dianzan in", values, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanNotIn(List<Integer> values) {
            addCriterion("art_dianzan not in", values, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanBetween(Integer value1, Integer value2) {
            addCriterion("art_dianzan between", value1, value2, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtDianzanNotBetween(Integer value1, Integer value2) {
            addCriterion("art_dianzan not between", value1, value2, "artDianzan");
            return (Criteria) this;
        }

        public Criteria andArtImageIsNull() {
            addCriterion("art_image is null");
            return (Criteria) this;
        }

        public Criteria andArtImageIsNotNull() {
            addCriterion("art_image is not null");
            return (Criteria) this;
        }

        public Criteria andArtImageEqualTo(String value) {
            addCriterion("art_image =", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageNotEqualTo(String value) {
            addCriterion("art_image <>", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageGreaterThan(String value) {
            addCriterion("art_image >", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageGreaterThanOrEqualTo(String value) {
            addCriterion("art_image >=", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageLessThan(String value) {
            addCriterion("art_image <", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageLessThanOrEqualTo(String value) {
            addCriterion("art_image <=", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageLike(String value) {
            addCriterion("art_image like", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageNotLike(String value) {
            addCriterion("art_image not like", value, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageIn(List<String> values) {
            addCriterion("art_image in", values, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageNotIn(List<String> values) {
            addCriterion("art_image not in", values, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageBetween(String value1, String value2) {
            addCriterion("art_image between", value1, value2, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtImageNotBetween(String value1, String value2) {
            addCriterion("art_image not between", value1, value2, "artImage");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdIsNull() {
            addCriterion("art_ctg_id is null");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdIsNotNull() {
            addCriterion("art_ctg_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdEqualTo(Integer value) {
            addCriterion("art_ctg_id =", value, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdNotEqualTo(Integer value) {
            addCriterion("art_ctg_id <>", value, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdGreaterThan(Integer value) {
            addCriterion("art_ctg_id >", value, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_ctg_id >=", value, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdLessThan(Integer value) {
            addCriterion("art_ctg_id <", value, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdLessThanOrEqualTo(Integer value) {
            addCriterion("art_ctg_id <=", value, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdIn(List<Integer> values) {
            addCriterion("art_ctg_id in", values, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdNotIn(List<Integer> values) {
            addCriterion("art_ctg_id not in", values, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdBetween(Integer value1, Integer value2) {
            addCriterion("art_ctg_id between", value1, value2, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtCtgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("art_ctg_id not between", value1, value2, "artCtgId");
            return (Criteria) this;
        }

        public Criteria andArtDescIsNull() {
            addCriterion("art_desc is null");
            return (Criteria) this;
        }

        public Criteria andArtDescIsNotNull() {
            addCriterion("art_desc is not null");
            return (Criteria) this;
        }

        public Criteria andArtDescEqualTo(String value) {
            addCriterion("art_desc =", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescNotEqualTo(String value) {
            addCriterion("art_desc <>", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescGreaterThan(String value) {
            addCriterion("art_desc >", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescGreaterThanOrEqualTo(String value) {
            addCriterion("art_desc >=", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescLessThan(String value) {
            addCriterion("art_desc <", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescLessThanOrEqualTo(String value) {
            addCriterion("art_desc <=", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescLike(String value) {
            addCriterion("art_desc like", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescNotLike(String value) {
            addCriterion("art_desc not like", value, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescIn(List<String> values) {
            addCriterion("art_desc in", values, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescNotIn(List<String> values) {
            addCriterion("art_desc not in", values, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescBetween(String value1, String value2) {
            addCriterion("art_desc between", value1, value2, "artDesc");
            return (Criteria) this;
        }

        public Criteria andArtDescNotBetween(String value1, String value2) {
            addCriterion("art_desc not between", value1, value2, "artDesc");
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