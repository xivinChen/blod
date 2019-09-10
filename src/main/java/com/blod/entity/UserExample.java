package com.blod.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsUsernameIsNull() {
            addCriterion("us_username is null");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIsNotNull() {
            addCriterion("us_username is not null");
            return (Criteria) this;
        }

        public Criteria andUsUsernameEqualTo(String value) {
            addCriterion("us_username =", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotEqualTo(String value) {
            addCriterion("us_username <>", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameGreaterThan(String value) {
            addCriterion("us_username >", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("us_username >=", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLessThan(String value) {
            addCriterion("us_username <", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLessThanOrEqualTo(String value) {
            addCriterion("us_username <=", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLike(String value) {
            addCriterion("us_username like", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotLike(String value) {
            addCriterion("us_username not like", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIn(List<String> values) {
            addCriterion("us_username in", values, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotIn(List<String> values) {
            addCriterion("us_username not in", values, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameBetween(String value1, String value2) {
            addCriterion("us_username between", value1, value2, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotBetween(String value1, String value2) {
            addCriterion("us_username not between", value1, value2, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNull() {
            addCriterion("us_password is null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNotNull() {
            addCriterion("us_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordEqualTo(String value) {
            addCriterion("us_password =", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotEqualTo(String value) {
            addCriterion("us_password <>", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThan(String value) {
            addCriterion("us_password >", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("us_password >=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThan(String value) {
            addCriterion("us_password <", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThanOrEqualTo(String value) {
            addCriterion("us_password <=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLike(String value) {
            addCriterion("us_password like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotLike(String value) {
            addCriterion("us_password not like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIn(List<String> values) {
            addCriterion("us_password in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotIn(List<String> values) {
            addCriterion("us_password not in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordBetween(String value1, String value2) {
            addCriterion("us_password between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotBetween(String value1, String value2) {
            addCriterion("us_password not between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsNicknameIsNull() {
            addCriterion("us_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUsNicknameIsNotNull() {
            addCriterion("us_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUsNicknameEqualTo(String value) {
            addCriterion("us_nickname =", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameNotEqualTo(String value) {
            addCriterion("us_nickname <>", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameGreaterThan(String value) {
            addCriterion("us_nickname >", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("us_nickname >=", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameLessThan(String value) {
            addCriterion("us_nickname <", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameLessThanOrEqualTo(String value) {
            addCriterion("us_nickname <=", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameLike(String value) {
            addCriterion("us_nickname like", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameNotLike(String value) {
            addCriterion("us_nickname not like", value, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameIn(List<String> values) {
            addCriterion("us_nickname in", values, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameNotIn(List<String> values) {
            addCriterion("us_nickname not in", values, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameBetween(String value1, String value2) {
            addCriterion("us_nickname between", value1, value2, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsNicknameNotBetween(String value1, String value2) {
            addCriterion("us_nickname not between", value1, value2, "usNickname");
            return (Criteria) this;
        }

        public Criteria andUsQuestionIsNull() {
            addCriterion("us_question is null");
            return (Criteria) this;
        }

        public Criteria andUsQuestionIsNotNull() {
            addCriterion("us_question is not null");
            return (Criteria) this;
        }

        public Criteria andUsQuestionEqualTo(String value) {
            addCriterion("us_question =", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionNotEqualTo(String value) {
            addCriterion("us_question <>", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionGreaterThan(String value) {
            addCriterion("us_question >", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("us_question >=", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionLessThan(String value) {
            addCriterion("us_question <", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionLessThanOrEqualTo(String value) {
            addCriterion("us_question <=", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionLike(String value) {
            addCriterion("us_question like", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionNotLike(String value) {
            addCriterion("us_question not like", value, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionIn(List<String> values) {
            addCriterion("us_question in", values, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionNotIn(List<String> values) {
            addCriterion("us_question not in", values, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionBetween(String value1, String value2) {
            addCriterion("us_question between", value1, value2, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsQuestionNotBetween(String value1, String value2) {
            addCriterion("us_question not between", value1, value2, "usQuestion");
            return (Criteria) this;
        }

        public Criteria andUsAnswerIsNull() {
            addCriterion("us_answer is null");
            return (Criteria) this;
        }

        public Criteria andUsAnswerIsNotNull() {
            addCriterion("us_answer is not null");
            return (Criteria) this;
        }

        public Criteria andUsAnswerEqualTo(String value) {
            addCriterion("us_answer =", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerNotEqualTo(String value) {
            addCriterion("us_answer <>", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerGreaterThan(String value) {
            addCriterion("us_answer >", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("us_answer >=", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerLessThan(String value) {
            addCriterion("us_answer <", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerLessThanOrEqualTo(String value) {
            addCriterion("us_answer <=", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerLike(String value) {
            addCriterion("us_answer like", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerNotLike(String value) {
            addCriterion("us_answer not like", value, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerIn(List<String> values) {
            addCriterion("us_answer in", values, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerNotIn(List<String> values) {
            addCriterion("us_answer not in", values, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerBetween(String value1, String value2) {
            addCriterion("us_answer between", value1, value2, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsAnswerNotBetween(String value1, String value2) {
            addCriterion("us_answer not between", value1, value2, "usAnswer");
            return (Criteria) this;
        }

        public Criteria andUsGenderIsNull() {
            addCriterion("us_gender is null");
            return (Criteria) this;
        }

        public Criteria andUsGenderIsNotNull() {
            addCriterion("us_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUsGenderEqualTo(Integer value) {
            addCriterion("us_gender =", value, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderNotEqualTo(Integer value) {
            addCriterion("us_gender <>", value, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderGreaterThan(Integer value) {
            addCriterion("us_gender >", value, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_gender >=", value, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderLessThan(Integer value) {
            addCriterion("us_gender <", value, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderLessThanOrEqualTo(Integer value) {
            addCriterion("us_gender <=", value, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderIn(List<Integer> values) {
            addCriterion("us_gender in", values, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderNotIn(List<Integer> values) {
            addCriterion("us_gender not in", values, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderBetween(Integer value1, Integer value2) {
            addCriterion("us_gender between", value1, value2, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("us_gender not between", value1, value2, "usGender");
            return (Criteria) this;
        }

        public Criteria andUsGradeIsNull() {
            addCriterion("us_grade is null");
            return (Criteria) this;
        }

        public Criteria andUsGradeIsNotNull() {
            addCriterion("us_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUsGradeEqualTo(String value) {
            addCriterion("us_grade =", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeNotEqualTo(String value) {
            addCriterion("us_grade <>", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeGreaterThan(String value) {
            addCriterion("us_grade >", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeGreaterThanOrEqualTo(String value) {
            addCriterion("us_grade >=", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeLessThan(String value) {
            addCriterion("us_grade <", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeLessThanOrEqualTo(String value) {
            addCriterion("us_grade <=", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeLike(String value) {
            addCriterion("us_grade like", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeNotLike(String value) {
            addCriterion("us_grade not like", value, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeIn(List<String> values) {
            addCriterion("us_grade in", values, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeNotIn(List<String> values) {
            addCriterion("us_grade not in", values, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeBetween(String value1, String value2) {
            addCriterion("us_grade between", value1, value2, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsGradeNotBetween(String value1, String value2) {
            addCriterion("us_grade not between", value1, value2, "usGrade");
            return (Criteria) this;
        }

        public Criteria andUsEmailIsNull() {
            addCriterion("us_email is null");
            return (Criteria) this;
        }

        public Criteria andUsEmailIsNotNull() {
            addCriterion("us_email is not null");
            return (Criteria) this;
        }

        public Criteria andUsEmailEqualTo(String value) {
            addCriterion("us_email =", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotEqualTo(String value) {
            addCriterion("us_email <>", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailGreaterThan(String value) {
            addCriterion("us_email >", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("us_email >=", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailLessThan(String value) {
            addCriterion("us_email <", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailLessThanOrEqualTo(String value) {
            addCriterion("us_email <=", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailLike(String value) {
            addCriterion("us_email like", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotLike(String value) {
            addCriterion("us_email not like", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailIn(List<String> values) {
            addCriterion("us_email in", values, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotIn(List<String> values) {
            addCriterion("us_email not in", values, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailBetween(String value1, String value2) {
            addCriterion("us_email between", value1, value2, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotBetween(String value1, String value2) {
            addCriterion("us_email not between", value1, value2, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsTimeIsNull() {
            addCriterion("us_time is null");
            return (Criteria) this;
        }

        public Criteria andUsTimeIsNotNull() {
            addCriterion("us_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsTimeEqualTo(String value) {
            addCriterion("us_time =", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeNotEqualTo(String value) {
            addCriterion("us_time <>", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeGreaterThan(String value) {
            addCriterion("us_time >", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("us_time >=", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeLessThan(String value) {
            addCriterion("us_time <", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeLessThanOrEqualTo(String value) {
            addCriterion("us_time <=", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeLike(String value) {
            addCriterion("us_time like", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeNotLike(String value) {
            addCriterion("us_time not like", value, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeIn(List<String> values) {
            addCriterion("us_time in", values, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeNotIn(List<String> values) {
            addCriterion("us_time not in", values, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeBetween(String value1, String value2) {
            addCriterion("us_time between", value1, value2, "usTime");
            return (Criteria) this;
        }

        public Criteria andUsTimeNotBetween(String value1, String value2) {
            addCriterion("us_time not between", value1, value2, "usTime");
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