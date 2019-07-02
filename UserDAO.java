package com.etc.sky.dao;

import com.etc.sky.domain.User;

public interface UserDAO {

	/**
	 * 用户登录
	 * 
	 * @param account
	 *            用户名
	 * @return
	 */
	User login(String account);

}
