package com.dreyer.facade.user.service;

import com.dreyer.common.page.PageParam;
import com.dreyer.common.page.Pager;
import com.dreyer.facade.user.entity.User;
import com.dreyer.facade.user.exceptions.UserBizException;
import com.dreyer.facade.user.vo.UserVo;

import java.util.Map;

/**
 * @author: Dreyer
 * @date: 16/6/16 下午10:36
 * @description: 用户服务接口
 */
public interface UserFacade {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean save(User user) throws UserBizException;


    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    boolean deleteById(long id) throws UserBizException;

    /**
     * 更新
     *
     * @param user
     * @return
     */
    boolean update(User user);

    /**
     * 根据主键查找单个对象信息
     *
     * @param id
     * @return
     */
    User findById(long id);

    /**
     * 根据用户名查找
     *
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * 分页查询用户信息列表
     *
     * @param param
     * @param pageParam
     * @return
     */
    Pager<UserVo> list(Map<String, Object> param, PageParam pageParam);

    /**
     * 用户登录
     *
     * @param userName
     * @param passWord
     * @param loginIp
     * @return
     */
    boolean login(String userName, String passWord, String loginIp);
}
