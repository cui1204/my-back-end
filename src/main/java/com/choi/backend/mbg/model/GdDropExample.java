package com.choi.backend.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class GdDropExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdDropExample() {
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

        public Criteria andDropIdIsNull() {
            addCriterion("drop_id is null");
            return (Criteria) this;
        }

        public Criteria andDropIdIsNotNull() {
            addCriterion("drop_id is not null");
            return (Criteria) this;
        }

        public Criteria andDropIdEqualTo(Integer value) {
            addCriterion("drop_id =", value, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdNotEqualTo(Integer value) {
            addCriterion("drop_id <>", value, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdGreaterThan(Integer value) {
            addCriterion("drop_id >", value, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drop_id >=", value, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdLessThan(Integer value) {
            addCriterion("drop_id <", value, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdLessThanOrEqualTo(Integer value) {
            addCriterion("drop_id <=", value, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdIn(List<Integer> values) {
            addCriterion("drop_id in", values, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdNotIn(List<Integer> values) {
            addCriterion("drop_id not in", values, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdBetween(Integer value1, Integer value2) {
            addCriterion("drop_id between", value1, value2, "dropId");
            return (Criteria) this;
        }

        public Criteria andDropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drop_id not between", value1, value2, "dropId");
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

        public Criteria andItem1IsNull() {
            addCriterion("item1 is null");
            return (Criteria) this;
        }

        public Criteria andItem1IsNotNull() {
            addCriterion("item1 is not null");
            return (Criteria) this;
        }

        public Criteria andItem1EqualTo(Integer value) {
            addCriterion("item1 =", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotEqualTo(Integer value) {
            addCriterion("item1 <>", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThan(Integer value) {
            addCriterion("item1 >", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThanOrEqualTo(Integer value) {
            addCriterion("item1 >=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThan(Integer value) {
            addCriterion("item1 <", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThanOrEqualTo(Integer value) {
            addCriterion("item1 <=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1In(List<Integer> values) {
            addCriterion("item1 in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotIn(List<Integer> values) {
            addCriterion("item1 not in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Between(Integer value1, Integer value2) {
            addCriterion("item1 between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotBetween(Integer value1, Integer value2) {
            addCriterion("item1 not between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItemValue1IsNull() {
            addCriterion("item_value1 is null");
            return (Criteria) this;
        }

        public Criteria andItemValue1IsNotNull() {
            addCriterion("item_value1 is not null");
            return (Criteria) this;
        }

        public Criteria andItemValue1EqualTo(Integer value) {
            addCriterion("item_value1 =", value, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1NotEqualTo(Integer value) {
            addCriterion("item_value1 <>", value, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1GreaterThan(Integer value) {
            addCriterion("item_value1 >", value, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1GreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value1 >=", value, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1LessThan(Integer value) {
            addCriterion("item_value1 <", value, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1LessThanOrEqualTo(Integer value) {
            addCriterion("item_value1 <=", value, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1In(List<Integer> values) {
            addCriterion("item_value1 in", values, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1NotIn(List<Integer> values) {
            addCriterion("item_value1 not in", values, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1Between(Integer value1, Integer value2) {
            addCriterion("item_value1 between", value1, value2, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItemValue1NotBetween(Integer value1, Integer value2) {
            addCriterion("item_value1 not between", value1, value2, "itemValue1");
            return (Criteria) this;
        }

        public Criteria andItem2IsNull() {
            addCriterion("item2 is null");
            return (Criteria) this;
        }

        public Criteria andItem2IsNotNull() {
            addCriterion("item2 is not null");
            return (Criteria) this;
        }

        public Criteria andItem2EqualTo(Integer value) {
            addCriterion("item2 =", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotEqualTo(Integer value) {
            addCriterion("item2 <>", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThan(Integer value) {
            addCriterion("item2 >", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThanOrEqualTo(Integer value) {
            addCriterion("item2 >=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThan(Integer value) {
            addCriterion("item2 <", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThanOrEqualTo(Integer value) {
            addCriterion("item2 <=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2In(List<Integer> values) {
            addCriterion("item2 in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotIn(List<Integer> values) {
            addCriterion("item2 not in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Between(Integer value1, Integer value2) {
            addCriterion("item2 between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotBetween(Integer value1, Integer value2) {
            addCriterion("item2 not between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItemValue2IsNull() {
            addCriterion("item_value2 is null");
            return (Criteria) this;
        }

        public Criteria andItemValue2IsNotNull() {
            addCriterion("item_value2 is not null");
            return (Criteria) this;
        }

        public Criteria andItemValue2EqualTo(Integer value) {
            addCriterion("item_value2 =", value, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2NotEqualTo(Integer value) {
            addCriterion("item_value2 <>", value, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2GreaterThan(Integer value) {
            addCriterion("item_value2 >", value, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2GreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value2 >=", value, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2LessThan(Integer value) {
            addCriterion("item_value2 <", value, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2LessThanOrEqualTo(Integer value) {
            addCriterion("item_value2 <=", value, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2In(List<Integer> values) {
            addCriterion("item_value2 in", values, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2NotIn(List<Integer> values) {
            addCriterion("item_value2 not in", values, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2Between(Integer value1, Integer value2) {
            addCriterion("item_value2 between", value1, value2, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItemValue2NotBetween(Integer value1, Integer value2) {
            addCriterion("item_value2 not between", value1, value2, "itemValue2");
            return (Criteria) this;
        }

        public Criteria andItem3IsNull() {
            addCriterion("item3 is null");
            return (Criteria) this;
        }

        public Criteria andItem3IsNotNull() {
            addCriterion("item3 is not null");
            return (Criteria) this;
        }

        public Criteria andItem3EqualTo(Integer value) {
            addCriterion("item3 =", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotEqualTo(Integer value) {
            addCriterion("item3 <>", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThan(Integer value) {
            addCriterion("item3 >", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThanOrEqualTo(Integer value) {
            addCriterion("item3 >=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThan(Integer value) {
            addCriterion("item3 <", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThanOrEqualTo(Integer value) {
            addCriterion("item3 <=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3In(List<Integer> values) {
            addCriterion("item3 in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotIn(List<Integer> values) {
            addCriterion("item3 not in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Between(Integer value1, Integer value2) {
            addCriterion("item3 between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotBetween(Integer value1, Integer value2) {
            addCriterion("item3 not between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItemValue3IsNull() {
            addCriterion("item_value3 is null");
            return (Criteria) this;
        }

        public Criteria andItemValue3IsNotNull() {
            addCriterion("item_value3 is not null");
            return (Criteria) this;
        }

        public Criteria andItemValue3EqualTo(Integer value) {
            addCriterion("item_value3 =", value, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3NotEqualTo(Integer value) {
            addCriterion("item_value3 <>", value, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3GreaterThan(Integer value) {
            addCriterion("item_value3 >", value, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3GreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value3 >=", value, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3LessThan(Integer value) {
            addCriterion("item_value3 <", value, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3LessThanOrEqualTo(Integer value) {
            addCriterion("item_value3 <=", value, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3In(List<Integer> values) {
            addCriterion("item_value3 in", values, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3NotIn(List<Integer> values) {
            addCriterion("item_value3 not in", values, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3Between(Integer value1, Integer value2) {
            addCriterion("item_value3 between", value1, value2, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItemValue3NotBetween(Integer value1, Integer value2) {
            addCriterion("item_value3 not between", value1, value2, "itemValue3");
            return (Criteria) this;
        }

        public Criteria andItem4IsNull() {
            addCriterion("item4 is null");
            return (Criteria) this;
        }

        public Criteria andItem4IsNotNull() {
            addCriterion("item4 is not null");
            return (Criteria) this;
        }

        public Criteria andItem4EqualTo(Integer value) {
            addCriterion("item4 =", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotEqualTo(Integer value) {
            addCriterion("item4 <>", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThan(Integer value) {
            addCriterion("item4 >", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThanOrEqualTo(Integer value) {
            addCriterion("item4 >=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThan(Integer value) {
            addCriterion("item4 <", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThanOrEqualTo(Integer value) {
            addCriterion("item4 <=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4In(List<Integer> values) {
            addCriterion("item4 in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotIn(List<Integer> values) {
            addCriterion("item4 not in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Between(Integer value1, Integer value2) {
            addCriterion("item4 between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotBetween(Integer value1, Integer value2) {
            addCriterion("item4 not between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItemValue4IsNull() {
            addCriterion("item_value4 is null");
            return (Criteria) this;
        }

        public Criteria andItemValue4IsNotNull() {
            addCriterion("item_value4 is not null");
            return (Criteria) this;
        }

        public Criteria andItemValue4EqualTo(Integer value) {
            addCriterion("item_value4 =", value, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4NotEqualTo(Integer value) {
            addCriterion("item_value4 <>", value, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4GreaterThan(Integer value) {
            addCriterion("item_value4 >", value, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4GreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value4 >=", value, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4LessThan(Integer value) {
            addCriterion("item_value4 <", value, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4LessThanOrEqualTo(Integer value) {
            addCriterion("item_value4 <=", value, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4In(List<Integer> values) {
            addCriterion("item_value4 in", values, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4NotIn(List<Integer> values) {
            addCriterion("item_value4 not in", values, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4Between(Integer value1, Integer value2) {
            addCriterion("item_value4 between", value1, value2, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItemValue4NotBetween(Integer value1, Integer value2) {
            addCriterion("item_value4 not between", value1, value2, "itemValue4");
            return (Criteria) this;
        }

        public Criteria andItem5IsNull() {
            addCriterion("item5 is null");
            return (Criteria) this;
        }

        public Criteria andItem5IsNotNull() {
            addCriterion("item5 is not null");
            return (Criteria) this;
        }

        public Criteria andItem5EqualTo(Integer value) {
            addCriterion("item5 =", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotEqualTo(Integer value) {
            addCriterion("item5 <>", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5GreaterThan(Integer value) {
            addCriterion("item5 >", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5GreaterThanOrEqualTo(Integer value) {
            addCriterion("item5 >=", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5LessThan(Integer value) {
            addCriterion("item5 <", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5LessThanOrEqualTo(Integer value) {
            addCriterion("item5 <=", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5In(List<Integer> values) {
            addCriterion("item5 in", values, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotIn(List<Integer> values) {
            addCriterion("item5 not in", values, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5Between(Integer value1, Integer value2) {
            addCriterion("item5 between", value1, value2, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotBetween(Integer value1, Integer value2) {
            addCriterion("item5 not between", value1, value2, "item5");
            return (Criteria) this;
        }

        public Criteria andItemValue5IsNull() {
            addCriterion("item_value5 is null");
            return (Criteria) this;
        }

        public Criteria andItemValue5IsNotNull() {
            addCriterion("item_value5 is not null");
            return (Criteria) this;
        }

        public Criteria andItemValue5EqualTo(Integer value) {
            addCriterion("item_value5 =", value, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5NotEqualTo(Integer value) {
            addCriterion("item_value5 <>", value, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5GreaterThan(Integer value) {
            addCriterion("item_value5 >", value, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5GreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value5 >=", value, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5LessThan(Integer value) {
            addCriterion("item_value5 <", value, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5LessThanOrEqualTo(Integer value) {
            addCriterion("item_value5 <=", value, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5In(List<Integer> values) {
            addCriterion("item_value5 in", values, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5NotIn(List<Integer> values) {
            addCriterion("item_value5 not in", values, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5Between(Integer value1, Integer value2) {
            addCriterion("item_value5 between", value1, value2, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItemValue5NotBetween(Integer value1, Integer value2) {
            addCriterion("item_value5 not between", value1, value2, "itemValue5");
            return (Criteria) this;
        }

        public Criteria andItem6IsNull() {
            addCriterion("item6 is null");
            return (Criteria) this;
        }

        public Criteria andItem6IsNotNull() {
            addCriterion("item6 is not null");
            return (Criteria) this;
        }

        public Criteria andItem6EqualTo(Integer value) {
            addCriterion("item6 =", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotEqualTo(Integer value) {
            addCriterion("item6 <>", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6GreaterThan(Integer value) {
            addCriterion("item6 >", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6GreaterThanOrEqualTo(Integer value) {
            addCriterion("item6 >=", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6LessThan(Integer value) {
            addCriterion("item6 <", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6LessThanOrEqualTo(Integer value) {
            addCriterion("item6 <=", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6In(List<Integer> values) {
            addCriterion("item6 in", values, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotIn(List<Integer> values) {
            addCriterion("item6 not in", values, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6Between(Integer value1, Integer value2) {
            addCriterion("item6 between", value1, value2, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotBetween(Integer value1, Integer value2) {
            addCriterion("item6 not between", value1, value2, "item6");
            return (Criteria) this;
        }

        public Criteria andItemValue6IsNull() {
            addCriterion("item_value6 is null");
            return (Criteria) this;
        }

        public Criteria andItemValue6IsNotNull() {
            addCriterion("item_value6 is not null");
            return (Criteria) this;
        }

        public Criteria andItemValue6EqualTo(Integer value) {
            addCriterion("item_value6 =", value, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6NotEqualTo(Integer value) {
            addCriterion("item_value6 <>", value, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6GreaterThan(Integer value) {
            addCriterion("item_value6 >", value, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6GreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value6 >=", value, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6LessThan(Integer value) {
            addCriterion("item_value6 <", value, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6LessThanOrEqualTo(Integer value) {
            addCriterion("item_value6 <=", value, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6In(List<Integer> values) {
            addCriterion("item_value6 in", values, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6NotIn(List<Integer> values) {
            addCriterion("item_value6 not in", values, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6Between(Integer value1, Integer value2) {
            addCriterion("item_value6 between", value1, value2, "itemValue6");
            return (Criteria) this;
        }

        public Criteria andItemValue6NotBetween(Integer value1, Integer value2) {
            addCriterion("item_value6 not between", value1, value2, "itemValue6");
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