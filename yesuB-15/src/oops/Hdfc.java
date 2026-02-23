package oops;

public class Hdfc extends Cred {
	@Override
	public void loans() {
		System.out.println("hdfc loans..");
	}
	@Override
    public void payments() {
    	System.out.println("hdfc payments...");
    }
	@Override
    public void cards() {
    	System.out.println("hdfc cards....");
    }
    public void cheque() {
    	System.out.println("hdfc cheque......");
    }
    public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.loans();
		h.payments();
		h.cards();
		h.cheque();
		h.cibilscore();
		
		
	}
}
