package Practice;

public class variablesTest1 {

	String name="teja it";    //instance variable
      static double amount=123.45;  //static variable


      int val=30;
      int defaultval;

   public void test() {   //instance method
	  int val=120;
	  System.out.println(val);   //default priority for local variable
	  System.out.println(this.val);  //this.instance variable
	  defaultval=124;
	  System.out.println(defaultval);  //default variable
	
	
	  int amount;
	    amount=11;
	  System.out.println(amount);  //local variable must initialize before calling it
	    
	    
}
	    public static void test2() {   //static method
	    	System.out.println("static method...");
    }
	    public static void main(String[] args) {
			int id=20;  //local variable
			
			//class name ref=new keyword constructor
			variablesTest1 v1=new variablesTest1(); 
			//object
			System.out.println(v1.name); //ref.variablename
			System.out.println(variablesTest1.amount); //classname.variablename
			
			
			
			v1.test();   //ref.methodname
			variablesTest1.test2();    //classname.variablename
		}
	    
	

	
}


