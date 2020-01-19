package com.qf.furniture.user.center.service.impl;

import com.qf.furniture.entity.UserAccount;
import com.qf.furniture.exception.CodeStatus;
import com.qf.furniture.exception.GlobalExceptions;
import com.qf.furniture.user.center.mapper.UserAccountMapper;
import com.qf.furniture.user.center.service.IUserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

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

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public Integer addUserAccount(UserAccount userAccount) {
        Long uid = Long.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")))
                + new Random().nextInt(99) + 900;
        userAccount.setUid(uid);
        Long resultUid = userAccountMapper.checkUserAccount(userAccount.getUserName());
        if (resultUid == null){
            throw new GlobalExceptions(CodeStatus.ACCOUNT_EXISTS_ERROR);
        }
        return userAccountMapper.addUserAccount(userAccount);
    }
}
