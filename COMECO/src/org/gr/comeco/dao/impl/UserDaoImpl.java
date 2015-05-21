package org.gr.pm.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.gr.pm.dao.IUserDao;
import org.gr.pm.db.ConnectionManager;
import org.gr.pm.db.DBUtils;
import org.gr.pm.po.User;


public class UserDaoImpl implements IUserDao {

	private ConnectionManager connectionManager;
	private Connection connection;
	private DBUtils dbUtils;

	public UserDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		this.connectionManager = new ConnectionManager();
		this.dbUtils = new DBUtils();
		connection = null;
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
		this.connection = this.connectionManager.openConnection();
		// 步骤2：开启一个事务
		// TransactionManager.conn = this.connection;
		// TransactionManager.beginTransaction();

		// 步骤3：拆分对向属性
		// 步骤4：设置添加SQL语句模板
		String strSQL = "insert into user values(null,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = new Object[]  { user.getGender(),user.getEmail(),
				user.getPassword(),user.getName(),user.getLevel(),user.getDistrict(),
				user.getScore(),user.getSchool(),user.getMajor(),user.getIntroduce(),
				user.getImage()};
		// 步骤5：使用dbutils方法实现添加操作
		int affectedRows = this.dbUtils.execOthers(connection, strSQL, params);
		// 步骤6：提交事务
		// if (affectedRows > 0) {
		// 提交事务
		// TransactionManager.commit();
		// } else {
		// 回滚事务
		// TransactionManager.rollback();
		// }
		return affectedRows;
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		// 步骤1：创建一个空的集合准备存放查询的结果
		List<User> lstUser = new ArrayList<User>();
		// 步骤2：获取一个数据库的连接对象
		this.connection = connectionManager.openConnection();
		// 步骤3：创建查询语句的模板
		//String strSQL = "select * from user order by id";
		String strSQL = "select * from user";
		// 步骤4：使用dbutils方法实现查询操作
		ResultSet resultSet = this.dbUtils.execQuery(connection, strSQL,
				new Object[] {});
		// 步骤5：将resultSet结果集转换成List数据结构
		try {
			while (resultSet.next()) {
				// 步骤5-1：创建一个对象
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setGender(resultSet.getInt(2));
				user.setEmail(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setName(resultSet.getString(5));
				user.setLevel(resultSet.getInt(6));
				user.setDistrict(resultSet.getString(7));
				user.setScore(resultSet.getInt(8));
				user.setSchool(resultSet.getString(9));
				user.setMajor(resultSet.getString(10));
				user.setIntroduce(resultSet.getString(11));
				user.setImage(resultSet.getString(12));
				// 步骤5-2：将封装好的对象添加到List集合中
				lstUser.add(user);
			}
			// 返回结果
			return lstUser;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			// 步骤6：关闭数据库连接
			this.connectionManager.closeConnection(connection);
		}

	}

	@Override
	public int deleteById(int userId) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
		this.connection = connectionManager.openConnection();
		// 步骤2：开启事务
		// TransactionManager.connection = this.connection;
		// TransactionManager.beginTransaction();
		// 步骤3：创建SQL语句模板
		String strSQL = "delete from user where id=?";
		Object[] params = new Object[] { userId };
		// 步骤4：调用dbutils中的方法完成对数据库的删除操作
		int affectedRwos = this.dbUtils.execOthers(connection, strSQL, params);
		// 步骤5：根据步骤4的操作结果提交或回滚事务
		// if (affectedRwos > 0) {
		// TransactionManager.commit(); // 事务提交
		// } else {
		// TransactionManager.rollback(); // 事务的回滚
		// }
		// 步骤6：返回影响行数
		return affectedRwos;
	}

	@Override
	public User selectById(int userId) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
		this.connection = connectionManager.openConnection();
		// 步骤2：创建SQL语句模板
		String strSQL = "select * from user where id=?";
		Object[] params = new Object[] { userId };
		// 步骤4：调用dbutils中的方法完成对数据库的查询操作
		ResultSet resultSet = this.dbUtils
				.execQuery(connection, strSQL, params);
		
		try {
			if (resultSet.next()) {
				// 步骤6：创建一个对象
				
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setGender(resultSet.getInt(2));
				user.setEmail(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setName(resultSet.getString(5));
				user.setLevel(resultSet.getInt(6));
				user.setDistrict(resultSet.getString(7));
				user.setScore(resultSet.getInt(8));
				user.setSchool(resultSet.getString(9));
				user.setMajor(resultSet.getString(10));
				user.setIntroduce(resultSet.getString(11));
				user.setImage(resultSet.getString(12));
				// 步骤7：返回对象
				return user;
		} else {
				return null;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			this.connectionManager.closeConnection(connection);
		}

	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
		this.connection = this.connectionManager.openConnection();
		// 步骤2：开启事务
		// TransactionManager.connection = this.connection;
		// TransactionManager.beginTransaction();
		// 步骤3：创建SQL语句模板
		String strSQL = "update user set gender=?, email=?, password=?,"+
		"name=?,level=?,district=?,score=?,school=?,major=?,introduce=?,"+
		"image=? where userId=?";
		Object[] params = new Object[] { user.getGender(),user.getEmail(),
				user.getPassword(),user.getName(),user.getLevel(),user.getDistrict(),
				user.getScore(),user.getSchool(),user.getMajor(),user.getIntroduce(),
				user.getImage(),user.getId()};
		// 步骤4：调用dbutils中的方法完成对数据库的删除操作
		int affectedRwos = this.dbUtils.execOthers(connection, strSQL, params);
		// 步骤5：根据步骤4的操作结果提交或回滚事务
		// if (affectedRwos > 0) {
		// TransactionManager.commit(); // 事务提交
		// } else {
		// TransactionManager.rollback(); // 事务的回滚
		// }
		// 步骤6：返回影响行数
		return affectedRwos;
	}

	@Override
	public User selsectByEmail(String email) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
		this.connection = this.connectionManager.openConnection();
		// 步骤2：创建SQL语句模板
		String strSQL = "select * from user where email=?";
		Object[] params = new Object[] { email };
		// 步骤4：调用dbutils中的方法完成对数据库的查询操作
		ResultSet resultSet = this.dbUtils
				.execQuery(connection, strSQL, params);
		// 步骤5：获取结果集合并封装成一个对象
		try {
			if (resultSet.next()) {
				// 步骤6：创建一个对象
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setGender(resultSet.getInt(2));
				user.setEmail(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setName(resultSet.getString(5));
				user.setLevel(resultSet.getInt(6));
				user.setDistrict(resultSet.getString(7));
				user.setScore(resultSet.getInt(8));
				user.setSchool(resultSet.getString(9));
				user.setMajor(resultSet.getString(10));
				user.setIntroduce(resultSet.getString(11));
				user.setImage(resultSet.getString(12));
				// 步骤7：返回对象
				return user;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			this.connectionManager.closeConnection(connection);
		}

	}

	@Override
	public boolean updatePassword(int userId, String nPassword) {
		// TODO Auto-generated method stub
		// 步骤1：获取一个数据库连接对象
		this.connection = this.connectionManager.openConnection();
		// 步骤2：开启事务
		// TransactionManager.connection = this.connection;
		// TransactionManager.beginTransaction();
		// 步骤3：创建SQL语句模板
		String strSQL = "update user set password=? where id=?";
		Object[] params = new Object[] { nPassword,userId};
		// 步骤4：调用dbutils中的方法完成对数据库的删除操作
		int affectedRwos = this.dbUtils.execOthers(connection, strSQL, params);
		// 步骤5：根据步骤4的操作结果提交或回滚事务
		// if (affectedRwos > 0) {
		// TransactionManager.commit(); // 事务提交
		// } else {
		// TransactionManager.rollback(); // 事务的回滚
		// }
		// 步骤6：返回影响行数
		return affectedRwos>0?true:false;
	}

}
