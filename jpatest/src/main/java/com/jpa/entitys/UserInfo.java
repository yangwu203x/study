package com.jpa.entitys;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/12 0012 14:05
 */
@Entity
@Table(name = "t_userinfo")
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
