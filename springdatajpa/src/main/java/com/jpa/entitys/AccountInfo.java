package com.jpa.entitys;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:05
 */
@Entity
@Table(name = "t_accountinfo")
public class AccountInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    @Column(name = "balance")
    private Integer balance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",unique = true,nullable = false,updatable = false)
    private UserInfo userInfo;

    public Long getAccountId() {
        return accountId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", userInfo=" + userInfo +
                '}';
    }
}
