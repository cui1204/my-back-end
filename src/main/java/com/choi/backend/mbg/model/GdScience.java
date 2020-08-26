package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GdScience implements Serializable {
    private Integer id;

    private Integer scienceId;

    private String name;

    private Integer stage;

    private String scienceAttributes;

    private Integer openingCondition;

    private String itemCost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScienceId() {
        return scienceId;
    }

    public void setScienceId(Integer scienceId) {
        this.scienceId = scienceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public String getScienceAttributes() {
        return scienceAttributes;
    }

    public void setScienceAttributes(String scienceAttributes) {
        this.scienceAttributes = scienceAttributes;
    }

    public Integer getOpeningCondition() {
        return openingCondition;
    }

    public void setOpeningCondition(Integer openingCondition) {
        this.openingCondition = openingCondition;
    }

    public String getItemCost() {
        return itemCost;
    }

    public void setItemCost(String itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scienceId=").append(scienceId);
        sb.append(", name=").append(name);
        sb.append(", stage=").append(stage);
        sb.append(", scienceAttributes=").append(scienceAttributes);
        sb.append(", openingCondition=").append(openingCondition);
        sb.append(", itemCost=").append(itemCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}