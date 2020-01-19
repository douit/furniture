package com.qf.furniture.entity;

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

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 手机绑定日期
     */
    private LocalDateTime mobileBindTime;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 邮箱绑定日期
     */
    private LocalDateTime emailBindTime;

    private String accessToken;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
            "id=" +
            ", uid=" + uid +
            ", userName=" + userName +
            ", password=" + password +
            ", mobile=" + mobile +
            ", mobileBindTime=" + mobileBindTime +
            ", email=" + email +
            ", emailBindTime=" + emailBindTime +
            ", createTime=" +
            ", accessToken=" + accessToken +
            ", isDelete=" +
        "}";
    }
}
