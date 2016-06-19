package com.dreyer.facade.user.vo;

import com.dreyer.common.entity.BaseEntity;
import com.dreyer.common.enums.SexEnum;
import com.dreyer.facade.user.entity.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dreyer
 * @date: 16/3/22 下午4:17
 * @description 用户对象VO类
 */
public class UserVo extends BaseEntity {
    /**
     * 主键ID
     */
    private long id;

    /**
     * 展示的昵称
     */
    private String displayName;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 根据User对象构建返回结果所需要的UserVo单个对象
     *
     * @param user
     * @return
     */
    public static UserVo build(User user) {
        UserVo userVo = null;
        if (user == null) {
            return userVo;
        }
        userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setDisplayName(user.getDisplayName());
        userVo.setAge(user.getAge());
        userVo.setEmail(user.getEmail());
        userVo.setPhoneNumber(user.getPhoneNumber());
        userVo.setSex(user.getSex() == null ? "" : user.getSex().equals(SexEnum.MAN.name()) ? "男" : "女");

        return userVo;
    }

    /**
     * 根据User对象集合构建返回结果所需要的UserVo对象集合
     *
     * @param users
     * @return
     */
    public static List<UserVo> build(List<User> users) {
        List<UserVo> result = new ArrayList<UserVo>();
        for (User user : users) {
            result.add(build(user));
        }
        return result;
    }


}
