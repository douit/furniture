package com.qf.furniture.user.center.controller;

import com.qf.furniture.entity.ResponseResult;
import com.qf.furniture.entity.UserAccount;
import com.qf.furniture.exception.CodeStatus;
import com.qf.furniture.exception.GlobalExceptions;
import com.qf.furniture.user.center.service.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户账户表，用于登录 前端控制器
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
@RestController
@RequestMapping("/user-account")
public class UserAccountController {

    @Autowired
    private IUserAccountService userAccountService;

    /**
     * 注册
     * @param userAccount 账号实体类
     * @return  结果集
     */
    @PostMapping(value = "/register")
    private ResponseResult register(@RequestBody UserAccount userAccount){
        Integer result = userAccountService.addUserAccount(userAccount);
        if (result == null){
            throw new GlobalExceptions(CodeStatus.FAIL);
        }
        return new ResponseResult<>(CodeStatus.SUCCESS, result);
    }

    /**
     * 登录
     * @param userName  用户名(账号, 手机, 邮箱)
     * @param password  密码
     * @return  结果集
     */
    @PostMapping(value = "/login")
    private ResponseResult login(@RequestParam String userName, @RequestParam String password){
        return new ResponseResult<>(CodeStatus.SUCCESS, userAccountService.login(userName, password));
    }
}
