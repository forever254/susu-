package com.etc.sky.dao;

import com.etc.sky.domain.User;

public interface UserDAO {

	/**
	 * �û���¼
	 * 
	 * @param account
	 *            �û���
	 * @return
	 */
	User login(String account);

}
