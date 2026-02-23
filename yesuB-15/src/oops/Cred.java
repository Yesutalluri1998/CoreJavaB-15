package oops;

public class Cred extends BillDesk {
	
	public void loans() {
		System.out.println("cred loans..");
	}
	public void payments() {
		System.out.println("cred payments...");
	}
	public void cards() {
		System.out.println("cred cards....");
	}
	public void cibilscore() {
		System.out.println("cred cibilscore......");
	}
	
	public static void main(String[] args) {
		Cred c=new Cred();
		c.loans();
		c.payments();
		c.cards();
		c.cibilscore();
		
	}

}
