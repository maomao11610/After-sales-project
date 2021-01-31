package com.ks.advanced.impl;

import com.ks.advanced.RowMapper;
import com.ks.entity.User;
import com.ks.entity.UserInformation;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInformationRowMapper implements RowMapper<UserInformation> {
    @Override
    public UserInformation getRow(ResultSet resultSet) {
        UserInformation userInformation = null;
        try {
            int ID = resultSet.getInt("user_id");
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            String phoneNum = resultSet.getString("phonenum");
            userInformation = new UserInformation(ID, name, sex, phoneNum);
            return userInformation;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
