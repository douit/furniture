package com.qf.furniture.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户个人资料
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别(1男，2女)
     */
    private Integer gender;

    /**
     * 生日
     */
    private LocalDateTime birth;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 头像
     */
    private String face;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UserData{" +
            "uid=" + uid +
            ", nickName=" + nickName +
            ", gender=" + gender +
            ", birth=" + birth +
            ", signature=" + signature +
            ", face=" + face +
            ", updateTime=" + updateTime +
        "}";
    }
}
