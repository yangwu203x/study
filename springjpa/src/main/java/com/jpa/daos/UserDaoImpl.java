package com.jpa.daos;

import com.jpa.entitys.AccountInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:13
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Long save(AccountInfo accountInfo) {
        em.persist(accountInfo);
        return accountInfo.getAccountId();
    }
}
