package com.choi.backend.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class GdDungeonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdDungeonExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDungeonIdIsNull() {
            addCriterion("dungeon_id is null");
            return (Criteria) this;
        }

        public Criteria andDungeonIdIsNotNull() {
            addCriterion("dungeon_id is not null");
            return (Criteria) this;
        }

        public Criteria andDungeonIdEqualTo(Integer value) {
            addCriterion("dungeon_id =", value, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdNotEqualTo(Integer value) {
            addCriterion("dungeon_id <>", value, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdGreaterThan(Integer value) {
            addCriterion("dungeon_id >", value, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dungeon_id >=", value, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdLessThan(Integer value) {
            addCriterion("dungeon_id <", value, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdLessThanOrEqualTo(Integer value) {
            addCriterion("dungeon_id <=", value, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdIn(List<Integer> values) {
            addCriterion("dungeon_id in", values, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdNotIn(List<Integer> values) {
            addCriterion("dungeon_id not in", values, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdBetween(Integer value1, Integer value2) {
            addCriterion("dungeon_id between", value1, value2, "dungeonId");
            return (Criteria) this;
        }

        public Criteria andDungeonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dungeon_id not between", value1, value2, "dungeonId");
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

        public Criteria andResNameTopIsNull() {
            addCriterion("res_name_top is null");
            return (Criteria) this;
        }

        public Criteria andResNameTopIsNotNull() {
            addCriterion("res_name_top is not null");
            return (Criteria) this;
        }

        public Criteria andResNameTopEqualTo(String value) {
            addCriterion("res_name_top =", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopNotEqualTo(String value) {
            addCriterion("res_name_top <>", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopGreaterThan(String value) {
            addCriterion("res_name_top >", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopGreaterThanOrEqualTo(String value) {
            addCriterion("res_name_top >=", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopLessThan(String value) {
            addCriterion("res_name_top <", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopLessThanOrEqualTo(String value) {
            addCriterion("res_name_top <=", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopLike(String value) {
            addCriterion("res_name_top like", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopNotLike(String value) {
            addCriterion("res_name_top not like", value, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopIn(List<String> values) {
            addCriterion("res_name_top in", values, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopNotIn(List<String> values) {
            addCriterion("res_name_top not in", values, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopBetween(String value1, String value2) {
            addCriterion("res_name_top between", value1, value2, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameTopNotBetween(String value1, String value2) {
            addCriterion("res_name_top not between", value1, value2, "resNameTop");
            return (Criteria) this;
        }

        public Criteria andResNameBottomIsNull() {
            addCriterion("res_name_bottom is null");
            return (Criteria) this;
        }

        public Criteria andResNameBottomIsNotNull() {
            addCriterion("res_name_bottom is not null");
            return (Criteria) this;
        }

        public Criteria andResNameBottomEqualTo(String value) {
            addCriterion("res_name_bottom =", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomNotEqualTo(String value) {
            addCriterion("res_name_bottom <>", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomGreaterThan(String value) {
            addCriterion("res_name_bottom >", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomGreaterThanOrEqualTo(String value) {
            addCriterion("res_name_bottom >=", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomLessThan(String value) {
            addCriterion("res_name_bottom <", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomLessThanOrEqualTo(String value) {
            addCriterion("res_name_bottom <=", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomLike(String value) {
            addCriterion("res_name_bottom like", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomNotLike(String value) {
            addCriterion("res_name_bottom not like", value, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomIn(List<String> values) {
            addCriterion("res_name_bottom in", values, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomNotIn(List<String> values) {
            addCriterion("res_name_bottom not in", values, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomBetween(String value1, String value2) {
            addCriterion("res_name_bottom between", value1, value2, "resNameBottom");
            return (Criteria) this;
        }

        public Criteria andResNameBottomNotBetween(String value1, String value2) {
            addCriterion("res_name_bottom not between", value1, value2, "resNameBottom");
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