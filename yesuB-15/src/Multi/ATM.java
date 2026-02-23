package Multi;

public class ATM {
      volatile boolean maintananceMode=false;//true
      public void transactonprocess() {
    	  System.out.println("customer came to transaction process..");
    	  
    	  while(!maintananceMode) {//false
    		  //transaction process is going on...
    		 // System.out.println("while loop is running...");
    	  }
    	  System.out.println("ATM is stoped for maitanance..is.maintananceMode..");
      }
      public void maintanance() {
    	  System.out.println("ADMIN changing maitanance mode...");
    	  maintananceMode=true;
      }
      public static void main(String[] args) throws InterruptedException {
		ATM atm=new ATM();
		Thread atmTransaction=new Thread(new Runnable() {
			
			public void run() {
				
				atm.transactonprocess();
			}
			
		});
		
		atmTransaction.start();
		
		Thread.sleep(4000);
		
		atm.maintanance();
	}
      
}
