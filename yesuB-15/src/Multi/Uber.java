package Multi;

public class Uber extends Thread{
	
	@Override
	public void run() {
		data();
		
	}
	//which hold the class level lock  - Ub is a lock 
	public static synchronized void data() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread Id "+Thread.currentThread().getId());
		}
		
	}//data consistency
	public static void main(String[] args) {
		Uber u1=new Uber();   //u1
		Thread t1=new Thread(u1);       //t1-16  -u1
		        t1.start(); 
		Thread t2=new Thread(u1);    //t2-17      -u1
		        t2.start();
		        
		   Uber u2=new Uber();
		Thread t3=new Thread(u2);     //t3-18     -u2
		        t3.start();
		Thread t4=new Thread(u2);      //t4-19     -u2
		        t4.start();
	}
	

}
//even though we are using synchronized keyword, DATA is INCONSISTET between the objects.. means both the objects are working simultaneosuly..
// if we want them to be in single order means to be them in  DATA CONSISTENT form use STATIC keyword before synchronized keyword.. 
// while using static synchronized keywords , we are creating a new CLASS LEVEL LOCK 
// using this class level lock we are access all the data.. 