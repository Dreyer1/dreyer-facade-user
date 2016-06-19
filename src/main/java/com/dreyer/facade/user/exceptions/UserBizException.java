package com.dreyer.facade.user.exceptions;

import com.dreyer.common.exception.BizException;

/**
 * @author: Dreyer
 * @date: 16/3/20 上午11:49
 * @description: 用户模块业务异常类, 异常代码8位数字组成, 前4位固定1001打头, 后4位自定义
 */
public class UserBizException extends BizException {
    /**
     * 用户名已存在
     */
    public static final UserBizException USERNAME_IS_EXIST = new UserBizException("用户名已存在", 1001001);

    /**
     * 用户不存在
     */
    public static final UserBizException USER_IS_NOT_EXIST = new UserBizException("用户不存在", 1001002);

    public UserBizException() {
    }

    public UserBizException(String msg, int code) {
        super(msg, code);
    }

    public UserBizException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserBizException(Throwable cause) {
        super(cause);
    }

    public UserBizException(String message) {
        super(message);
    }
}
