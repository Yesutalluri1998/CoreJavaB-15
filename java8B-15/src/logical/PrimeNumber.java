package logical;

public class PrimeNumber {
	public static void main(String[] args) {
	
		int a=2;
		int b=100;
		for(int i=1;i<b;i++) {
			 int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0){
				 count++;
			}
		}
	     if(count==1) {
	    	 System.out.println(i);
	     }
	 }
  }	
}