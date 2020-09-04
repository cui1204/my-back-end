package com.choi.backend.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class GdUser implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "角色索引")
    private Integer player;

    @ApiModelProperty(value = "等级")
    private Integer level;

    @ApiModelProperty(value = "金钱")
    private Integer glod;

    @ApiModelProperty(value = "血量")
    private Integer hp;

    @ApiModelProperty(value = "魔法值")
    private Integer mp;

    @ApiModelProperty(value = "退出时间")
    private Date logoutTime;

    @ApiModelProperty(value = "游戏进度")
    private String schedule;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPlayer() {
        return player;
    }

    public void setPlayer(Integer player) {
        this.player = player;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGlod() {
        return glod;
    }

    public void setGlod(Integer glod) {
        this.glod = glod;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", player=").append(player);
        sb.append(", level=").append(level);
        sb.append(", glod=").append(glod);
        sb.append(", hp=").append(hp);
        sb.append(", mp=").append(mp);
        sb.append(", logoutTime=").append(logoutTime);
        sb.append(", schedule=").append(schedule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}