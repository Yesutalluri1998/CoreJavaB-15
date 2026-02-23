package Except;

public class ErrorTest {
	public void m1() {
		//Stackoverflowerror
		
		System.out.println("m1 method");
		m2();  // here instead of calling method m2 from object we are calling it from method m1
	}
	public void m2() {
		System.out.println("m2 method");
		m3(); 		// here instead of calling method m2 from object we are calling it from method m1
	}
	public void m3() {
		System.out.println("m3 method");
		//m1();  //Here when we try to call method m1 .. it was actually creating an loop over it.
				// this kind of loopping error is called Stackoverflowerror error..
				// this is wt we are testing in this code..
	}
  public static void main(String[] args) {
	ErrorTest et=new ErrorTest();
     et.m1();
}

}