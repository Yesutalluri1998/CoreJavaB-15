package oops;

public class overloading1 {
	//same class-method name is same,with no.of parameters different
	public void m1() {
		System.out.println("this is m1..");
	}
	public void m1 (int id) {
		System.out.println("this is m1 method..id::"+id);
	}
	public void m1 (int i,String name,double amount) {
		System.out.println("m1 method..i::"+i+"name::"+name+"amount::"+amount);
	}
	public static void main(String[] args) {
		overloading1 o1=new overloading1();
		o1.m1();
		o1.m1(20);
		o1.m1(15,"yesu it",222.2);
	}

}
