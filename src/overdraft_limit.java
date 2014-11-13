
public class overdraft_limit {
	public void limit_reached(boolean x,float int_amount){
		
		Withdraw_Money Withdraw_MoneyObject = new Withdraw_Money();	

		System.out.println("Error! Will cause overdraft!");
		
		Withdraw_MoneyObject.subtract_from_account(int_amount);
	}
}
