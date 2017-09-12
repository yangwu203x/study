package com.jpa.daos;

import com.jpa.entitys.AccountInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:13
 */
public class UserDaoImpl implements UserDao {
    public AccountInfo save(AccountInfo accountInfo) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("SimplePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(accountInfo);
        em.getTransaction().commit();
        emf.close();
        return accountInfo;
    }
}
