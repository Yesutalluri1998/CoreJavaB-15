package Methods;

public class methods3 {
	
	public void m1() {
		System.out.println("zero parameters");
	}
	public void m2(int b,int s){
		System.out.println("two parameters.... "+b+"  "+s);
	}
	public void m3(int id,long l) {
		System.out.println("two parameters"+id+" "+l);
	}
	public void m4(float f,double d) {
		System.out.println("two parametrs"+f+" "+d);
	}
	public void m5(char c, boolean bool) {
		System.out.println("two parameters"+c+" "+bool);
	}
	public void m6(String name) {
		System.out.println("one parameters.."+name);
	}
	public static void main(String[] args) {
		
		methods3 m3=new methods3();
		
		m3.m1();
	    m3.m2(12, 32);
	    m3.m3(23, 12340l);
	    m3.m4(2.2f, 22.33);
	    m3.m5('a', false);
	    m3.m6("Yesu IT");
	    
		
	}

}
