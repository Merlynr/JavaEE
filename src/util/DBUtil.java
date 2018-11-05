package util;

import java.io.Serializable;
import java.sql.*;

public class DBUtil implements Serializable{
	private static String jdbcUrl="jdbc:mysql://localhost:3306/blog?serverTimezone=UTC";
    private static String username="root";
    private static String password="lcq21945@";

    public DBUtil() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public boolean isConnectedOK() {
        boolean ok = false;
        Connection conn = null;
        SQLException ex = null;
        try {
            conn= DriverManager.getConnection(jdbcUrl,username,password);
            if (!conn.isClosed()) {
                ok = true;
            }
        } catch (SQLException e) {
            ex = e;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    if (ex == null) {
                        ex = e;
                    }
                }
            }
            if (ex != null) {
                throw new RuntimeException(ex);
            }
        }
        return ok;
    }
    
    public static Connection getConnection(){
    	try {
    		Connection connection =DriverManager.getConnection(jdbcUrl,username,password);
    		return connection;
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	return null;
    }
    
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
    	try {
    		preparedStatement.close();
		} catch (SQLException ex) {
			System.out.println(".......statment's error......" );
			System.out.println(ex.toString());
		}
		try {
			connection.close();
		} catch (SQLException ex) {
			System.out.println(".......connection's error......" );
			System.out.println(ex.toString());
		}
    	
    }
}
