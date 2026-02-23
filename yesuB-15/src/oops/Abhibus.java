package oops;

public class Abhibus  implements Phonepay{
	
	//classes allows to write normal methods
	
	public void ticketBooking() {
		String from="guntur";
		String to="atchampet";
		String name="yesu";
		int ticketprice=1000;
		
		System.out.println("from::"+from);
		System.out.println("to::"+to);
		System.out.println("name::"+name);
		System.out.println("ticketprice::"+ticketprice);
		
}
    public static void main(String[] args) {
		Abhibus ab=new Abhibus();
		ab.ticketBooking();
	}
}