package com.shengruan;

import com.shenruan.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring ioc 环境搭建
 */
public class test01Spring {
    public static void main(String[] args) {
        //1获取容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2根据id 获取对象
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        accountService.findAll();

    }
}
