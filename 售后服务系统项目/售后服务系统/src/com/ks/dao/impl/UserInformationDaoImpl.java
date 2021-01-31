package com.ks.dao.impl;

import com.ks.advanced.impl.UserInformationRowMapper;
import com.ks.dao.UserInformationDao;
import com.ks.entity.UserInformation;
import com.ks.utils.DaoUtils;

import java.util.List;

public class UserInformationDaoImpl implements UserInformationDao {
    private DaoUtils<UserInformation> daoUtils = new DaoUtils();
    @Override
    public int insert(UserInformation userInformation) {
        String sql = "insert into user_information(user_id,name,sex,phonenum) values(?,?,?,?)";
        return daoUtils.commonsUpdate(sql,userInformation.getID(),userInformation.getName(),userInformation.getSex(),userInformation.getPhoneNum());
    }

    @Override
    public int update(UserInformation userInformation) {
        String sql = "update user_information set name=?,sex=?,phonenum=? where user_id =?";
        return daoUtils.commonsUpdate(sql,userInformation.getName(),userInformation.getSex(),userInformation.getPhoneNum(),userInformation.getID());
    }

    @Override
    //保留，用于后续扩展
    public int delete(int id) {
        String sql = "delete from user_information where user_id = ？";
        return daoUtils.commonsUpdate(sql,id);
    }

    @Override
    public UserInformation select(int id) {
        String sql = "select * from user_information where user_id=?";
        List<UserInformation> list = daoUtils.commonsSelect(sql, new UserInformationRowMapper(),id);
        if (!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<UserInformation> selectAll() {
        String sql = "select * from user_information";
        List<UserInformation> list = daoUtils.commonsSelect(sql, new UserInformationRowMapper(),null);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }
}
