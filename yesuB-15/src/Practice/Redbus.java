package Practice;

public class Redbus implements Gpay {
	
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
	Redbus ab=new Redbus();
	ab.ticketBooking();
	
}
@Override
public void TicketBooking() {
	// TODO Auto-generated method stub
	
}
}