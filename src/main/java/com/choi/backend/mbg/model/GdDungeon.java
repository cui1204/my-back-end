package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GdDungeon implements Serializable {
    private Integer id;

    private Integer dungeonId;

    private String name;

    private String resNameTop;

    private String resNameBottom;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDungeonId() {
        return dungeonId;
    }

    public void setDungeonId(Integer dungeonId) {
        this.dungeonId = dungeonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResNameTop() {
        return resNameTop;
    }

    public void setResNameTop(String resNameTop) {
        this.resNameTop = resNameTop;
    }

    public String getResNameBottom() {
        return resNameBottom;
    }

    public void setResNameBottom(String resNameBottom) {
        this.resNameBottom = resNameBottom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dungeonId=").append(dungeonId);
        sb.append(", name=").append(name);
        sb.append(", resNameTop=").append(resNameTop);
        sb.append(", resNameBottom=").append(resNameBottom);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}