package com.qf.furniture.user.center.mapper;

import com.qf.furniture.entity.UserAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户账户表，用于登录 Mapper 接口
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    /**
     * 添加用户
     */
    Integer addUserAccount(UserAccount userAccount);

    /**
     * 检查账号是否存在
     */
    Long checkUserAccount(String userName);
}
