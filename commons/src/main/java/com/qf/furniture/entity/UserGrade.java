package com.qf.furniture.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户权限等级
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public class UserGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 头衔
     */
    private String title;

    /**
     * 经验值
     */
    private Long experience;

    /**
     * 积分
     */
    private Long integral;

    /**
     * 角色
     */
    private String role;

    /**
     * 角色修改时间
     */
    private LocalDateTime roleUpdateTime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public LocalDateTime getRoleUpdateTime() {
        return roleUpdateTime;
    }

    public void setRoleUpdateTime(LocalDateTime roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }

    @Override
    public String toString() {
        return "UserGrade{" +
            "uid=" + uid +
            ", title=" + title +
            ", experience=" + experience +
            ", integral=" + integral +
            ", role=" + role +
            ", roleUpdateTime=" + roleUpdateTime +
        "}";
    }
}
