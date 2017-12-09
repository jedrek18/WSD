package com.example.demo.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Deprecated
@Entity
@Table(name = "users")
public class UserAccount {

    @Column(name = "idUsers")
    String idUsers;
    @Column(name = "userName")
    String userName;
    @Column(name = "userPassword")
    String userPassword;

    public UserAccount() {
    }

    public UserAccount(String idUsers, String userName, String userPassword) {
        this.idUsers = idUsers;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void setIdUsers(String idUsers) {
        this.idUsers = idUsers;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getIdUsers() {

        return idUsers;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

}
