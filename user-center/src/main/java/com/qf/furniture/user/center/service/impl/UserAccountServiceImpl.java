package com.qf.furniture.user.center.service.impl;

import com.qf.furniture.entity.UserAccount;
import com.qf.furniture.exception.CodeStatus;
import com.qf.furniture.exception.GlobalExceptions;
import com.qf.furniture.user.center.mapper.UserAccountMapper;
import com.qf.furniture.user.center.mapper.UserDataMapper;
import com.qf.furniture.user.center.service.IUserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.furniture.utils.GetNickName;
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

    @Autowired
    private UserDataMapper userDataMapper;

    /**
     * 注册
     * @param userAccount   用户账号对象
     * @return  结果集
     */
    @Override
    public Integer addUserAccount(UserAccount userAccount) {
        Long uid = Long.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")))
                + new Random().nextInt(99) + 900;
        userAccount.setUid(uid);
        Long resultUid = userAccountMapper.checkUserAccount(userAccount.getUserName());
        if (resultUid == null){
            throw new GlobalExceptions(CodeStatus.ACCOUNT_EXISTS_ERROR);
        } else {
            Integer integer = userDataMapper.initUserData(uid, GetNickName.getStringRandom(10));
            if (null == integer){
                throw new GlobalExceptions(CodeStatus.FAIL);
            }
        }
        return userAccountMapper.addUserAccount(userAccount);
    }

    /**
     * 登录
     * @param userName  用户名(账号, 手机, 邮箱)
     * @param password  密码
     * @return  用户id
     */
    @Override
    public Long login(String userName, String password) {
        UserAccount userAccount = userAccountMapper.login(userName);
        if (null == userAccount) {
            throw new GlobalExceptions(CodeStatus.NO_ACCOUNT_ERROR);
        } else if (!password.equals(userAccount.getPassword())) {
            throw new GlobalExceptions(CodeStatus.PASSWORD_ERROR);
        }
        return userAccount.getUid();
    }
}
