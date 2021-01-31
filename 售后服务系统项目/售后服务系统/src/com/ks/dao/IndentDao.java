package com.ks.dao;

import com.ks.entity.Indent;
import com.ks.entity.User;

import java.util.List;

public interface IndentDao {
    public int insert(Indent indent);

    public int update(Indent indent);

    public int delete(int indent_id);

    public Indent select(int indent_id);

    public List<Indent> selectAll();

    public List<Indent> selectAll_over();

    public List<Indent> selectAll_service();

    public List<Indent> selectAll_worker();

    public List<Indent> selectAll_comment();
}
