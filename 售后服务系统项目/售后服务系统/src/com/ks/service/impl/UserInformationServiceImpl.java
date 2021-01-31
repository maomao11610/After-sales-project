package com.ks.service.impl;

import com.ks.dao.impl.UserInformationDaoImpl;
import com.ks.entity.UserInformation;
import com.ks.service.UserInformationService;

import java.util.Scanner;

public class UserInformationServiceImpl implements UserInformationService {
    @Override
    public void UpdateOwnInf(int id) {
        UserInformationDaoImpl userInformationDao = new UserInformationDaoImpl();
        Scanner scanner = new Scanner(System.in);

        //1.1显示个人信息
        System.out.println("您的个人信息为：");
        System.out.println(userInformationDao.select(id).toString());
        //1.2询问是否需要修改
        System.out.println("请进行下一步操作：1.修改个人信息\t2.返回");
        if (scanner.nextInt()==1){
            System.out.println("请输入个人信息");
            System.out.print("姓名：");
            String name = scanner.next();
            System.out.print("性别：");
            String sex = scanner.next();
            System.out.print("电话：");
            String phonenum = scanner.next();
            userInformationDao.update(new UserInformation(id,name,sex,phonenum));
            System.out.println("修改成功！");
        }else{
            return;
        }
    }
}
