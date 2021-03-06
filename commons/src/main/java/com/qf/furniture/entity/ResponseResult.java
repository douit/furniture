package com.qf.furniture.entity;

import com.qf.furniture.exception.CodeStatus;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * @author CHAN
 * @date 2020/01/18
 */
public class ResponseResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResponseResult() {
    }

    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(CodeStatus status, T data) {
        this.code = status.getCode();
        this.msg = status.getMsg();
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
