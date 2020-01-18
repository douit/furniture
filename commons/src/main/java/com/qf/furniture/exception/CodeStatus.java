package com.qf.furniture.exception;

/**
 * @author CHAN
 * @date 2020/01/18
 */
public enum  CodeStatus {
    SUCCESS(2000, "成功"),
    FAIL(1000, "失败"),

    NO_PHONE_ERROR(1001, "手机号码不存在"),
    NO_EMAIL_ERROR(1002, "邮箱不存在"),
    NO_ACCOUNT_ERROR(1003, "账号不存在"),
    PHONE_EXISTS_ERROR(1010, "手机号码已存在"),
    EMAIL_EXISTS_ERROR(1011, "邮箱已存在"),
    ACCOUNT_EXISTS_ERROR(1012, "账号已存在"),

    PASSWORD_ERROR(1100, "密码错误"),
    PASSWORD_FORMAT_ERROR(1101, "密码格式有误");

    private Integer code;

    private String msg;

    CodeStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
