package com.ks.dao.impl;

import com.ks.advanced.impl.UserRowMapper;
import com.ks.dao.UserDao;
import com.ks.entity.User;
import com.ks.utils.DaoUtils;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private DaoUtils<User> daoUtils = new DaoUtils();
    @Override
    public int insert(User user) throws SQLIntegrityConstraintViolationException {
        String sql = "insert into user(user_id,password,kind) values(?,?,?)";
        return daoUtils.commonsUpdate(sql,user.getUserID(),user.getPassword(),user.getUserKind());
    }

    @Override
    public int update(User user) throws SQLIntegrityConstraintViolationException {
        String sql = "update user set password = ? where user_id = ？";
        return daoUtils.commonsUpdate(sql,user.getPassword(),user.getUserID());
    }

    @Override
    public int delete(int id) throws SQLIntegrityConstraintViolationException {
        String sql = "delete from user where user_id = ？";
        return daoUtils.commonsUpdate(sql,id);
    }

    @Override
    public User select(int id) {
        String sql = "select * from user where user_id=?";
        List<User> list = daoUtils.commonsSelect(sql, new UserRowMapper(), id);
        if (!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<User> selectAll() {
        String sql = "select * from user";
        List<User> list = daoUtils.commonsSelect(sql, new UserRowMapper(), null);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }
}
