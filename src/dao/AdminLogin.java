package dao;

import java.sql.*;

import model.Admin;
import util.DBUtil;

public class AdminLogin {	
	public static boolean adminLogin(Admin admin) {
		DBUtil db3=new DBUtil();
		Connection  connection  = null;
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		try {
			String sql="select admin_password from admin where admin_name=?";
			connection=db3.getConnection();
			statement=connection.prepareStatement(sql);
			statement.setString(1, admin.getAdminName());
			resultSet=statement.executeQuery();
			System.out.println("shujuku");
			System.out.println(admin.getAdminName());
			while(resultSet.next()) {
				if(resultSet.getString("admin_password").equals(admin.getAdminPassword())) {
					return true;
				}else {
					return false;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db3.close(connection, statement, resultSet);
		}
		return false;
	}
}
