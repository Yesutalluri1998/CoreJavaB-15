package practiesStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Functional.comparatorTest;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,80,20,30,40,50,20,60,30,70,80,90,10,100);
		 
	     long SecondHighestNumber=list.stream().map(x->x)
	    		 .distinct()
	    		 .sorted(Comparator.reverseOrder())
	    		 .skip(1)
	    		 .findFirst().get();
	         System.out.println("SecondHighestNumber ::"+SecondHighestNumber);
	         
	         
//	         =============find duplicate elements==========
	         
	         
             Set<Integer> Duplicates=list.stream()
            		                    .filter(x->list.stream().filter(y-> y.equals(x)).count()>1)
            		                    .collect(Collectors.toSet());
            	System.out.println(Duplicates);
            		                    
	}
 
	}
