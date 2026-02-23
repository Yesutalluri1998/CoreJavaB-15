package Practice;

  public abstract class NSE1{ 
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
	System.out.println("NSE1 Instance blocks");
}
	static {
		System.out.println("NSE1 static blocks");
	}
	
	public  NSE1() {
		System.out.println("NSE1 constructor");
	}
	public static void main(String[] args) {
		//NSE1 n=new NSE1();
		
			
	}
}


	
