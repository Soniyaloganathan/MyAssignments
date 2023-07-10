package assignment3;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
	System.out.println("The depoist amount changed to 200");
	
	}
	
	public static void main(String[] args) {
		BankInfo dp1 =new BankInfo();
		AxisBank dp =new AxisBank();
		dp1.deposit();
		dp.deposit();
		dp.saving();
		dp.fixed();
		
	}
}
