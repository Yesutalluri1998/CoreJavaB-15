package Functional;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
      public static void main(String[] args) throws InterruptedException, ExecutionException {
    	  ExecutorService es=Executors.newSingleThreadExecutor();
  		
  		Callable<String> t1=new Callable<String>() {
  			
  			@Override
  			public String call() throws Exception {
  				
  				return "babu";
  			}
  		};
  		Future<String> f1=es.submit(t1);
  		
  		System.out.println(f1.get());
  		
  		//esc.shutdown();
  				
  		System.out.println("================================================");
  		
      Callable<String> t2=()-> "Manjith";
      
       Future<String> f2=es.submit(t2);
  		
  		System.out.println(f2.get());
  		
  		es.shutdown();
 		
		 
      }
 
}
