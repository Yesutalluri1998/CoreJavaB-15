package Methods;

public class shopping2 {
	
	public int mobiles() {
		int realme=11000;
		int iphone=12000;
		int total=realme+iphone;
		int gstBill=gst("mobiles",total);
		int totalwithGst=total+gstBill;
		return totalwithGst;
	}
	public int fashoin() {
		int shirt=500;
		int jeans=500;
		int total=shirt+jeans;
		int gstBill=gst("fashoin",total);
		int totalwithGst=total+gstBill;
		return totalwithGst;
	}
	public int electronics() {
		int tv=1300;
		int laptop=12000;
		int total=tv+laptop;
		int gstBill=gst("electronic",total);
		int totalwithgst=total+gstBill;
		return totalwithgst;
	}
	public int toys() {
		int ledydoll=300;
		int boydoll=400;
		int total=ledydoll+boydoll;
		int gstBill=gst("toys",total);
		int totalwithgst=total+gstBill;
		return totalwithgst;
	}
	public int games() {
		int kabadi=1000;
		int cricket=2000;
		int total=kabadi+cricket;
		int gstBill=gst("games",total);
		int totalwithgst=total+gstBill;
		return totalwithgst;
	}
	public int gst(String catg,int bill) {
		int gstAmt=0;
		if(catg.equals("mobiles")){
		    gstAmt=(bill*10)/100;
		    
		}else if(catg.equals("fashoin")) {
			     gstAmt=(bill*15)/100;
			  
			
		}else if(catg.equals("electronics")) {
			     gstAmt=(bill*17)/100;
			    
			
		}else if(catg.equals("toys")) {
			     gstAmt=(bill*18)/100;
			     
			
		}else if(catg.equals("games")) {
			     gstAmt=(bill*20)/100;
			    
		}
		else
		{
			    gstAmt=(bill*22)/100;
			
				
		}
		return gstAmt;
		
	}
	public int discount(int totalBill) {
		int discount=0;
		if(totalBill>5000 && totalBill<10000) {
			discount=(totalBill*8)/100;
		}else if (totalBill>10000 && totalBill<20000) {
			discount=(totalBill*10)/100;
			
		}else if (totalBill>20000 && totalBill<30000) {
			discount=(totalBill*15)/100;
			
		}else if (totalBill>30000 && totalBill<40000) {
			discount=(totalBill*17)/100;
			
		}else if(totalBill>40000 && totalBill<50000) {
			discount=(totalBill*20)/100;
			
		}else if (totalBill>50000 && totalBill<60000) {
			discount=(totalBill*25)/100;
			
		}else 
			discount=(totalBill*30)/100;{
			
		}
	     return discount;
	}
	public void totalBill() {
		int mobilesBill=mobiles();
		System.out.println("mobilesBill::"+mobilesBill);
		int fashoinBill=fashoin();
		System.out.println("fashoinBill::"+fashoinBill);
		int electronicsBill=electronics();
		System.out.println("electronics::"+electronicsBill);  
		int toysBill=toys();
		System.out.println("toysBill::"+toysBill);
		int gamesBill=games();
		System.out.println("gamesBill::"+gamesBill);
	    int total=mobilesBill+fashoinBill+electronicsBill+toysBill+gamesBill;
	    System.out.println("Total amount with gst::"+total);
	    int discountAmount=discount(total);
	    System.out.println("Discount amount::"+discountAmount);
	    int finalBill=total-discountAmount;
	    System.out.println("finalBill::"+finalBill);
	}
public static void main(String[] args) {
	shopping2 sp2=new shopping2();
	sp2.totalBill();
}
}
