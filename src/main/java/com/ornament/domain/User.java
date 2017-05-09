package com.ornament.domain;

import java.util.Date;

/**
 * Created by chenshuguo on 2017/5/9.
 */
public class User {
    private int account;  //账户：唯一，用来辨识用户
    private String password;  //密码
    private String userName; //姓名
    private String userId;  //工号
    private String userTel;  //电话
    private int userSex; //性别
    private Date userBirthday; //生日
    private String userAddress; //地址
    private float userSalary;  //员工月工资：由于没有工资系统故员工在注册时自行填入
    private int userAvailable; //注册用户为0；授权后为1。注册用户只可以查看自己信息，授权后才可以使用系统。

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public float getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(float userSalary) {
        this.userSalary = userSalary;
    }

    public int getUserAvailable() {
        return userAvailable;
    }

    public void setUserAvailable(int userAvailable) {
        this.userAvailable = userAvailable;
    }

    @Override
    public String toString() {
        return "User{" +
                "account=" + account +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userSex=" + userSex +
                ", userBirthday=" + userBirthday +
                ", userAddress='" + userAddress + '\'' +
                ", userSalary=" + userSalary +
                ", userAvailable=" + userAvailable +
                '}';
    }
}
