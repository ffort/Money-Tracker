import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import DataBaseConn.*;


public class New_User {

	public New_User() {
		Statement sqlStatement = null;
		
		DB db = new DB();
		Connection connection =	(Connection) db.dbConnect(db.CONN_STRING,db.USERNAME,db.PASSWORD);
		Scanner myScanner = new Scanner(System.in);
		
		
		System.out.println("Please enter your first name:");
		String F_name = myScanner.nextLine();
		
		System.out.println("Please enter your last name:");
		String L_name = myScanner.nextLine();
		
		System.out.println("Please enter your username:");
		String username = myScanner.nextLine();
		
		System.out.println("Please enter your password:");
		String password = myScanner.nextLine();	
		
		System.out.println("Please enter the amount you would like to deposit intially:");
		String initial_money = myScanner.nextLine(); // This needs to be changed into an integer type class and needs to only allow two decimal places
		
		
		
		String sqlString = "INSERT INTO `Account_Information`(`First_Name`, `Last_Name`, `Username`, `Password`, `Balance`) VALUES (" + "'" + F_name + "', '" + L_name + "', '" + username + "', '" + password + "', '" + initial_money + "' )";
		
		
	
		try {
			sqlStatement = (Statement) connection.createStatement();
			sqlStatement.executeUpdate(sqlString);

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.dbClose(connection);
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
	}
}
