package Multi;

public class TxnTask extends Thread {
	int TransactionId;
	
	public TxnTask(int TransactionId) {
		super();
		this.TransactionId=TransactionId;
	}
	@Override
	public void run() {
		System.out.println("Transaction Id::"+TransactionId+"is processing..."+"by::"+Thread.currentThread().getId());
		
	}
	public static void main(String[] args) {
		TxnTask tx1=new TxnTask(101);
		Thread t1=new Thread(tx1);
		Thread t2=new Thread (new TxnTask(102));
		Thread t3=new Thread (new TxnTask(103));
		Thread t4=new Thread (new TxnTask(104));
		Thread t5=new Thread (new TxnTask(105));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

