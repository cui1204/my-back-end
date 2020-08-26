package com.choi.backend.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class GdScienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdScienceExample() {
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

        public Criteria andScienceIdIsNull() {
            addCriterion("science_id is null");
            return (Criteria) this;
        }

        public Criteria andScienceIdIsNotNull() {
            addCriterion("science_id is not null");
            return (Criteria) this;
        }

        public Criteria andScienceIdEqualTo(Integer value) {
            addCriterion("science_id =", value, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdNotEqualTo(Integer value) {
            addCriterion("science_id <>", value, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdGreaterThan(Integer value) {
            addCriterion("science_id >", value, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("science_id >=", value, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdLessThan(Integer value) {
            addCriterion("science_id <", value, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdLessThanOrEqualTo(Integer value) {
            addCriterion("science_id <=", value, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdIn(List<Integer> values) {
            addCriterion("science_id in", values, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdNotIn(List<Integer> values) {
            addCriterion("science_id not in", values, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdBetween(Integer value1, Integer value2) {
            addCriterion("science_id between", value1, value2, "scienceId");
            return (Criteria) this;
        }

        public Criteria andScienceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("science_id not between", value1, value2, "scienceId");
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

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(Integer value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(Integer value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(Integer value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(Integer value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(Integer value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<Integer> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<Integer> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(Integer value1, Integer value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(Integer value1, Integer value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesIsNull() {
            addCriterion("science_attributes is null");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesIsNotNull() {
            addCriterion("science_attributes is not null");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesEqualTo(String value) {
            addCriterion("science_attributes =", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesNotEqualTo(String value) {
            addCriterion("science_attributes <>", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesGreaterThan(String value) {
            addCriterion("science_attributes >", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesGreaterThanOrEqualTo(String value) {
            addCriterion("science_attributes >=", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesLessThan(String value) {
            addCriterion("science_attributes <", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesLessThanOrEqualTo(String value) {
            addCriterion("science_attributes <=", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesLike(String value) {
            addCriterion("science_attributes like", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesNotLike(String value) {
            addCriterion("science_attributes not like", value, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesIn(List<String> values) {
            addCriterion("science_attributes in", values, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesNotIn(List<String> values) {
            addCriterion("science_attributes not in", values, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesBetween(String value1, String value2) {
            addCriterion("science_attributes between", value1, value2, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andScienceAttributesNotBetween(String value1, String value2) {
            addCriterion("science_attributes not between", value1, value2, "scienceAttributes");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionIsNull() {
            addCriterion("opening_condition is null");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionIsNotNull() {
            addCriterion("opening_condition is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionEqualTo(Integer value) {
            addCriterion("opening_condition =", value, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionNotEqualTo(Integer value) {
            addCriterion("opening_condition <>", value, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionGreaterThan(Integer value) {
            addCriterion("opening_condition >", value, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("opening_condition >=", value, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionLessThan(Integer value) {
            addCriterion("opening_condition <", value, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionLessThanOrEqualTo(Integer value) {
            addCriterion("opening_condition <=", value, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionIn(List<Integer> values) {
            addCriterion("opening_condition in", values, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionNotIn(List<Integer> values) {
            addCriterion("opening_condition not in", values, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionBetween(Integer value1, Integer value2) {
            addCriterion("opening_condition between", value1, value2, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andOpeningConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("opening_condition not between", value1, value2, "openingCondition");
            return (Criteria) this;
        }

        public Criteria andItemCostIsNull() {
            addCriterion("item_cost is null");
            return (Criteria) this;
        }

        public Criteria andItemCostIsNotNull() {
            addCriterion("item_cost is not null");
            return (Criteria) this;
        }

        public Criteria andItemCostEqualTo(String value) {
            addCriterion("item_cost =", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotEqualTo(String value) {
            addCriterion("item_cost <>", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostGreaterThan(String value) {
            addCriterion("item_cost >", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostGreaterThanOrEqualTo(String value) {
            addCriterion("item_cost >=", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostLessThan(String value) {
            addCriterion("item_cost <", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostLessThanOrEqualTo(String value) {
            addCriterion("item_cost <=", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostLike(String value) {
            addCriterion("item_cost like", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotLike(String value) {
            addCriterion("item_cost not like", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostIn(List<String> values) {
            addCriterion("item_cost in", values, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotIn(List<String> values) {
            addCriterion("item_cost not in", values, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostBetween(String value1, String value2) {
            addCriterion("item_cost between", value1, value2, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotBetween(String value1, String value2) {
            addCriterion("item_cost not between", value1, value2, "itemCost");
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