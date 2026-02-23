package Collect;

public class CompareTest {
	public static void main(String[] args) {
		
		Integer a=10;
		Integer b=20;
		Integer c=10;
	
		System.out.println(a.compareTo(b));//less then -1
		System.out.println(b.compareTo(a));//greater then +1
		System.out.println(c.compareTo(a));//equal   0
	}

}
