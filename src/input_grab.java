import java.util.Scanner;

public class input_grab {
	public void inital_grab(int int_amount){
		
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
			
			//Gets withdraw or deposit info from user
			System.out.println("Would you like to withdraw,deposit, or exit?");
			intial_choice = user_input.next();
			
			//Checks to see if the use selected deposit or accepted
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
	}
}
