package oops;

public class child extends parent {
	@Override
	public void m1(int id){
		System.out.println("child m1 method..");
	}
	@Override
	public void m2(int id) {
		System.out.println("child m2 method..");
	}
 public static void main(String[] args) {
	child c=new child();
	c.m1(20);
	c.m2(40);
}
}
