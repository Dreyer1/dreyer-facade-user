package com.dreyer.facade.user.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.passowrd
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String passowrd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.display_name
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String displayName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone_number
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creat_time
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private Date creatTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.remark
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_delete
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    private String isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.passowrd
     *
     * @return the value of user.passowrd
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getPassowrd() {
        return passowrd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.passowrd
     *
     * @param passowrd the value for user.passowrd
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd == null ? null : passowrd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.display_name
     *
     * @return the value of user.display_name
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.display_name
     *
     * @param displayName the value for user.display_name
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone_number
     *
     * @return the value of user.phone_number
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone_number
     *
     * @param phoneNumber the value for user.phone_number
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creat_time
     *
     * @return the value of user.creat_time
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creat_time
     *
     * @param creatTime the value for user.creat_time
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.remark
     *
     * @return the value of user.remark
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.remark
     *
     * @param remark the value for user.remark
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_delete
     *
     * @return the value of user.is_delete
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_delete
     *
     * @param isDelete the value for user.is_delete
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sat Mar 19 19:35:36 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", passowrd=").append(passowrd);
        sb.append(", displayName=").append(displayName);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", email=").append(email);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", isDelete=").append(isDelete);
        sb.append("]");
        return sb.toString();
    }
}