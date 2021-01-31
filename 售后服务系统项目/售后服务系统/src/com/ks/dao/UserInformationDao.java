package com.ks.dao;

import com.ks.entity.User;
import com.ks.entity.UserInformation;

import java.util.List;

public interface UserInformationDao {
    public int insert(UserInformation userInformation);

    public int update(UserInformation userInformation);

    public int delete(int id);

    public UserInformation select(int id);

    public List<UserInformation> selectAll();
}
