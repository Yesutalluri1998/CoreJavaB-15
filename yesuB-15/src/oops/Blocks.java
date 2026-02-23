package oops;

public class Blocks {
	
	public Blocks() {
		System.out.println("constructor");
	}
	{      //instance block
		System.out.println("instance block");
	}
	public void m1() {
		System.out.println("instance method");
	}
      static {   // static block
    	  System.out.println("static block");
      }
      
      public static void main(String[] args) {
    	  Blocks b=new Blocks();            //constructor &&instance blocks
    	//  b.m1();
		
	}
}
