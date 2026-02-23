package Multi;

public class jio implements Runnable {

	@Override
	public void run() {
		 //excution
		for(int i=0;i<10;i++) {
			System.out.println("Thread Id- "+Thread.currentThread().getId());
		}
		
	}
	public static void main(String[] args) {
		jio j1=new jio();
		Thread t1=new Thread(j1);
		       t1.start();
		        
	Thread t2=new Thread(j1);
	       t2.start();
	        
	        
	 Thread t3=new Thread(j1);
	        t3.start();
	}
	

}
