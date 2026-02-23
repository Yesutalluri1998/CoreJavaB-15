package logical;

public class FibonacciSeries {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		
		int num=7;  
		int a=0;    //1 1 2 3 5 8 13 21
		int b=1;    //1 2 3 5 8 13 21 34
		int c=1;    //2 3 5 8 13 21 34 55
		
		for(int i=0;i<=num;i++) {
		System.out.println(a);
		a=b;  //1 1 2 3 5 8 13 21
		b=c;  //1 2 3 5 8 13 21 34
		c=a+b; //1+1=2;1+2=3;2+3=5;3+5=8;5+8=13;8+13=21;13+21=34;21+34=55;
		
		}
	}

}
