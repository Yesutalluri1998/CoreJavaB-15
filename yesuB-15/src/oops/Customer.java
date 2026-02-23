package oops;

public class Customer {
	int id;
	String name;
	int age;
	public Customer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Customer() {    
	
	}
	
public static void main(String[] args) {
	Customer c1=new Customer(20,"sai", 25);
	System.out.println(c1.id+" "+c1.name+" "+c1.age);
	
	Customer c2=new Customer(); 
}
}
