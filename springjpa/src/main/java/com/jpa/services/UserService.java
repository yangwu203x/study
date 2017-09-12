package com.jpa.services;


/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:10
 */
public interface UserService {
    Long createNewAccount(String user, String pwd, Integer init);
}
