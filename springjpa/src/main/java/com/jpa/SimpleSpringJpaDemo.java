package com.jpa;

import com.jpa.daos.UserDao;
import com.jpa.entitys.AccountInfo;
import com.jpa.entitys.UserInfo;
import com.jpa.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:28
 */
public class SimpleSpringJpaDemo {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-demo-cfg.xml");
//        UserDao userDao =  ctx.getBean("userDao",UserDao.class);
//        AccountInfo accountInfo = new AccountInfo();
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("Zhangjianping");
//        userInfo.setPassword("123555");
//        accountInfo.setBalance(1);
//        accountInfo.setUserInfo(userInfo);
//        Long result = userDao.save(accountInfo);
//        System.out.println(result);
        UserService userService = ctx.getBean("userService",UserService.class);
        userService.createNewAccount("Zhangjianping","123555",1);

    }
}
