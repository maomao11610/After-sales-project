package com.ks.service.impl;

import com.ks.dao.impl.IndentDaoImpl;
import com.ks.entity.Indent;
import com.ks.entity.UserInformation;
import com.ks.service.IndentService;
import com.ks.utils.DaoUtils;

import java.util.List;
import java.util.Scanner;

public class IndentServiceImpl implements IndentService {

    @Override
    public void createIndent(UserInformation userInformation) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入维修地址:");
        String address = scanner.next();
        System.out.print("请输入维修种类:");
        String maintain_kind = scanner.next();
        String sql = "insert into indent(user_id,user_name,user_sex,user_phonenum,user_address," +
                "maintain_kind,cost) values(?,?,?,?,?,?,?)";
        new DaoUtils<Indent>().commonsUpdate(sql,userInformation.getID(),userInformation.getName(),
                userInformation.getSex(),userInformation.getPhoneNum(),address,maintain_kind,1000*Math.random());
        System.out.println("订单创建成功");
    }

    @Override
    public void payment(int user_id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否支付费用（Y/N）");
        if (scanner.next().equals("Y")){
            String sql = "update indent set is_cost = true where user_id =?";
            new DaoUtils<Indent>().commonsUpdate(sql,user_id);
            System.out.println("支付成功！");
        }else {
            System.out.println("支付失败！");
        }
    }

    @Override
    public void serviceCheckIndent() {
        System.out.println("订单信息：");
        List<Indent> indents = new IndentDaoImpl().selectAll_service();
        for (int i = 0; i < indents.size(); i++) {
            for (Indent indent : indents) {
                System.out.println(indent.toString());
            }
        }
    }

    @Override
    public void newOrder(int service_id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请派单：");
        System.out.println("请输入订单号：");
        int indent_id = scanner.nextInt();
        System.out.println("指定维修人员");
        int worker_id = scanner.nextInt();
        String sql = "update indent set service_id=?,worker_id=? where indent_id=?";
        new DaoUtils<Indent>().commonsUpdate(sql,service_id,worker_id,indent_id);
        System.out.println("派单成功！");
    }

    @Override
    public void checkComment() {
        System.out.println("评论信息为：");
        new IndentDaoImpl().selectAll_comment();
    }

    @Override
    public void workerCheckIndent() {
        System.out.println("派单信息：");
        List<Indent> indents = new IndentDaoImpl().selectAll_worker();
        for (int i = 0; i < indents.size(); i++) {
            for (Indent indent : indents) {
                System.out.println(indent.toString());
            }
        }
    }

    @Override
    public void checkIndent() {
        System.out.println("已完成的订单信息：");
        List<Indent> indents = new IndentDaoImpl().selectAll_over();
        for (int i = 0; i < indents.size(); i++) {
            for (Indent indent : indents) {
                System.out.println(indent.toString());
            }
        }
    }
    //用户评论
    public void checkCanComment(int id){
        System.out.println("可评论订单为");
        List<Indent> indents = new IndentDaoImpl().selectAll_user_comment(id);
        for (Indent indent:indents){
            System.out.println(indent.toString());
        }
        if (indents != null){
            System.out.print("请输入要评论的订单号：");
            Scanner scanner = new Scanner(System.in);
            int indent_id = scanner.nextInt();
            System.out.print("请输入评论内容：");
            String comment = scanner.nextLine();
            String sql = "update indent set user_comment=? where indent_id =?";
            new DaoUtils<Indent>().commonsUpdate(sql,comment,indent_id);
        }else {
            System.out.println("无可评论订单");
        }


    }
}
