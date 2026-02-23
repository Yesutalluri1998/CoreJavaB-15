package Streams;

 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.ListCellRenderer;

public class NumberStreamsTest {
	private static String max;

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,3,7,9,13,11,18,19,13,87,54,45,34,1,2,9,18,13,15);
		              
		               list.stream()
		                   .filter(x->x%2==0)      // to apply condition
		                   .map(x->x*2)            //to apply the logic
		                   .sorted()               //to sort the object
		                   .distinct()             //to remove duplicate object
		                   .limit(4)               //limit the result
		                   .skip(2)                //skip the result
		                   .forEach(x->System.out.println(x));    //to iterate the object
		               
		               System.out.println("=================================");
		               
		               
		               
		               list.stream().forEach(x->System.out.println(x));
		               
		               System.out.println("=========collect============");
	List<Integer> oddlist=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
	
	System.out.println("======min=======");
	
	int min=list.stream().mapToInt(x->x).min().getAsInt();
	System.out.println("min ::"+min);
	
	System.out.println("======max=======");
	
	int max=list.stream().mapToInt(x->x).max().getAsInt();
	System.out.println("max ::"+max);
	
	System.out.println("=========count=============");
	
	long count=list.stream().count();
	System.out.println("count ::"+count);
	
	long sum=list.stream().mapToInt(x->x).sum();
	System.out.println("sum ::"+sum);
	 
	 
	System.out.println("=======match operations========");
	
	boolean anyMatch=list.stream().anyMatch(x->x==2);
	System.out.println(anyMatch);
	
	boolean allMatch=list.stream().allMatch(x->x<100);
	System.out.println(allMatch);
	
	boolean noneMatch=list.stream().noneMatch(x-> x==2);
	System.out.println(noneMatch);
	
	
	System.out.println("===========find operation============");
	
	
	Optional<Integer> findAny=list.stream().findAny();
	System.out.println(findAny);
	
	Optional<Integer> findfirst=list.stream().findFirst();
	System.out.println(findfirst);
	
     
	}

}
