package com.qf.furniture.user.center.service.impl;

import com.qf.furniture.entity.UserData;
import com.qf.furniture.exception.CodeStatus;
import com.qf.furniture.exception.GlobalExceptions;
import com.qf.furniture.user.center.mapper.UserDataMapper;
import com.qf.furniture.user.center.service.IUserDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户个人资料 服务实现类
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
@Service
public class UserDataServiceImpl extends ServiceImpl<UserDataMapper, UserData> implements IUserDataService {

    @Autowired
    private UserDataMapper userDataMapper;

    @Override
    public Integer initUserData(Long uid, String nickName) {
        Integer integer = userDataMapper.initUserData(uid, nickName);
        if (null == integer) {
            throw new GlobalExceptions(CodeStatus.FAIL);
        }
        return integer;
    }
}
