package Logical;

public class FactorialNumber {
	
	public static void main(String[] args) {
		//5*4*3*2*1   =120
     int n=5;
     int fact=1;     //1 5 20 60 120 120
     
     for(int i=n; i>=1; i--) {
    	 fact=fact*i;   //1*5=5; 5*4=20; 20*3=60; 60*2=120; 120*1=120
     }
     System.out.println(fact);
}
}