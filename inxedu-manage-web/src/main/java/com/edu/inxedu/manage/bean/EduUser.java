package com.edu.inxedu.manage.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class EduUser implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String passWord;
    @Column
    private String  userName;
    @Column
    private String showName;
    @Column
    private Integer sex;
    @Column
    private Integer age;
    @Column
    private Timestamp createTime;
    @Column
    private Integer isAvalible;
    @Column
    private String picImg;
    @Column
    private String bannerUrl;
    @Column
    private Integer sysMsgNum;
    @Column
    private Timestamp lastSystemTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getIsAvalible() {
        return isAvalible;
    }

    public void setIsAvalible(Integer isAvalible) {
        this.isAvalible = isAvalible;
    }

    public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Integer getSysMsgNum() {
        return sysMsgNum;
    }

    public void setSysMsgNum(Integer sysMsgNum) {
        this.sysMsgNum = sysMsgNum;
    }

    public Timestamp getLastSystemTime() {
        return lastSystemTime;
    }

    public void setLastSystemTime(Timestamp lastSystemTime) {
        this.lastSystemTime = lastSystemTime;
    }
}
