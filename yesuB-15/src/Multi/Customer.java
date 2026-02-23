package Multi;

public class Customer {
	
	int bankBal=2000; //5000
	public  synchronized void withdraw(int withdrawAmount) throws InterruptedException {
		System.out.println("customer cam to withdrawamout..");
		
		if (bankBal<withdrawAmount) {
			System.out.println("sorry sir we dont have enough amount,pleae wait.");
			wait();
		}
		System.out.println("customer withdraw amount successfully...");
			bankBal=bankBal-withdrawAmount;
			
		}
	public synchronized void deposite(int depositeAmount) {
		System.out.println("customer came to deposite amount...");
		bankBal=bankBal+depositeAmount;
		System.out.println("customer deposit successfully");
		System.out.println("notifying...........");
		//notify();
		notifyAll();
	}
	
	       

}
