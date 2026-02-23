package oops;

public class overloading2 {
	//if no.parameters are same,datatypes different
	public void m1(int id) {
		System.out.println("int parameter::"+id);
	}
	public void m1(String name) {
		System.out.println("String parameter::"+name);
	}
    public void m1 (double amt) {
    	System.out.println("double parameter::"+amt);
    }
    public static void main(String[] args) {
		overloading2 ov2=new overloading2();
		ov2.m1(30);
		ov2.m1("yesu IT");
		ov2.m1(33.22);
	}
}
