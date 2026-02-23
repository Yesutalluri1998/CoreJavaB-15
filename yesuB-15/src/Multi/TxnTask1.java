package Multi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TxnTask1 implements Runnable{
       int TransactionId;
       
	public TxnTask1(int transactionId) {
		super();
		TransactionId = transactionId;
	}

	@Override
	public void run() {
		System.out.println("Transaction Id::"+TransactionId+"is processing..."+"by::"+Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		                es.submit(new TxnTask1(101));
		                es.submit(new TxnTask1(102));
		                es.submit(new TxnTask1(103));
		                es.submit(new TxnTask1(104));
		                es.submit(new TxnTask1(105));
		             es.shutdown();
	}

}
