package features;

public interface HR {
	
	public  String company(); 
	
	public default String role() {
		return "Human Resource";
	}
	public default void attendence() {
		System.out.println("HR team attendence must be 75%");
	}
	
	public static void location() {
		System.out.println("Banglore");
	}
 
		
	}


