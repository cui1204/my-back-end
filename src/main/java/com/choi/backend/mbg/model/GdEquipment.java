package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GdEquipment implements Serializable {
    private Integer id;

    private Integer equipmentId;

    private String name;

    private Integer stage;

    private String equipmentAttributes;

    private String strengtheningAttributes;

    private Integer maximumRating;

    private Integer openingCondition;

    private String itemCost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
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

    public String getEquipmentAttributes() {
        return equipmentAttributes;
    }

    public void setEquipmentAttributes(String equipmentAttributes) {
        this.equipmentAttributes = equipmentAttributes;
    }

    public String getStrengtheningAttributes() {
        return strengtheningAttributes;
    }

    public void setStrengtheningAttributes(String strengtheningAttributes) {
        this.strengtheningAttributes = strengtheningAttributes;
    }

    public Integer getMaximumRating() {
        return maximumRating;
    }

    public void setMaximumRating(Integer maximumRating) {
        this.maximumRating = maximumRating;
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
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", name=").append(name);
        sb.append(", stage=").append(stage);
        sb.append(", equipmentAttributes=").append(equipmentAttributes);
        sb.append(", strengtheningAttributes=").append(strengtheningAttributes);
        sb.append(", maximumRating=").append(maximumRating);
        sb.append(", openingCondition=").append(openingCondition);
        sb.append(", itemCost=").append(itemCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}