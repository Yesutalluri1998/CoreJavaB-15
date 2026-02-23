package features;

public class Department implements HR,TeamLead{

	@Override
	public String role() {
		return HR.super.role();
	}

	@Override
	public String company() {
		return null;
	}

}
