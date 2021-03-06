package com.qf.furniture.user.center.service;

import com.qf.furniture.entity.UserAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户账户表，用于登录 服务类
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public interface IUserAccountService extends IService<UserAccount> {

    /**
     * 添加用户
     */
    Integer addUserAccount(UserAccount userAccount);

    /**
     * 账号密码校验
     */
    Long login(String userName, String password);
}
