package Multi;

public class Ola extends Thread {

	
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++){
	                    System.out.println("hread Id::"+Thread.currentThread().getId());
		}
	}
		for(int j=11;j<20;j++) {
			System.out.println("thread Id::"+Thread.currentThread().getId());
		}
			
		}
	public static void main(String[] args) {
		Ola O1=new Ola();
		Thread t1=new Thread(O1);
		t1.start();
		Thread t2=new Thread(O1);
		t2.start();
	}
}
