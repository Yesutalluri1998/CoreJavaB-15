package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,13,2,6,4,8,10);
		
		list.stream()
		    .filter(x->x%2==0)
		    .map(x->x+2)
		    .forEach(System.out::println);
		
		System.out.println("==========using static methods================");
		//using lambda
		list.stream()
		    .filter( x->Reference.even(x))
		    .map(x->Reference.addition(x))
		    .forEach(System.out::println);
		
		//using method Reference
		
		list.stream()
		    .filter(Reference::even)
		    .map(Reference::addition)
		    .forEach(System.out::println);
		
		System.out.println("===========using instance method=================");
		    
		    		    Reference ref=new Reference();
		    		    //using lambda reference
		    		    list.stream()
		    		        .filter(x->ref.odd(x))
		    		        .map(x->ref.multiply(x))
		    		        .forEach(System.out::println);
		    
		    		    //using reference method
		    		    list.stream()
		    		        .filter(ref::odd)
		    		        .map(ref::multiply)
		    		        .forEach(System.out::println);
		    		    System.out.println("========Arbitory method reference========");
		    		    
		   List<String>list2=Arrays.asList("ramu","somu","suresh","ramesh","somesh","jogesh");
		
		   //using lambda
		   list2.stream()
		        .filter(x->x.contains("u"))
		        .map(x->x.toUpperCase())
		        .forEach(System.out::println);
		   
		   //using method reference
		   list2.stream()
		        .filter(x->x.contains("u"))
		        .map(String::toUpperCase)
		        .forEach(System.out::println);
		   
		   System.out.println("=======new object test========");
		   
		    	//input       output 
		  // Function<Integer, Student> fun=t->new Student(t);
		   Function<Integer, Student> fun=Student::new;
		   Student stu=fun.apply(101);
		   System.out.println(stu);
	}

}
