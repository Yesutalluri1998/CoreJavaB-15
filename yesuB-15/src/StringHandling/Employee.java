package StringHandling;

public final class Employee {
private final int id;
private final String name;
private final String city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Yesu", "Hyderabad");
		        // e1.id=101;
		         
		         
		System.out.println(e1.id+" "+e1.name+" "+e1.city);
	}

}
