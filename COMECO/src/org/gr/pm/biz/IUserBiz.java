package org.gr.pm.biz;

import org.gr.pm.po.User;


public interface IUserBiz {

	int addUser(final User user);

	User searchByEmail(final String email);
	
	User searchById(final int id);
}
