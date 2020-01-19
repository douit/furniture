package com.qf.furniture.entity;

import java.io.Serializable;

/**
 * <p>
 * 用户关注
 * </p>
 *
 * @author CHAN
 * @since 2020-01-19
 */
public class UserFollow implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 关注用户id
     */
    private Integer followUid;

    /**
     * 关注(1关注，0取消)
     */
    private Integer isFollow;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getFollowUid() {
        return followUid;
    }

    public void setFollowUid(Integer followUid) {
        this.followUid = followUid;
    }
    public Integer getIsFollow() {
        return isFollow;
    }

    public void setIsFollow(Integer isFollow) {
        this.isFollow = isFollow;
    }

    @Override
    public String toString() {
        return "UserFollow{" +
            "uid=" + uid +
            ", followUid=" + followUid +
            ", isFollow=" + isFollow +
        "}";
    }
}
