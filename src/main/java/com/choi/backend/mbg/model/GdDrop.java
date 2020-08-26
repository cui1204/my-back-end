package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GdDrop implements Serializable {
    private Integer id;

    private Integer dropId;

    private Integer type;

    private Integer item1;

    private Integer itemValue1;

    private Integer item2;

    private Integer itemValue2;

    private Integer item3;

    private Integer itemValue3;

    private Integer item4;

    private Integer itemValue4;

    private Integer item5;

    private Integer itemValue5;

    private Integer item6;

    private Integer itemValue6;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDropId() {
        return dropId;
    }

    public void setDropId(Integer dropId) {
        this.dropId = dropId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItemValue1() {
        return itemValue1;
    }

    public void setItemValue1(Integer itemValue1) {
        this.itemValue1 = itemValue1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItemValue2() {
        return itemValue2;
    }

    public void setItemValue2(Integer itemValue2) {
        this.itemValue2 = itemValue2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItemValue3() {
        return itemValue3;
    }

    public void setItemValue3(Integer itemValue3) {
        this.itemValue3 = itemValue3;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItemValue4() {
        return itemValue4;
    }

    public void setItemValue4(Integer itemValue4) {
        this.itemValue4 = itemValue4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getItemValue5() {
        return itemValue5;
    }

    public void setItemValue5(Integer itemValue5) {
        this.itemValue5 = itemValue5;
    }

    public Integer getItem6() {
        return item6;
    }

    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    public Integer getItemValue6() {
        return itemValue6;
    }

    public void setItemValue6(Integer itemValue6) {
        this.itemValue6 = itemValue6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dropId=").append(dropId);
        sb.append(", type=").append(type);
        sb.append(", item1=").append(item1);
        sb.append(", itemValue1=").append(itemValue1);
        sb.append(", item2=").append(item2);
        sb.append(", itemValue2=").append(itemValue2);
        sb.append(", item3=").append(item3);
        sb.append(", itemValue3=").append(itemValue3);
        sb.append(", item4=").append(item4);
        sb.append(", itemValue4=").append(itemValue4);
        sb.append(", item5=").append(item5);
        sb.append(", itemValue5=").append(itemValue5);
        sb.append(", item6=").append(item6);
        sb.append(", itemValue6=").append(itemValue6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}