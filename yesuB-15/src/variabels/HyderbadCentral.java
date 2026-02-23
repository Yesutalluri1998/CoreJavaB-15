package variabels;

public class HyderbadCentral {
	
	    int total=0;
	public int mobile() {
		int realme=12000;
		int iphone=13000;
	    total=realme+iphone;
	    return total;
	}
	public int appliance() {
		int fridge=15000;
		int ac=3000000;
		total=fridge+ac;
		return total;
	}
	public int electronics() {
		int laptop=5000000;
		int tv=120000;
		total=laptop+tv;
		return total;
	}
	public int clothes() {
		int shirt=400;
		int jeans=500;
		total=shirt+jeans;
		return total;
	}
	public static void main(String[] args) {
		HyderbadCentral hc=new HyderbadCentral();
		 hc.mobile();
		 int mobile=hc.mobile();
		 int appliance=hc.appliance();
		 int electronics=hc.electronics();
		 int clothes=hc.clothes();
		
		System.out.println("mobilebill::"+mobile);
		System.out.println("appliance bill::"+appliance);
		System.out.println("electronic bill::"+electronics);
		System.out.println("clothes bill::"+clothes);
		
		int total=hc.mobile()+hc.appliance()+hc.electronics()+hc.clothes();
		System.out.println("total bill::"+total);
		
	}

}
