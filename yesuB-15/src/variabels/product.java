package variabels;

public class product {
	
	String name="iphone";        //instance variable
	
	static double amt=55000.0;    //static variable
	
	
	public static void main(String[] args) {
		
		int prodid=123;           // local variable
		
		System.out.println(prodid);
		
		product prod=new product();    //objective
		
		System.out.println(prod.name);  //ref.variable
		
		System.out.println(product.amt);    //classname.variablename
		
	}

}
