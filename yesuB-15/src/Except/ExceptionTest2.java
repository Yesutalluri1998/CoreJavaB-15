package Except;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		//one try block my associate with multiple catch blocks
		try {
		int i=10;
		int j=0;
		int k=i/j;
		System.out.println(k);
			
	}catch (ArithmeticException e) {
		e.printStackTrace();
	//}catch (ArrayIndexOutOfBoundsException e) { //different kind of exception array cant be handle..becz her type is int but we gave array index
	//	e.printStackTrace();
	}catch (RuntimeException e) {      //not only arithmetic we can also use runtime,throwable
		e.printStackTrace();
	}catch (Exception e) {     
		e.printStackTrace();
	}catch (Throwable e) {
		e.printStackTrace();
		}
	}            //we can not change the order of exception becz we need access from child first not from parent class
	// mostly in exception case order is important to excute ..
	// 
}

