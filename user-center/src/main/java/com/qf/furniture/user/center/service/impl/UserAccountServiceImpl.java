package com.qf.furniture.user.center.service.impl;

import com.cs.furniture.user.center.user.entity.UserAccount;
import com.cs.furniture.user.center.user.mapper.UserAccountMapper;
import com.cs.furniture.user.center.user.service.IUserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户表，用于登录 服务实现类
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements IUserAccountService {

}
