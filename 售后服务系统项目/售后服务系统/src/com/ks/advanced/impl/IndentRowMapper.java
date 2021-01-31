package com.ks.advanced.impl;

import com.ks.advanced.RowMapper;
import com.ks.entity.Indent;
import com.ks.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IndentRowMapper implements RowMapper<Indent> {
    @Override
    public Indent getRow(ResultSet resultSet) {
        Indent indent = null;
        try {
            int indent_id = resultSet.getInt(1);
            int user_id = resultSet.getInt(2);
            String user_name = resultSet.getString(3);
            String user_sex = resultSet.getString(4);
            String user_phonenum = resultSet.getString(5);
            String user_address = resultSet.getString(6);
            int service_id = resultSet.getInt(7);
            int worker_id = resultSet.getInt(8);
            String maintain_kind = resultSet.getString(9);
            double cost = resultSet.getDouble(10);
            boolean is_cost = resultSet.getBoolean(11);
            boolean is_order = resultSet.getBoolean(12);
            boolean is_over = resultSet.getBoolean(13);
            String user_comment = resultSet.getString(14);
            indent = new Indent(indent_id,user_id,user_name,user_sex,user_phonenum,user_address,service_id,worker_id,maintain_kind,cost,is_cost,is_order,is_over,user_comment);
            return indent;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }
}
