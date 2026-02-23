package oops;

public class Employee2 {
	
	public Employee2() {
		System.out.println("constructor");
	}
	public Employee2(int id) {
		System.out.println("int arg constructor id::"+id);
	}
    public Employee2(int id,String name) {
    	System.out.println("multiple args constructor id::"+"name::"+name);
    }
    public Employee2(int id ,float km,double amt) {
    	System.out.println("multiple args constructor id::"+id+"km::"+km+"amt"+amt);
    }
    public static void main(String[] args) {
		Employee2 e2=new Employee2();
		Employee2 e3=new Employee2(15);
		Employee2 e4=new Employee2(30, "raju");
		Employee2 e5=new Employee2(40, 22.33f,23.56);
	}
}
