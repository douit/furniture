package com.qf.furniture.user.center.mapper;

import com.qf.furniture.entity.UserData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户个人资料 Mapper 接口
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public interface UserDataMapper extends BaseMapper<UserData> {

    /**
     * 初始化用户资料
     * @param uid   用户id
     * @param nickName  昵称
     * @return  影响行数
     */
    Integer initUserData(@Param("uid") Long uid, @Param("nickName") String nickName);
}
