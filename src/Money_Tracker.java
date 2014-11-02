import java.util.Scanner;

public class Money_Tracker {
	public static void main(String args[]){
		
		//Sets up scanner for user input
		Scanner user_input = new Scanner( System.in );
		
		//Sets variables
		String Deposit = "deposit";
		String Withdraw = "withdraw";
		String intial_choice;
		String intial_amount;
			
		//Creates objects to withdraw money and deposit money
		Withdraw_Money Withdraw_MoneyObject = new Withdraw_Money();
		Deposit_Money Deposit_MoneyObject = new Deposit_Money();
	
		//Prints hello statement
		System.out.println("Hello and welcome to our money tracker program!");
		
		//Gets withdraw or deposit info from user
		System.out.print("Please enter the amount of money you have: ");
		
		//Grabs user amount input and changes it into an integer
		intial_amount = user_input.next();
		int int_amount = Integer.parseInt(intial_amount);
		
		//Displays amount
		System.out.println("You have $" + int_amount + " dollars");
		
		//Gets withdraw or deposit info from user
		System.out.println("Would you like to withdraw or deposit? ");
		
		//Grabs withdraw or deposit
		intial_choice = user_input.next();
		
		//Checks to see if the use selected deposit or accepted
		if(intial_choice.equals(Withdraw)){
			Withdraw_MoneyObject.subtract_from_account(int_amount);
		}else if(intial_choice.equals(Deposit)){
			Deposit_MoneyObject.add_to_account(int_amount);
		}else{
			System.out.println("Sorry please enter a correct value.");
		}
	}
}