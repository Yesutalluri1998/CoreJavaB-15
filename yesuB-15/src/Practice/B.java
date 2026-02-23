package Practice;
//parent
public class B {                           //inheritance
	
	public void gold() {
		System.out.println("b class parent gold");
		
	}
	public void house() {
	   System.out.println("b class parent house");
     }
	public void car() {
		System.out.println("b class parent car");
	}
	
public static void main(String[] args) {
	B b=new B();
	
	b.gold();
	b.house();
	b.car();
	
	  
}
}