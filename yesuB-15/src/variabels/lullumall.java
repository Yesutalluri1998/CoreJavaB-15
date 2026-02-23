package variabels;

public class lullumall {
	
	public int mobile() {
		int iphone=500000;
		int realme=10000;
		int karbon=50000;
		int vivo=14000;
		int edge=13000;
		int total=iphone+realme+karbon+vivo+edge;
		return total;
	}
	
	public int groceryshope() {
		int pen=5;
		int pencil=4;
		int scale=10;
		int rubber=4;
		int notebook=25;
		int carbonpaper=10;
		int total=pen+pencil+scale+rubber+notebook+carbonpaper;
		return total;
	}
	
	public int resturent() {
		int checkenbiryani=150;
		int bonlessbiryani=200;
		int vegfriedrice=150;
		int nonvegfriedrice=200;
		int waterbottel=10;
		int pullca=100;
		int chapathi=30;
		int total=checkenbiryani+bonlessbiryani+vegfriedrice+nonvegfriedrice+waterbottel+pullca+chapathi;
		return total;
	}
	public int clotheshope() {
		int shirt=250;
		int jeans=300;
		int bunian=150;
		int underware=100;
		int wintercaps=150;
		int hoddie=500;
		int total=shirt+jeans+bunian+underware+wintercaps+hoddie;
		return total;
	}
	public static void main(String[] args) {
		
		lullumall m1=new lullumall();
		
		int totalmobilebill=m1.mobile();
		System.out.println("totalmobilebill::"+totalmobilebill);
		
		int totalgrocerybill=m1.groceryshope();
		System.out.println("totalbill::"+totalgrocerybill);
		
		int totalresturentbill=m1.resturent();
		System.out.println("totalresurentbill::"+totalresturentbill);
		
		int totalclotheshopebill=m1.clotheshope();
		System.out.println("totalclotheshopebill::"+totalclotheshopebill);
		
		
	}

}
