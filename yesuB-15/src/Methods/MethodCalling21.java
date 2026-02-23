package Methods;

public class MethodCalling21 {
	int total;
    int gst;
    int cgst;
    int sgst;
    int Totalwithtax;
  public int mobiles() {
	int realme=12000;
	int samsung=13000;
	total=realme+samsung;
	System.out.println("Total Amount of Mobile::"+total);
	int Gst=Gst("mbiles",total);
	System.out.println("Gst amount of mobiles::"+Gst);
    int cGst=cGst("mobiles",total);
	System.out.println("cGst amount of mobiles::"+cGst);
	int sGst=sGst("mobiles",total);
	System.out.println("sGst amount of mobiles::"+sGst);

	int Thetax=Gst+total;
	System.out.println("Total Thetax::"+Thetax);
	return gst;
  }
  public int electronics() {
	 int tv=14000;
	 int laptop=15000;
	 total=tv+laptop;
	 System.out.println("Total Amount of electronics::"+total);
	 int Gst=Gst("electronics",total);
	 System.out.println("gst Amount of electronics::"+Gst);
	 int cGst=cGst("electronics",total);
	 System.out.println("cGst amount of electronics::"+cGst);
	 int sGst=sGst("electronics",total);
	 System.out.println("sGst amount of electronics::"+sGst);

	 int Thetax=cGst+sGst;
	 System.out.println("total Thetax::"+Thetax);
	 return Totalwithtax;
}
  public int clothes() {
	int shirt=12000;
	int jeans=15000;
	total=shirt+jeans;
	System.out.println("Total Amount of clothes::"+total);
	int Gst=Gst("clothes",total);
	System.out.println("Gst Amount of clothes::"+Gst);
	int cGst=cGst("clothes",total);
	System.out.println("cGst amount of clothes::"+cGst);
	int sGst=sGst("clothes",total);
	System.out.println("sGst amount of mobiles::"+sGst);
	
	int Thetax=cGst+sGst;
	System.out.println("total Thetax::"+Thetax);
	return Totalwithtax;
	
}
  public int Gst( String catg,int bill) {
	  int GstAmount=0; 
	  int cgstamt;
	  int sgstamt;
	  if(catg.equals("mobiles")) {
		  cgstamt=cGst("mobie",bill);
		  sgstamt=sGst("mobile",bill);
		  GstAmount=cgstamt+sgstamt;
		  
		//GstAmount=(bill*20/100);
		
      }
	   else if (catg.equals("electronics")){
		   cgstamt=cGst("electronics",bill);
			  sgstamt=sGst("electronics",bill);
			  GstAmount=cgstamt+sgstamt;
	       //GstAmount=(bill*10/100);
			  
		    
      }
       else  if (catg.equals("clothes")) {
    	   cgstamt=cGst("clothes",bill);
 		  sgstamt=sGst("clothes",bill);
 		 GstAmount=cgstamt+sgstamt;
 		
    	   
	       	//GstAmount=(bill*5/100);
	    	
     }
	  else { 
		  
	       //GstAmount=(bill*18/100);
	      
	       }
	return GstAmount;
}
	public int cGst(String catg,int bill) {
		int cGstAmount;
		if (catg.equals("mobiles")) {
			 cGstAmount=(bill*18/100);
			
		}
		else if (catg.equals("electronics")) {
			 cGstAmount=(bill*9/100);
			
       } 
		else if (catg.equals("clothes")) {
			 cGstAmount=(bill*4/100);
			
		}
		else {
			 cGstAmount=(bill*10/100);
		
       }
		return cGstAmount;
}
	public int sGst (String catg,int bill) {
		int sGstAmount;
		if (catg.equals("mobiles")) {
			sGstAmount=(bill*16/100);
			
       }
		else if (catg.equals("electronics")) {
		    sGstAmount=(bill*8/100);
		
		}
		else if (catg.equals("clothes")) {
			sGstAmount=(bill*3/100);
		}
		else {
			sGstAmount=(bill*15/100);
		   
	}
		return sGstAmount;
  }
	//public int Discount(String catg,int bill) {
	//	if (catg.equals( "moblies",Total)) {
	//		int
	//	}
	//}

  
  public void TotalBill() {
	int mobileBll=mobiles();
	System.out.println("mobileBill::"+mobileBll);
	int electronicsBill=electronics();
	System.out.println("electronicsBill::"+electronicsBill);
	int clothesBill=clothes();
	System.out.println("clothesBill::"+clothesBill);
}
public static void main(String[] args) {
	MethodCalling21 mc2=new MethodCalling21();
	mc2.TotalBill();
	mc2.mobiles();
	mc2.electronics();
	mc2.clothes();
}

}
