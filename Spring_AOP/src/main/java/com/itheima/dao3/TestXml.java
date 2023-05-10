package com.itheima.dao3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml{
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=context.getBean("userDao",UserDao.class);
        userDao.delete();
        userDao.insert();
        userDao.select();
        userDao.update();
    }
}
