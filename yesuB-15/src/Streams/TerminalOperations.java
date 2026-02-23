package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TerminalOperations {
	public static void main(String[] args) {
		IntStream.range(0, 15).forEach(System.out::println);
		
		System.out.println("==================");
		IntStream.range(5, 20).parallel().forEach(System.out::println);
		
		System.out.println("====================");
		IntStream.range(10, 30).parallel().forEachOrdered(System.out::println);
		
		System.out.println("=======to Array=========");
		
		List<Integer>list=Arrays.asList(12,14,1,5,17,19);
	    Object[] arr1=list.toArray();   //core java
	    Object[] arr2=list.stream().toArray();
	    Integer[] arr3=list.stream().toArray(x->new Integer[x]);
	    Integer[] arr4=list.stream().toArray(Integer[]::new);
	    
	    System.out.println("==========reduce==========");
	                                 //0+12+14+1+15
	    int sum=list.stream().reduce((x,y)->x+y).get();
	    System.out.println(sum);
	    int min=list.stream().reduce((x,y)->Integer.min(x, y)).get();
	    int max=list.stream().reduce(Integer::max).get();
		
	}

}
