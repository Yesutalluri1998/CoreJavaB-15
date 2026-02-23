package variabels;

public class methodstypes {
	
	public int m1() {   //instance method
		return 123;
	}
	public static int m2() {    //adding by static keyword to instance method then we can make a static method 
		return 1234;
	}
	public static void main(String[] args) {
	  methodstypes mt=new methodstypes();
	  System.out.println(mt.m1());
	  System.out.println(methodstypes.m2());
}

}
