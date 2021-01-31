package com.ks.dao.impl;

import com.ks.advanced.impl.IndentRowMapper;
import com.ks.dao.IndentDao;
import com.ks.entity.Indent;
import com.ks.utils.DaoUtils;
import com.ks.utils.DbUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class IndentDaoImpl implements IndentDao {
    private DaoUtils<Indent> daoUtils = new DaoUtils();

    @Override
    public int insert(Indent indent) {
        String sql = "insert into indent(user_id,user_name,user_sex,user_phonenum,user_address," +
                "service_id,worker_id,maintain_kind,cost,is_cost,is_order,is_over,user_comment) " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return daoUtils.commonsUpdate(sql,indent.getUser_id(),indent.getUser_name(),indent.getUser_sex(),indent.getUser_address(),
                indent.getService_id(),indent.getWorker_id(),indent.getMaintain_kind(),indent.getCost(),indent.isIs_cost(),
                indent.isIs_order(),indent.isIs_over(),indent.getUser_comment());
    }

    @Override
    public int update(Indent indent) { return 0; }

    @Override
    public int delete(int indent_id) {
        return 0;
    }

    @Override
    public Indent select(int indent_id) {
        String sql = "select * from indent where user_id=?";
        List<Indent> list = daoUtils.commonsSelect(sql, new IndentRowMapper(), indent_id);
        if (!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Indent> selectAll() {
        String sql = "select * from indent";
        List<Indent> list = daoUtils.commonsSelect(sql, new IndentRowMapper(), null);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }

    @Override
    public List<Indent> selectAll_over() {
        String sql = "select * from indent where is_over=true";
        List<Indent> list = daoUtils.commonsSelect(sql, new IndentRowMapper(), null);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }

    public List<Indent> selectAll_user_comment(int id) {
        String sql = "select * from indent where is_over=1 and user_id=?";
        List<Indent> list = daoUtils.commonsSelect(sql, new IndentRowMapper(), id);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }

    @Override
    public List<Indent> selectAll_service() {
        String sql = "select * from indent where is_cost=true";
        List<Indent> list = daoUtils.commonsSelect(sql, new IndentRowMapper(), null);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }

    @Override
    public List<Indent> selectAll_worker() {
        String sql = "select * from indent where is_order=true";
        List<Indent> list = daoUtils.commonsSelect(sql, new IndentRowMapper(), null);
        if (!list.isEmpty()){
            return list;
        }
        return null;
    }


    @Override
    public List<Indent> selectAll_comment() {
        String sql = "select user_id,user_comment from indent where user_comment is not null";
        try {
            ResultSet resultSet = DbUtils.getConnection().prepareStatement(sql).executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
