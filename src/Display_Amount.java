
public class Display_Amount {
	public void display(float amount){		
		
		//Creates objects to input grab class
		input_grab input_grabObject = new input_grab();
				
		System.out.printf("Your final amount is $%.2f", amount);
		System.out.print("\n\r");
		
		//Calls to Input Grab class
		input_grabObject.inital_grab(amount);
	}
}
