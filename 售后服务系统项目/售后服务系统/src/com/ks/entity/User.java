package com.ks.entity;

public class User {
    private int userID;
    private String password;
    private String userKind;

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", userKind='" + userKind + '\'' +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserKind() {
        return userKind;
    }

    public void setUserKind(String userKind) {
        this.userKind = userKind;
    }

    public User() {
    }

    public User(int userID, String password, String userKind) {
        this.userID = userID;
        this.password = password;
        this.userKind = userKind;
    }
}
