package com.qf.furniture.exception;

/**
 * @author CHAN
 * @date 2020/01/18
 */
public class GlobalExceptions extends RuntimeException {

    private Integer code;

    public GlobalExceptions(CodeStatus status) {
        super(status.getMsg());
        this.code = status.getCode();
    }

    public GlobalExceptions(Integer code, String msg){
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
