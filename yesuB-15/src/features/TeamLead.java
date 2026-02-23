package features;

public interface TeamLead {
	

	public   String company();
			
	public default String role() {
		return "Technical Team Lead";
	}
	public static void location() {
		System.out.println("Banglore");

}
}