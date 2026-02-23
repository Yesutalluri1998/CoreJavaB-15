package Except;

public class ExceptionTest {
	
	public void arithametic() {
		//something value/zero it will be comes exception 
		System.out.println("arithametic start....");
		
		try {
			int i=100;
			int j=0;
			int k=i/j;
			System.out.println(k);
		}catch (ArithmeticException e) {
		       e.printStackTrace();   //it prints exception
		}
		System.out.println("arithametic end......");
	}
     
     public void arrayindex() {
    	 System.out.println("Array index start...");
    	 try {
    		 
    		 int arr[]=new int[4];
    		     arr[0]=10;
    		     arr[1]=20;
    		     arr[2]=30;
    		     arr[3]=40;
    		     //arr[4]=50;
    		     System.out.println(arr[0]);
    		     System.out.println(arr[1]);
    		     System.out.println(arr[2]);
    		     System.out.println(arr[3]);
    		     System.out.println(arr[4]);
    	 }catch (ArrayIndexOutOfBoundsException e) {
    		     e.printStackTrace();
    	 }
    	 System.out.println("Array index end......");
     }
     public void Nullpointer() {
    	 System.out.println("null pointer start..");
    	 try {
    		 Integer i=null;
    		 int j=30;
    		 int k=i+j;
    		 System.out.println(k);
    	 } catch (NullPointerException e) {
    		e.printStackTrace();
    	 }
    	 System.out.println("null pointer end....");
     }
     public void NumberFormat() {
    	 System.out.println("nuber format start...");
    	 try {
    		 String s="123abc";        //not allows String values into integer like "abc";
    		 Integer val=Integer.valueOf(s); //converting string value into Integer value
    		 System.out.println(val);
    	 }catch (NumberFormatException e) {
    		 e.printStackTrace();
    	 }
    	 System.out.println("number format end...");
     }
     public void interrupted() {
    	 System.out.println("interrupted start...");
    	 for(int i=0;i<5;i++) {
    		 System.out.println(i);
    		 
    		 try {
				Thread.sleep(5000);  // use it thread // compile time exception is it will comes before runtime exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	 }
    	 System.out.println("interrupted end.....");
     }
     public void interrupted2() throws InterruptedException {
    	 for(int i=0;i<5;i++) {
    		 System.out.println(i);
    		 Thread.sleep(5000);
    	 }
     }
     public static void main(String[] args) throws InterruptedException {
 		ExceptionTest et=new ExceptionTest();
 		//et.arithametic();
 		//et.arrayindex();
 		//et.Nullpointer();
 		//et.NumberFormat();
 		//et.interrupted();
 		et.interrupted2();
 		
 	}
     
}
