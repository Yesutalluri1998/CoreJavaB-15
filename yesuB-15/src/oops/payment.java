package oops;

public class payment {
	//overloading example 
	//cash payment
	public void pay(String paymentType,int amount) {
		System.out.println("payment type::"+paymentType+" amount::"+amount);
		
	}
	//card payment
	public void pay(String paymentType,int amount,long cardnum) {
		System.out.println("payment type::"+paymentType+" amount::"+amount+" cardnum::"+cardnum);
		
	}
	
	public void pay(String paymentType,int amount,String upiId) {
		System.out.println("payment type::"+paymentType+" amount::"+amount+"upiId::"+upiId);
	}
	public static void main(String[] args) {
		payment p1=new payment();
		p1.pay("yesu it", 30);
		p1.pay("karthik",500,16725623656l);
		p1.pay("upi", 100, "yesu@ybl");
	}

}
