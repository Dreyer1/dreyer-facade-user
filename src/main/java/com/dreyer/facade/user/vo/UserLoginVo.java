package com.dreyer.facade.user.vo;

import com.dreyer.common.entity.BaseEntity;

/**
 * @author: Dreyer
 * @date: 16/6/13 下午11:39
 * @description 用户登录信息
 */
public class UserLoginVo extends BaseEntity {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 登录时间
     */
    private String loginTime;

    /**
     * 登录IP
     */
    private String loginIp;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
