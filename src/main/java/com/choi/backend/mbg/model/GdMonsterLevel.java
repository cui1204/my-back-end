package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GdMonsterLevel implements Serializable {
    private Integer id;

    private Integer monsterLevelId;

    private Integer level;

    private Integer type;

    private Integer hp;

    private Integer def;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonsterLevelId() {
        return monsterLevelId;
    }

    public void setMonsterLevelId(Integer monsterLevelId) {
        this.monsterLevelId = monsterLevelId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", monsterLevelId=").append(monsterLevelId);
        sb.append(", level=").append(level);
        sb.append(", type=").append(type);
        sb.append(", hp=").append(hp);
        sb.append(", def=").append(def);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}