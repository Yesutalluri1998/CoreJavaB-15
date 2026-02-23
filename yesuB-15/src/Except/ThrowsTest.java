package Except;
     //throws declaration will pass the exception to the caller method
public class ThrowsTest {
	public void m1() throws InterruptedException{
	for(int i=1;i<=10;i++) {
	
		System.out.println(i);
		Thread.sleep(3000);
		
	}
 }
	public void m2() throws InterruptedException {
		m3();
	}
	public void m3() throws InterruptedException {
		m4();
		
	}
	public void m4() throws InterruptedException {
		m1();
	}
	public static void main(String[] args) throws InterruptedException {
		ThrowsTest tt=new ThrowsTest();
		tt.m1();
	}
}