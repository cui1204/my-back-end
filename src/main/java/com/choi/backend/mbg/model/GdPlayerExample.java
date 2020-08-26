package com.choi.backend.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class GdPlayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdPlayerExample() {
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

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Integer value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Integer value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Integer value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Integer value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Integer> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Integer> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("res_name is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("res_name is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("res_name =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("res_name <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("res_name >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_name >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("res_name <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("res_name <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("res_name like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("res_name not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("res_name in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("res_name not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("res_name between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("res_name not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGunIsNull() {
            addCriterion("res_name_gun is null");
            return (Criteria) this;
        }

        public Criteria andResNameGunIsNotNull() {
            addCriterion("res_name_gun is not null");
            return (Criteria) this;
        }

        public Criteria andResNameGunEqualTo(String value) {
            addCriterion("res_name_gun =", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunNotEqualTo(String value) {
            addCriterion("res_name_gun <>", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunGreaterThan(String value) {
            addCriterion("res_name_gun >", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunGreaterThanOrEqualTo(String value) {
            addCriterion("res_name_gun >=", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunLessThan(String value) {
            addCriterion("res_name_gun <", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunLessThanOrEqualTo(String value) {
            addCriterion("res_name_gun <=", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunLike(String value) {
            addCriterion("res_name_gun like", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunNotLike(String value) {
            addCriterion("res_name_gun not like", value, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunIn(List<String> values) {
            addCriterion("res_name_gun in", values, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunNotIn(List<String> values) {
            addCriterion("res_name_gun not in", values, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunBetween(String value1, String value2) {
            addCriterion("res_name_gun between", value1, value2, "resNameGun");
            return (Criteria) this;
        }

        public Criteria andResNameGunNotBetween(String value1, String value2) {
            addCriterion("res_name_gun not between", value1, value2, "resNameGun");
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

        public Criteria andAtkIsNull() {
            addCriterion("atk is null");
            return (Criteria) this;
        }

        public Criteria andAtkIsNotNull() {
            addCriterion("atk is not null");
            return (Criteria) this;
        }

        public Criteria andAtkEqualTo(Integer value) {
            addCriterion("atk =", value, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkNotEqualTo(Integer value) {
            addCriterion("atk <>", value, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkGreaterThan(Integer value) {
            addCriterion("atk >", value, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkGreaterThanOrEqualTo(Integer value) {
            addCriterion("atk >=", value, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkLessThan(Integer value) {
            addCriterion("atk <", value, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkLessThanOrEqualTo(Integer value) {
            addCriterion("atk <=", value, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkIn(List<Integer> values) {
            addCriterion("atk in", values, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkNotIn(List<Integer> values) {
            addCriterion("atk not in", values, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkBetween(Integer value1, Integer value2) {
            addCriterion("atk between", value1, value2, "atk");
            return (Criteria) this;
        }

        public Criteria andAtkNotBetween(Integer value1, Integer value2) {
            addCriterion("atk not between", value1, value2, "atk");
            return (Criteria) this;
        }

        public Criteria andDefIsNull() {
            addCriterion("def is null");
            return (Criteria) this;
        }

        public Criteria andDefIsNotNull() {
            addCriterion("def is not null");
            return (Criteria) this;
        }

        public Criteria andDefEqualTo(Integer value) {
            addCriterion("def =", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotEqualTo(Integer value) {
            addCriterion("def <>", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThan(Integer value) {
            addCriterion("def >", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThanOrEqualTo(Integer value) {
            addCriterion("def >=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThan(Integer value) {
            addCriterion("def <", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThanOrEqualTo(Integer value) {
            addCriterion("def <=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefIn(List<Integer> values) {
            addCriterion("def in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotIn(List<Integer> values) {
            addCriterion("def not in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefBetween(Integer value1, Integer value2) {
            addCriterion("def between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotBetween(Integer value1, Integer value2) {
            addCriterion("def not between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andCriticalIsNull() {
            addCriterion("critical is null");
            return (Criteria) this;
        }

        public Criteria andCriticalIsNotNull() {
            addCriterion("critical is not null");
            return (Criteria) this;
        }

        public Criteria andCriticalEqualTo(Integer value) {
            addCriterion("critical =", value, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalNotEqualTo(Integer value) {
            addCriterion("critical <>", value, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalGreaterThan(Integer value) {
            addCriterion("critical >", value, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalGreaterThanOrEqualTo(Integer value) {
            addCriterion("critical >=", value, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalLessThan(Integer value) {
            addCriterion("critical <", value, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalLessThanOrEqualTo(Integer value) {
            addCriterion("critical <=", value, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalIn(List<Integer> values) {
            addCriterion("critical in", values, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalNotIn(List<Integer> values) {
            addCriterion("critical not in", values, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalBetween(Integer value1, Integer value2) {
            addCriterion("critical between", value1, value2, "critical");
            return (Criteria) this;
        }

        public Criteria andCriticalNotBetween(Integer value1, Integer value2) {
            addCriterion("critical not between", value1, value2, "critical");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedIsNull() {
            addCriterion("atk_speed is null");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedIsNotNull() {
            addCriterion("atk_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedEqualTo(Integer value) {
            addCriterion("atk_speed =", value, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedNotEqualTo(Integer value) {
            addCriterion("atk_speed <>", value, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedGreaterThan(Integer value) {
            addCriterion("atk_speed >", value, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("atk_speed >=", value, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedLessThan(Integer value) {
            addCriterion("atk_speed <", value, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("atk_speed <=", value, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedIn(List<Integer> values) {
            addCriterion("atk_speed in", values, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedNotIn(List<Integer> values) {
            addCriterion("atk_speed not in", values, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedBetween(Integer value1, Integer value2) {
            addCriterion("atk_speed between", value1, value2, "atkSpeed");
            return (Criteria) this;
        }

        public Criteria andAtkSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("atk_speed not between", value1, value2, "atkSpeed");
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