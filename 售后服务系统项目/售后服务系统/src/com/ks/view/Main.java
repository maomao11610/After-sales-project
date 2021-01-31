package com.ks.view;

import com.ks.dao.impl.UserInformationDaoImpl;
import com.ks.entity.User;
import com.ks.service.impl.IndentServiceImpl;
import com.ks.service.impl.UserInformationServiceImpl;
import com.ks.service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = signing();
        if (user.getUserKind().equals("客户")){
            user(user);
        }
        if (user.getUserKind().equals("客服")){
            service(user);
        }
        if (user.getUserKind().equals("维修员")){
            worker(user);
        }
        if (user.getUserKind().equals("管理员")){
            admin(user);
        }

    }

    public static User signing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++售后服务系统+++++++");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("请输入要进行的操作（1/2）");
        int flag = scanner.nextInt();
        if (flag == 1){
            System.out.println("+++++++售后服务系统+++++++");
            System.out.print("账号:");
            int id = scanner.nextInt();
            System.out.print("密码:");
            String password = scanner.next();
            User sign = new UserServiceImpl().sign(id, password);
            return sign;
        }
        if (flag == 2){
            new UserServiceImpl().register();
        }
        return null;
    }

    //用户
    public static void user(User user){
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.nextInt()){
                case 1:
                    new IndentServiceImpl().createIndent(new UserInformationDaoImpl().select(user.getUserID()));
                    break;
                case 2:
                    new UserInformationServiceImpl().UpdateOwnInf(user.getUserID());
                    break;
                case 3:
                    new IndentServiceImpl().payment(user.getUserID());
                    break;
                case 4:
                    new IndentServiceImpl().checkCanComment(user.getUserID());
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    //客服
    public static void service(User user){
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.nextInt()){
                case 1:
                    new IndentServiceImpl().serviceCheckIndent();
                    break;
                case 2:
                    new IndentServiceImpl().newOrder(user.getUserID());
                    break;
                case 3:
                    new UserInformationServiceImpl().UpdateOwnInf(user.getUserID());
                    break;
                case 4:
                    new IndentServiceImpl().checkComment();
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    //维修人员
    public static void worker(User user){
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.nextInt()){
                case 1:
                    new IndentServiceImpl().workerCheckIndent();
                    break;
                case 2:
                    new UserInformationServiceImpl().UpdateOwnInf(user.getUserID());
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    //系统管理员
    public static void admin(User user){
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("分配客服账号");
                    System.out.println("请输入账户:");
                    int user_service = scanner.nextInt();
                    System.out.println("请输入密码:");
                    String password1 = scanner.next();
                    new UserServiceImpl().newAccount(user_service,password1,"客服");
                    break;
                case 2:
                    System.out.println("分配客服账号");
                    System.out.println("请输入账户:");
                    int user_worker = scanner.nextInt();
                    System.out.println("请输入密码:");
                    String password2 = scanner.next();
                    new UserServiceImpl().newAccount(user_worker,password2,"维修员");
                    break;
                case 3:
                    new UserInformationServiceImpl().UpdateOwnInf(user.getUserID());
                    break;
                case 4:
                    new IndentServiceImpl().checkIndent();
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }
}

