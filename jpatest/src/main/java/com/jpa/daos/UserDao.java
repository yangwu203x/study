package com.jpa.daos;

import com.jpa.entitys.AccountInfo;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:12
 */
public interface UserDao {
    AccountInfo save(AccountInfo accountInfo);
}
