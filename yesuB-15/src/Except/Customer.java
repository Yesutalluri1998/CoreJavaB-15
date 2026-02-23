package Except;

public class Customer {
	
	int bill=500;
	public void payment(int amount) {
		
		if(bill<amount) {  //500<1000
			System.out.println("oayment success..");    //just normal way to tell but i need customer method tell it..see how
		}else {
			//System.out.println("transaction failed..");
			//throw new InsufficentFundException();        //this line will
			throw new InsufficentFundException("add funds..");
		}
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.payment(100);
	}

}
//we can create our own defined msg for presentation
//first create a class and extends with runtimeexcution
//create constructor with zero arg for notty76