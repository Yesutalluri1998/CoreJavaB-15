package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringStreamsTest {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("sai","raju","nagu","nazeer","yesu","naveen","manjith","yaseen","bharath","yesu");
		//list.stream().forEach(x-> System.out.println(x));
		
		list.stream()
		    .filter(x->x.length()==6)
		    .map(x->x.concat("java"))
		    .sorted()
		    .distinct()
		    .limit(6)
		    .skip(4)
            .forEach(x->System.out.println(x));     
    System.out.println("===================================");
    
    list.stream().forEach(x->System.out.println(x));
    
    System.out.println("=========collect============");
    
    List<String> length=list.stream().filter(x->x. length()==4).distinct().collect(Collectors.toList());
    System.out.println(length);
   
    System.out.println("=========count=============");
   
	long count=list.stream().count();
	System.out.println("count ::"+count);
	
	
    System.out.println("=======match operations=========");
    
	boolean anyMatch=list.stream().anyMatch(x-> x.length()<15);
	System.out.println("anymatch :: "+anyMatch);
	
	boolean anyMatch1=list.stream().anyMatch(x-> x=="Ravi");
	System.out.println("anymatch :: "+anyMatch1);
	
	boolean allMatch=list.stream().allMatch(x-> x.length()<15);
	System.out.println("anymatch :: "+allMatch);
	
	boolean noneMatch=list.stream().noneMatch(x-> x=="yesu");
	System.out.println(noneMatch);
	
   
    System.out.println("=======================Find Operations====================");
	
	Optional<String>findAny=list.stream().findAny();
	System.out.println("FindAny::"+findAny);
	
	Optional<String> findfirst=list.stream().findFirst();
	System.out.println("FindFirst ::"+findfirst);
	
  
	
	}
}
