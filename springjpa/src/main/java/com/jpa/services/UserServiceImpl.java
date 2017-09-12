package com.jpa.services;

import com.jpa.daos.UserDao;
import com.jpa.daos.UserDaoImpl;
import com.jpa.entitys.AccountInfo;
import com.jpa.entitys.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:11
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public Long createNewAccount(String username, String password, Integer initBalance){
// 封装域对象
        AccountInfo accountInfo = new AccountInfo();
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        accountInfo.setBalance(initBalance);
        accountInfo.setUserInfo(userInfo);
// 调用持久层，完成数据的保存
        return userDao.save(accountInfo);
    }
}
