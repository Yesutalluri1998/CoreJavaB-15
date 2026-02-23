package features;

import java.util.Optional;

import javax.management.RuntimeErrorException;

public class OptionalTest {
	public static void main(String[] args) {
		// to avoid the null check and null pointer exception
		//optional<String> opt1=optional.of(null);
		//System.out.println(opt1);
		
		Optional<String> Opt2=Optional.ofNullable(null);
		System.out.println(Opt2);
		
		String s="java";
		if(s!=null) {
			System.out.println(s.toUpperCase());
		}else {
			System.out.println("data is getting null");
		}
		if(Opt2.isPresent()) {
			
		}else {
	}
		Object opt3=Optional.ofNullable("java").orElse("data is getting null");
		System.out.println(opt3);
		
		Object opt4=Optional.ofNullable(null).orElseThrow(()->new RuntimeException("data is getting null"));
		System.out.println(opt4);

}
	   
}