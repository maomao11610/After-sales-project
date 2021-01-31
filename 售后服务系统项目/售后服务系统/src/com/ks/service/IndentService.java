package com.ks.service;

import com.ks.entity.UserInformation;

public interface IndentService {
    //客户请求维修，创建订单
    void createIndent(UserInformation userInformation);
    //客户付费
    void payment(int user_id);
    //客服查看维修请求
    void serviceCheckIndent();
    //客服派单
    void newOrder(int service_id);
    //客服查看评论
    void checkComment();
    //维修人员查看派单
    void workerCheckIndent();
    //管理员查看售后服务情况
    void checkIndent();
}
