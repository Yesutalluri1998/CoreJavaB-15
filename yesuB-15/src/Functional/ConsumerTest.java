package Functional;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> con=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				 
				System.out.println(t);
			}
		};
		con.accept("yesu");
		
		
		System.out.println("==============");
		
	    Consumer<String> con2=t-> System.out.println(t);
	                     con2.accept("Raju");
	}

}
