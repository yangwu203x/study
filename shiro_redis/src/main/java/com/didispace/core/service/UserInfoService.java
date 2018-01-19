package com.didispace.core.service;


import com.didispace.core.bean.UserInfo;

public interface UserInfoService {
	
	/**通过username查找用户信息;*/
	public UserInfo findByUsername(String username);
	
}
