package oops;

public class SavingAccount extends Account implements ATMservice,Onlineservice{

	public void accountType() {
		System.out.println("saving Account");
		
	}
	@Override
	public void fundTransfer() {
		System.out.println("fundsTransfer using onlineservice");
	
	}
	@Override
	public void withdraw() {
		System.out.println("amount withdraw using ATM service");

	}
	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount();
		sa.accountType();
		sa.dispute();
		sa.fundTransfer();
		sa.withdraw();
		
	}
}
