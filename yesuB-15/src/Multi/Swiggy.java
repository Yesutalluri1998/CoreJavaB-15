package Multi;

public class Swiggy extends Thread {
	//locking mechanism  .. used in synchronized thread .. to lock the object
	
	
	public synchronized void run() {
		for(int i=0;i<10;i++)    {
		System.out.println("Thread Id- "+Thread.currentThread().getId());
	}
	}
    public static void main(String[] args) {
	   Swiggy s1=new Swiggy();     //object level lock  -s1
	   // we dont know who will take lock first,it might be either t1 or t2 or t3 are ....
	   Thread t1=new Thread(s1); //let say this "t1"..has got the s1 lock,now complete t1 will execute
	          t1.start();
	          
	   Thread t2=new Thread(s1);//let say this "t2"..has got the s1 lock,now complete t2 will execute
	          t2.start();
	          
	   Thread t3=new Thread(s1);
	          t3.start();
	          
	   Thread t4=new Thread(s1);
	          t4.start();
	          
	   Thread t5=new Thread(s1);
	          t5.start();
	          




}
}

