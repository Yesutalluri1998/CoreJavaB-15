package oops;

public class overloading3 {
	//if parameters same,then data types differrent
	//no.of parameters are same,datatypes also same then order should be differrent
	
	public void m1(int id ,String name) {
		System.out.println("id::"+id+"name::"+name);
	}
    public void m1 (String name,int id) {
    	System.out.println("name::"+name+"id::"+id);
    }
    
    public static void main(String[] args) {
		overloading3 ov3=new overloading3();
		ov3.m1(12, "YESU IT");
		ov3.m1("YESU IT",25);
	}
}
