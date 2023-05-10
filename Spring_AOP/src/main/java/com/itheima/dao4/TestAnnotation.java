package com.itheima.dao4;

import com.itheima.dao3.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        UserDao userDao = context.getBean("userDao",UserDao.class);
        userDao.delete();
        userDao.insert();
        userDao.select();
        userDao.update();
    }}
