import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

import DataBaseConn.*;
public class Money_Tracker {
	public static void main(String args[]) throws SQLException{
		
		//Sets up scanner for user input
		
		//DB db = new DB();
		//Connection connection = (Connection) db.dbConnect(db.CONN_STRING, db.USERNAME, db.PASSWORD);
		 
		//New_User user = new New_User();
		Login user = new Login();
		
		//db.dbClose(connection);
		
		
		Scanner user_input = new Scanner( System.in );
		
		//Sets variables
		String intial_amount;
			
		//Creates objects to input grab class
		input_grab input_grabObject = new input_grab();
	
		//Prints hello statement
		System.out.println("Hello and welcome to our money tracker program!\n\r");
		
		//Gets withdraw or deposit info from user
		System.out.print("Please enter the amount of money you have: ");
		
		//Grabs user amount input and changes it into an integer
		intial_amount = user_input.next();
		float int_amount = Float.parseFloat(intial_amount);
		
		//Displays amount
		System.out.printf("You have $%.2f", int_amount);
		System.out.print(" dollars\n\r");
		
		//Calls to Input Grab class
		input_grabObject.inital_grab(int_amount);
				
	}
}