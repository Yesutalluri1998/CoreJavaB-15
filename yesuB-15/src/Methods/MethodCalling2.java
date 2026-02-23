package Methods;

public class MethodCalling2 {
	int total;
	private int totalwithsGst;
	public int mobiles() {
		int realme=12000;
		int samsung=13000;
		total=realme+samsung;
		System.out.println("Total Amount of Mobile::"+total);
		
		int Gst=Gst(total);
		System.out.println("GST Amount on Mobiles::"+Gst);
		
		int cGst=cGst(total);
		System.out.println("CGST::"+cGst);
		
		int sGst=sGst(total);
		System.out.println("SGST::"+sGst);
		return totalwithsGst;
	}
	public int electronics() {
		
		 int tv=14000;
		 int laptop=15000;
		 total=tv+laptop;
		 System.out.println("Total Amount of electronics::"+total);
		 
		 int Gst=Gst(total);
		 System.out.println("GST Amount on electronics::"+Gst);
		 
		 int cGst=cGst(total);
		 System.out.println("CGST::"+cGst);
		 
		 int sGst=sGst(total);
		 System.out.println("SGST::"+sGst);
		 int Totaltax=cGst+sGst;
		 System.out.println();
		 return totalwithsGst;
		 
	}
	public int clothes() {
		int shirt=12000;
		int jeans=15000;
		total=shirt+jeans;
		System.out.println("total Amount of clothes::"+total);
		
		int Gst=Gst(total);
		System.out.println("Gst Amount of clothes::"+Gst);
		
		int cGst=cGst(total);
		System.out.println("CGST::"+cGst);
		
		int sGst=sGst(total);
		System.out.println("SGST::"+sGst);
		return totalwithsGst;
	}
	public int Gst(int bill) {
		int GstAmount=(bill*20/100);
		return GstAmount;
	}
	public int cGst(int bill) {
		int cGstAmount=(bill*10/100);
		return cGstAmount;
	}
	public int sGst (int bill) {
		int sGstAmount=(bill*50/100);
		return sGstAmount;
	}
	public void TotalBill() {
		int mobileBll=mobiles();
		System.out.println("mobileBill::"+mobileBll);
		int electronicsBill=electronics();
		System.out.println("electronicsBill::"+electronicsBill);
		int clothesBill=clothes();
		System.out.println("clothesBill::"+clothesBill);
	}
	public static void main(String[] args) {
		MethodCalling2 mc2=new MethodCalling2();
		mc2.mobiles();
		mc2.electronics();
		mc2.clothes();
	}

}
