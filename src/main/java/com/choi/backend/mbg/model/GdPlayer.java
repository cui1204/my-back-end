package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GdPlayer implements Serializable {
    private Long id;

    private Integer playerId;

    private String name;

    private Integer type;

    private String resName;

    private String resNameGun;

    private Integer hp;

    private Integer atk;

    private Integer def;

    private Integer critical;

    private Integer atkSpeed;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResNameGun() {
        return resNameGun;
    }

    public void setResNameGun(String resNameGun) {
        this.resNameGun = resNameGun;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(Integer atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", playerId=").append(playerId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", resName=").append(resName);
        sb.append(", resNameGun=").append(resNameGun);
        sb.append(", hp=").append(hp);
        sb.append(", atk=").append(atk);
        sb.append(", def=").append(def);
        sb.append(", critical=").append(critical);
        sb.append(", atkSpeed=").append(atkSpeed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}