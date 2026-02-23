package Functional;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String,Integer> f1=new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		Integer val=f1.apply("nageer");
		System.out.println(val);
		
		System.out.println("===================");
		
  Function<String,Integer> f2=t-> t.length();
 
      Integer val2=f2.apply("shankarg");
      System.out.println(val2);
	}
}
