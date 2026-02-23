package Practice;
//child 
public class A extends B{
	
	
	public void car() {
		System.out.println("A class child car");
	}
	public void bike() {
		System.out.println("A class child bike");
	}
	public void cycle() {
		System.out.println("A class child cycle");
	}
	public static void main(String[] args) {
		A a=new A();
		
		a.car();
		a.bike();
		a.cycle();
		
		
		System.out.println("==================");
		
		B a1=new A();       //  subclass specific methods
		a1.house();
		a1.gold();
		
		
		
		
		
	}

}
