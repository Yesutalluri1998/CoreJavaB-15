package features;

public class Employee implements HR,TeamLead {
//diamond problem--backward compatibility
	@Override
	public String company() {
	  return "Infosys";
	}
	@Override
	public String role() {
		
		return HR.super.role();
	}
	public static void main(String[] args) {
		Employee em=new Employee();
		System.out.println(em.company());
		System.out.println(em.role());
		em.attendence();
		
		HR.location();
		TeamLead.location();
	}
	

}
