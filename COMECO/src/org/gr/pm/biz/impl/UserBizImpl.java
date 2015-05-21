package org.gr.pm.biz.impl;

import org.gr.pm.biz.IUserBiz;
import org.gr.pm.dao.IUserDao;
import org.gr.pm.dao.impl.UserDaoImpl;
import org.gr.pm.po.User;

public class UserBizImpl implements IUserBiz {
	private IUserDao userDao;

	public UserBizImpl() {
		super();
		// TODO Auto-generated constructor stub
		this.userDao=new UserDaoImpl();
		
		
		//System.out.println(userDao.selsectByEmail("dgzxczh@163.com"));
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insert(user);
	}

	@Override
	public User searchByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.selsectByEmail(email);
	}

	@Override
	public User searchById(int id) {
		// TODO Auto-generated method stub
		return userDao.selectById(id);
	}

}
