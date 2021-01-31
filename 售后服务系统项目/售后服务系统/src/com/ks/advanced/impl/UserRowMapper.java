package com.ks.advanced.impl;

import com.ks.advanced.RowMapper;
import com.ks.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User getRow(ResultSet resultSet) {
        User user = null;
        try {
            int userID = resultSet.getInt("user_id");
            String password = resultSet.getString("password");
            String kind = resultSet.getString("kind");
            user = new User(userID,password,kind);
            return user;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
