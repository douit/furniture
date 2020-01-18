package com.qf.furniture.exception;

import com.qf.furniture.entity.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author CHAN
 * @date 2020/01/18
 */
@RestControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler(value = GlobalExceptions.class)
    public ResponseResult responseResult(Exception ex){
        ResponseResult responseResult = new ResponseResult();
        if (ex instanceof GlobalExceptions){
            responseResult.setCode(((GlobalExceptions) ex).getCode());
            responseResult.setMsg(ex.getMessage());
            return responseResult;
        }
        responseResult.setCode(CodeStatus.FAIL.getCode());
        responseResult.setMsg(ex.getMessage());
        return responseResult;
    }
}
