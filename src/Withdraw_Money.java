import java.util.Scanner;


public class Withdraw_Money {
	public void subtract_from_account(int int_amount){
		
		//Sets up scanner for user input
		Scanner user_input = new Scanner( System.in );
				
		//Variables
		int withdraw_amount;
		int final_amount;
				
		//Asks for withdraw amount
		System.out.print("Please enter the amount you wish to withdraw: ");
		
		//Grabs user amount input and changes it into an integer
		withdraw_amount = Integer.parseInt(user_input.next());
		
		//Displays deposit amount
		System.out.println("Your withdraw amount is: " + withdraw_amount );
		
		//Adds deposit amount to account
		final_amount = int_amount - withdraw_amount;
		
		//Creates object and sends to display amount class
		Display_Amount Display_AmountObject = new Display_Amount();
		Display_AmountObject.display(final_amount);
		
		
				
	}
}
