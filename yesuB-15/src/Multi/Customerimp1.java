package Multi;

public class Customerimp1 {
	public  static void main(String[] args) {
		
	Customer c1=new Customer();
	
	//withdraw thread-1
	Thread t1=new Thread(new Runnable(){
		@Override
		public  void run() {
		try {
			c1.withdraw(15000);
		}catch(InterruptedException e) {
			e.printStackTrace();	
	}
}
	});
	t1.start();
	
	
	//deposited thread
	Thread t2=new Thread(new Runnable() {
		@Override
		public void run() {
			c1.deposite(20000);
		}
	
	});
	
	t2.start();
	}
}
