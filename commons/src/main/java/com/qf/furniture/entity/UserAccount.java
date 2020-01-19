package com.qf.furniture.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户账户表，用于登录
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private String userName;

    private String password;

    private String mobile;

    private LocalDateTime mobileBindTime;

    private String email;

    private LocalDateTime emailBindTime;

    private LocalDateTime createTime;

    private String accessToken;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public LocalDateTime getMobileBindTime() {
        return mobileBindTime;
    }

    public void setMobileBindTime(LocalDateTime mobileBindTime) {
        this.mobileBindTime = mobileBindTime;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getEmailBindTime() {
        return emailBindTime;
    }

    public void setEmailBindTime(LocalDateTime emailBindTime) {
        this.emailBindTime = emailBindTime;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
            "id=" + id +
            ", uid=" + uid +
            ", userName=" + userName +
            ", password=" + password +
            ", mobile=" + mobile +
            ", mobileBindTime=" + mobileBindTime +
            ", email=" + email +
            ", emailBindTime=" + emailBindTime +
            ", createTime=" + createTime +
            ", accessToken=" + accessToken +
            ", isDelete=" + isDelete +
        "}";
    }
}
