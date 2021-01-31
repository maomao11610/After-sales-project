package com.ks.dao;

import com.ks.entity.User;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface UserDao {
    public int insert(User user) throws SQLIntegrityConstraintViolationException;

    public int update(User user) throws SQLIntegrityConstraintViolationException;

    public int delete(int id) throws SQLIntegrityConstraintViolationException;

    public User select(int id);

    public List<User> selectAll();
}
