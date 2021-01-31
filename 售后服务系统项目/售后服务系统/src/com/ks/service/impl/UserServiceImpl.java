package com.ks.service.impl;

import com.ks.dao.impl.UserDaoImpl;
import com.ks.entity.User;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class UserServiceImpl {

    //登录事务
    public User sign(int userID, String passWord){
        UserDaoImpl userDao = new UserDaoImpl();

        //1.组织完善业务功能
        //1.1验证userID是否正确
        User user = userDao.select(userID);
        if (user == null){
            System.out.println("账户不存在");
            return null;
        }
        //1.2验证userID的密码是否正确
        if (!user.getPassword().equals(passWord)){
            System.out.println("密码错误");
        }
        //1.3验证账户身份
        switch (user.getUserKind()){
            case "客户":
                System.out.println("欢迎用户登录");
                System.out.println("1.请求维修");
                System.out.println("2.维护个人信息");
                System.out.println("3.付费");
                System.out.println("4.评论");
                break;
            case "客服":
                System.out.println("欢迎客服登录");
                System.out.println("1.查看维修服务请求");
                System.out.println("2.派单");
                System.out.println("3.维护个人信息");
                System.out.println("4.查看评论");
                break;
            case "维修员":
                System.out.println("欢迎维修员登录");
                System.out.println("1.查看派单");
                System.out.println("2.维护个人信息");
                break;
            case "管理员":
                System.out.println("欢迎管理员登录");
                System.out.println("1.管理公司客服信息");
                System.out.println("2.管理维修人员信息");
                System.out.println("3.维护个人信息");
                System.out.println("4.查看售后服务情况");
                break;
            default:
                System.out.println("信息错误！请联系管理员。电话:17382638826");
        }
        System.out.println("请输入对应编号进行操作");
        return user;
    }

    //注册
    public void register(){
        Scanner scanner = new Scanner(System.in);
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.print("账号:");
        int id = scanner.nextInt();
        System.out.print("密码:");
        String password = scanner.next();
        try {
            userDao.insert(new User(id,password,"客户"));
            System.out.println("注册成功！");
        } catch (Exception e) {
            System.out.println("账号已存在，请重新注册！");
        }
    }

    //给客服或维修人员分配账号
    public void newAccount(int userID, String passWord, String kind)  {
        try {
            new UserDaoImpl().insert(new User(userID, passWord, kind));
        } catch (SQLIntegrityConstraintViolationException throwables) {
            throwables.printStackTrace();
        }
    }
}
