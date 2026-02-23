package oops;

public abstract class NSE {
	//hides the un-necessary data, show the necessary data
	//normal methods-implementation
	public void stockInfo() {
		System.out.println("Infosys,Tcs,Hindalo,Zomato,Bajaj,Jio,Mrf,Nestle");
	}
	public void Ipo() {
		System.out.println("FLIpkart,blinkit,amazon");
	}
	public void holidays() {
		System.out.println("Agu15,dce25,may1");
	}
	//abstract methods-data hiding
	public abstract void brokerageCharges();
	
	
	{
		System.out.println("NSE Instance blocks");
	}
		static {
			System.out.println("NSE static blocks");
		}
		
		public  NSE() {
			System.out.println("NSE constructor");
		}
		public static void main(String[] args) {
			//NSE n=new NSE();
			
				
		}
}
	

		
