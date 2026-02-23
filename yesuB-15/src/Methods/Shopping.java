package Methods;

public class Shopping {
	  int total;
      int billwithTax;
      int billwithGst;
	 public int mobiles() {
	        int realme=10000;
	        int iphone=15000;
	        int total=realme+iphone;
	        billwithTax=tax(total);
	        billwithGst=Gst(billwithTax);
	        return billwithGst;
	}
	 public int electronics() {
		 int tv=13000;
		 int laptop=14000;
		 int total=tv+laptop;
		 billwithTax=tax(total);
		 billwithGst=Gst(billwithTax);
		 return billwithGst;
	 }
	 public int clothes() {
		 int shirt=300;
		 int jeans=500;
		 int total=shirt+jeans;
		 billwithTax=tax(total);
		 billwithGst=Gst(billwithTax);
		 return billwithGst;
	 }
	 public int tax(int bill) {
		int withTax =bill+500;
		return withTax;
	 }
	 public int Gst(int bill) {
		 int withGst=bill+1000;
		 return withGst;
	 }
	 public void totalBill() {
		 int mobileBill=mobiles();
		 System.out.println("mobilesBill::"+mobileBill);
		 int electronicsBill=electronics();
		 System.out.println("electronicsBill::"+electronicsBill);
		 int clothesBill=clothes();
		 System.out.println("clothesBill::"+clothesBill);
		 
		 int FinalTotalBill=mobileBill+electronicsBill+clothesBill;
		 System.out.println("finalBill::"+FinalTotalBill);
	 }
	public static void main(String[] args) {
		Shopping s1=new Shopping();
		s1.totalBill();
		
	}

}
