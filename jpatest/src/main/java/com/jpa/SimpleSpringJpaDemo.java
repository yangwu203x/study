package com.jpa;

import com.jpa.services.UserServiceImpl;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:28
 */
public class SimpleSpringJpaDemo {
    public static void main(String[] args){
        new UserServiceImpl().createNewAccount("Zhangjianping","123555",1);
    }
}
