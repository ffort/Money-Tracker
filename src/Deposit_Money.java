import java.util.Scanner;


public class Deposit_Money {
	public void add_to_account(float int_amount){
		
		//Sets up scanner for user input
		Scanner user_input = new Scanner( System.in );
		
		//Variables
		float deposit_amount;
		float final_amount;
		
		//Asks for deposit amount
		System.out.print("Please enter the amount you wish to deposit:");
		
		//Grabs user amount input and changes it into an integer
		deposit_amount = Float.parseFloat(user_input.next());
		
		//Displays deposit amount
		System.out.println("Your deposit amount is: $" + deposit_amount + "\n\r");
		
		//Adds deposit amount to account
		final_amount = int_amount + deposit_amount;
		
		//Creates object and sends to display amount class
		Display_Amount Display_AmountObject = new Display_Amount();
		Display_AmountObject.display(final_amount);
	}
}