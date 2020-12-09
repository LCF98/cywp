package com.cywp.soft.bean;

import java.math.BigDecimal;

public class User {
    private int id;
    private String name;
    private String account;
    private String password;
    private String sex;
    private String educational;
    private String job;
    private String phoneNumber;
    private String uState;
    private int roleId;

    public User() {
    }

    public User(int id, String name, String account, String password, String sex, String educational, String job, String phoneNumber, String uState, int roleId) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.sex = sex;
        this.educational = educational;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.uState = uState;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getuState() {
        return uState;
    }

    public void setuState(String uState) {
        this.uState = uState;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
