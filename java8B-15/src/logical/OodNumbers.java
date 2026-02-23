package logical;

public class OodNumbers {
	public static void main(String[] args) {
		//{1,3,5,7,9,11,13,15,17,19,21,23,25,29}
		int num=15;
		int a=1;
		int b=1;
		
		for(int i=0;i<num;i++) {
			
			a=b;
			b=a+2;
			System.out.println(a);
		 }
		 
	}

}
