package com.jpa.services;


import com.jpa.entitys.AccountInfo;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:10
 */
public interface UserService {
    AccountInfo createNewAccount(String user, String pwd, Integer init);
    AccountInfo findAccountById(Long id);
}
