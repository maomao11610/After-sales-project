package com.ks.entity;

public class UserInformation {
    private int ID;
    private String name;
    private String sex;
    private String phoneNum;

    public UserInformation() {
    }

    public UserInformation(int ID, String name, String sex, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


}
