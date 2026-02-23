package Functional;

public class RunnableTest {
	 public static void main(String[] args) {
		 Runnable r1=new Runnable() {
			
			@Override
			public void run() {
			System.out.println("r1");
			}
		};
		r1.run();
		
		
		   System.out.println("======================");
	


          Runnable r2=()->
          System.out.println("r2");
          
          
	r2.run();
    
}
}