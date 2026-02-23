package Collect;

public class Employee {
	int id;
	String name;
	String City;
	private int city;
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}
	public Employee() {
		
		
	}
public static void main(String[] args) {
	Employee e1=new Employee(101,"ramesh", "hyderabad");
	      System.out.println(e1.id+" "+e1.name+" "+e1.City);
	      
	      
	      Employee e2=new Employee();
	             e2.id=10;
	             e2.name="yesu";
	             e2.City="atchampet";
	          System.out.println(e2.id+" "+e2.name+" "+e2.City);
	       
	      //deep copy      its should be passing  copy variable to variable
	     Employee e3=new Employee() ;
	              e3.id=e2.id;
	              e3.name=e2.name;
	              e3.City=e2.City;
	          System.out.println(e3.id+" "+e3.name+" "+e3.city); 
	        
	     //shallow copy      its should be passing copy ref to ref
	    Employee e4=new Employee();
	             e4=e2;
	             
	          System.out.println(e4.id+" "+e4.name+" "+e4.city);
	    
	          
}

}
