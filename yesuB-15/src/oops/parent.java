package oops;

public class parent {
	  
	public void m1(int id) {
		System.out.println("parent m1 method...");
	}
	public void m2(int id) {
		System.out.println("parent m2 method....");
	}
	public static void main(String[] args) {
		parent p=new parent();
		p.m1(30);
		p.m2(40);
	}
}
