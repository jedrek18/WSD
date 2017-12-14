package com.example.WSD.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    Long id;

    String nickName;

    String fistName;

    String lastName;

    String mailAddress;

    String userFunction;

    String password;

    String sid;

    public User() {
    }

    @Id
    @Column(name = "ID_USER")
    public Long getId() {
        return id;
    }

    @Column(name = "USER_NAME")
    public String getNickName() {
        return nickName;
    }

    @Column(name = "FIRST_NAME")
    public String getFistName() {
        return fistName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "MAIL")
    public String getMailAddress() {
        return mailAddress;
    }

    @Column(name="FUNCTION")
    public String getUserFunction() {
        return userFunction;
    }

    @Column(name="PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="SID")
    public String getSid() {
        return sid;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setUserFunction(String userFunction) {
        this.userFunction = userFunction;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public User(Long id, String nickName, String fistName, String lastName, String mailAddress, String userFunction, String password, String sid) {
        this.id = id;
        this.nickName = nickName;
        this.fistName = fistName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.userFunction = userFunction;
        this.password = password;
        this.sid = sid;
    }
}
