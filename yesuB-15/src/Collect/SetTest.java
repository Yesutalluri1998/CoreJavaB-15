package Collect;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class SetTest {
	
	
	public void hashSetTest() {
		Set<Integer> set=new HashSet<Integer>();
		             set.add(10);
		             set.add(12);
		             set.add(14);
		             set.add(16);
		             set.add(18);
		             set.add(20);
		             set.add(22);
		          //   set.add(22);
		             set.add(null);        
		           //  set.add(null);      //it is resigned null and values and execution is parallel
		     for(Integer i:set) {
		    	 System.out.println(i);
		     }
 }
	public void linkedHashSetTest() {
		Set<Integer> set=new LinkedHashSet<Integer>();
		       	   
		              set.add(93);
		              set.add(94);   
		              set.add(95);   
		              set.add(96);   
		              set.add(97);
		              set.add(98);
		              set.add(99); 
		              set.add(100);
		              set.add(100);
		              set.add(null);
		              set.add(null);
		              
		           for(Integer i:set) {
		        	   System.out.println(i);
		  }
	}
	public void TreeSetTest() {
		Set<Integer> set=new TreeSet<Integer>();
		
		      set.add(93);
              set.add(94);   
              set.add(95);   
              set.add(96);   
              set.add(97);
              set.add(98);
              set.add(99); 
              set.add(100);
              set.add(100);
             // set.add(null);
             // set.add(null);// it is not allows null values
         
      for(Integer i:set) {
   	     System.out.println(i);
}
		              

	}
	public static void main(String[] args) {
		SetTest set=new SetTest();
		//set.hashSetTest();
		//set.linkedHashSetTest();
		  set.TreeSetTest();
	}

}
