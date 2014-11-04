import java.util.Scanner;
import java.lang.String;

public class input_grab {
	public void inital_grab(float int_amount){
		
			//Sets up scanner for user input
			Scanner user_input = new Scanner( System.in );
			
			//Variables
			String intial_choice;
			String Deposit = "deposit";
			String Withdraw = "withdraw";
			String Exit_Program = "exit";
			
			//Creates objects to withdraw money and deposit money
			Withdraw_Money Withdraw_MoneyObject = new Withdraw_Money();
			Deposit_Money Deposit_MoneyObject = new Deposit_Money();
			
			//Loops until the user selects a given value
			do{
				System.out.println("Would you like to withdraw,deposit,or exit?");
				
				//Gets withdraw,deposit, or exit info from user				
				intial_choice = user_input.next();
				intial_choice = intial_choice.toLowerCase();
				
				//Checks to see if the user selected deposit,withdraw, or exit				
				if(intial_choice.equals(Withdraw)){
					Withdraw_MoneyObject.subtract_from_account(int_amount);
				}else if(intial_choice.equals(Deposit)){
					Deposit_MoneyObject.add_to_account(int_amount);
				}else if(intial_choice.equals(Exit_Program)){
					System.out.println("Goodbye!");	
					System.exit(0);
				}else{
					System.out.println("Sorry please enter a correct value.\n\r");			
				}
			} while(intial_choice != "/0");		
	}
}
