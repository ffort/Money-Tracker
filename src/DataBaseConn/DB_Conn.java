package DataBaseConn;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DB_Conn {
	
	private static final String USERNAME = "drico7041";
	private static final String PASSWORD = "gastate23";
	private static final String CONN_STRING = "jdbc:mysql://127.0.0.1:3306/Account_Information";
	
	public static void main(String[] args) throws SQLException {
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		java.sql.Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
			System.out.println("connected");		
		} catch (SQLException e){
			System.err.println(e);
		} finally {
			if (conn != null){
				conn.close();
			}
		}

	}

}
