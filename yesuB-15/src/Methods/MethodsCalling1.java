package Methods;

public class MethodsCalling1 {
	int total;          //declaration
	int totalval=123;  //intialization
	
	public int mobiles() {
		int realme=12000;
		int samsung=14000;
		total=realme+samsung;
		return total;
		
	}
	public int electronics() {
		int laptop=250000;
		int tv=13000;
		total=laptop+tv;
		return total;
		
	}
	public int clothes() {
		int shirt=1300;
		int jeans=2000;
		total=shirt+jeans;
		return total;
		
	}
	public int groceries() {
		int soap=10;
		int surfpacket=100;
		total=soap+surfpacket;
		return total;
		
	}
	public void totalBill() {
		int MobilesBill=mobiles();
		int electronicsBill=electronics();
		int clothesBill=clothes();
		int groceriesBill=groceries();
		int totalBill=MobilesBill+electronicsBill+groceriesBill+clothesBill;
		System.out.println(totalBill);
		
	}
  public static void main(String[] args) {
	  MethodsCalling1 mc=new MethodsCalling1();
	  mc.totalBill();
}
}



