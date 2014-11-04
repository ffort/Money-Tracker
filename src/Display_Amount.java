
public class Display_Amount {
	public void display(int amount){		
		
		//Creates objects to input grab class
		input_grab input_grabObject = new input_grab();
				
		System.out.println("Your final amount is $" + amount +"\n\r");
		
		//Calls to Input Grab class
		input_grabObject.inital_grab(amount);
	}
}
