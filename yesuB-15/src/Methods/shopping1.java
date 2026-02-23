package Methods;

public class shopping1 {
	
	public int mobiles() {
		int realme=12000;
		int iphone=13000;
		int total=realme+iphone;
		return total;
		
	}
	
	public void totalbill() {
		int mobilesbill=mobiles();
		System.out.println("mobilesbill::"+mobilesbill);
	}
public static void main(String[] args) {
	shopping1 sp1=new shopping1();
	sp1.totalbill();
}
}
