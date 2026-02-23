package Multi;

public class Airtel extends Thread{//extend thread class
  //mutli threading

  //  override the run method
    @Override
    public void run() {
	  System.out.println("run method....");
}
    public static void main(String[] args) {
		Airtel a1=new Airtel();  // we have create object of our custome class
		//a1.run();
		Thread t1=new Thread (a1); { //we have to create thread class object
		//we are passed our custome object refernce into thread class object.
			t1.start();  //to start the thread we are used start method from thread class or thread constructor
			// then thread will start and call the run method();
			
		}
    }
}