package com.ks.utils;

import com.ks.advanced.RowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 复用增删改查方法
 */
public class DaoUtils<T> {

    /**
     * 公共处理增删改的方法
     * @param sql   执行的sql语句
     * @param args  参数列表
     * @return  受影响的行数
     */
    public int commonsUpdate(String sql , Object... args)  {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = DbUtils.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1,args[i]);
            }

            int result = preparedStatement.executeUpdate();
            return result;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DbUtils.closeAll(null,preparedStatement,null);
        }
        return 0;
    }

    /**
     * 公共处理查的方法
     * @param sql
     * @param rowMapper
     * @param args
     * @return
     */
    public List<T> commonsSelect(String sql, RowMapper<T> rowMapper, Object... args ){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<T> list = new ArrayList<>();

        connection = DbUtils.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);

            if (args != null){
                for (int i = 0; i < args.length; i++) {
                    preparedStatement.setObject(i+1,args[i]);
                }
            }

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                T t = rowMapper.getRow(resultSet);//回调-->调用者提供的一个封装方法ORM
                list.add(t);
            }

            return list;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
