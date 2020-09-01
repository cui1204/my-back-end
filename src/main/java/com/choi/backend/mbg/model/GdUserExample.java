package com.choi.backend.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GdUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdUserExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPlayerIsNull() {
            addCriterion("player is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIsNotNull() {
            addCriterion("player is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerEqualTo(Integer value) {
            addCriterion("player =", value, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerNotEqualTo(Integer value) {
            addCriterion("player <>", value, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerGreaterThan(Integer value) {
            addCriterion("player >", value, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("player >=", value, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerLessThan(Integer value) {
            addCriterion("player <", value, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerLessThanOrEqualTo(Integer value) {
            addCriterion("player <=", value, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerIn(List<Integer> values) {
            addCriterion("player in", values, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerNotIn(List<Integer> values) {
            addCriterion("player not in", values, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerBetween(Integer value1, Integer value2) {
            addCriterion("player between", value1, value2, "player");
            return (Criteria) this;
        }

        public Criteria andPlayerNotBetween(Integer value1, Integer value2) {
            addCriterion("player not between", value1, value2, "player");
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

        public Criteria andGlodIsNull() {
            addCriterion("glod is null");
            return (Criteria) this;
        }

        public Criteria andGlodIsNotNull() {
            addCriterion("glod is not null");
            return (Criteria) this;
        }

        public Criteria andGlodEqualTo(Integer value) {
            addCriterion("glod =", value, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodNotEqualTo(Integer value) {
            addCriterion("glod <>", value, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodGreaterThan(Integer value) {
            addCriterion("glod >", value, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodGreaterThanOrEqualTo(Integer value) {
            addCriterion("glod >=", value, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodLessThan(Integer value) {
            addCriterion("glod <", value, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodLessThanOrEqualTo(Integer value) {
            addCriterion("glod <=", value, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodIn(List<Integer> values) {
            addCriterion("glod in", values, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodNotIn(List<Integer> values) {
            addCriterion("glod not in", values, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodBetween(Integer value1, Integer value2) {
            addCriterion("glod between", value1, value2, "glod");
            return (Criteria) this;
        }

        public Criteria andGlodNotBetween(Integer value1, Integer value2) {
            addCriterion("glod not between", value1, value2, "glod");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("hp is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("hp is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(Integer value) {
            addCriterion("hp =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(Integer value) {
            addCriterion("hp <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(Integer value) {
            addCriterion("hp >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(Integer value) {
            addCriterion("hp >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(Integer value) {
            addCriterion("hp <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(Integer value) {
            addCriterion("hp <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<Integer> values) {
            addCriterion("hp in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<Integer> values) {
            addCriterion("hp not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(Integer value1, Integer value2) {
            addCriterion("hp between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(Integer value1, Integer value2) {
            addCriterion("hp not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andMpIsNull() {
            addCriterion("mp is null");
            return (Criteria) this;
        }

        public Criteria andMpIsNotNull() {
            addCriterion("mp is not null");
            return (Criteria) this;
        }

        public Criteria andMpEqualTo(Integer value) {
            addCriterion("mp =", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotEqualTo(Integer value) {
            addCriterion("mp <>", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThan(Integer value) {
            addCriterion("mp >", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp >=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThan(Integer value) {
            addCriterion("mp <", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThanOrEqualTo(Integer value) {
            addCriterion("mp <=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpIn(List<Integer> values) {
            addCriterion("mp in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotIn(List<Integer> values) {
            addCriterion("mp not in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpBetween(Integer value1, Integer value2) {
            addCriterion("mp between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotBetween(Integer value1, Integer value2) {
            addCriterion("mp not between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNull() {
            addCriterion("logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNotNull() {
            addCriterion("logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeEqualTo(Date value) {
            addCriterion("logout_time =", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotEqualTo(Date value) {
            addCriterion("logout_time <>", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThan(Date value) {
            addCriterion("logout_time >", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logout_time >=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThan(Date value) {
            addCriterion("logout_time <", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("logout_time <=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIn(List<Date> values) {
            addCriterion("logout_time in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotIn(List<Date> values) {
            addCriterion("logout_time not in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeBetween(Date value1, Date value2) {
            addCriterion("logout_time between", value1, value2, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("logout_time not between", value1, value2, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(Date value) {
            addCriterion("schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(Date value) {
            addCriterion("schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(Date value) {
            addCriterion("schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(Date value) {
            addCriterion("schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(Date value) {
            addCriterion("schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(Date value) {
            addCriterion("schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<Date> values) {
            addCriterion("schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<Date> values) {
            addCriterion("schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(Date value1, Date value2) {
            addCriterion("schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(Date value1, Date value2) {
            addCriterion("schedule not between", value1, value2, "schedule");
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