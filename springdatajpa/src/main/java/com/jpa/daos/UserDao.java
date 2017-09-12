package com.jpa.daos;

import com.jpa.entitys.AccountInfo;
import org.springframework.data.repository.Repository;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:12
 */
public interface UserDao extends Repository<AccountInfo,Long> {

    AccountInfo save(AccountInfo accountInfo);

    // 你需要做的，仅仅是新增如下一行方法声明
    AccountInfo findByAccountId(Long accountId);
}
