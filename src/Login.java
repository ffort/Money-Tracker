import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import DataBaseConn.DB;

import com.mysql.jdbc.Connection;


public class Login{
	
	public Login() throws SQLException{
	
		
	DB db = new DB();
	Connection connection =	(Connection) db.dbConnect(db.CONN_STRING,db.USERNAME,db.PASSWORD);
	Statement stmt = (Statement) connection.createStatement();
	Scanner myScanner = new Scanner(System.in);	
	
	System.out.println("Please enter your username:");
	String username = myScanner.nextLine();
	
	System.out.println("Please enter your password:");
	String password = myScanner.nextLine();
	
	String sql = "SELECT username, password FROM Account_Information";
	ResultSet rs = stmt.executeQuery(sql);
	
	while(rs.next()){
		String user = rs.getString("username");
		String pass = rs.getString("password");
		
		if((username.equals(user)) && (password.equals(pass))){
			System.out.println("User Found");	
		}else if((username.equals(user)) && (!password.equals(pass))){
			System.out.println("Wrong Password");
		}else{
			System.out.println("User Not Found");
		}
		break;
	}
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

		}
	}