package com.didispace.core.service;

import com.didispace.Application;
import com.didispace.core.bean.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author leo_Yang【音特】
 * @Date 2018/1/17 0017 16:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class IUserInfoServiceTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void findUserInfoByUsername(){
        String username = "admin";
        UserInfo userInfo = userInfoService.findByUsername(username);
        System.out.println(userInfo.toString());
    }
}
