package Multi;

public class Zomato extends Thread{
	
	@Override
	public void run() {
		//running state- execution of run method  
		
		for(int i=0;i<10;i++)  {
			System.out.println("Thread Id::"+Thread.currentThread().getId());
			
			try {
				Thread.sleep(4000);    //waiting state
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//dead-completion of run method execution
	}
	public static void main(String[] args) {
		Zomato z=new Zomato();
		Thread t1=new Thread(z);   // born state or new- creating thread object
		       t1.start();     //runnable state -starting a thread
		       
		       //t1.start(); // after completion of t1 it comes to dead stage,again we are calling the dead t1..so it will create an error which is named as illegal thread state exception
	}        

}
