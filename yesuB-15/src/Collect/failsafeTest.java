package Collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class failsafeTest {
	
	
	public void onMap() {             //concurrentonwritehashmap
		Map<Integer, String> map=new HashMap<Integer, String>();
		           
		   map.put(123, "ABC");
		   map.put(456, "DEF");
		   map.put(789, "GHI");
		   map.put(112, "JKL");
		   map.put(113, "MNO");
		   map.put(114, "PQR");
		   
		for(Entry<Integer, String>entry:map.entrySet()){
			
			if(entry.getKey()==789){
				//map.put(811, "Burger");
				map.remove(789);
				
			}
			System.out.println(entry);
			
		}
		System.out.println("===============");
		
	 for(Entry<Integer, String> entry:map.entrySet()) {
		 System.out.println(entry);
		 
	 }
	 }
	 public void onList() {
		 List<Integer>li=new ArrayList<Integer>();//copywritearraylist
		      li.add(10);
		      li.add(20);
		      li.add(30);
		      li.add(40);
		      
		      
		      
		      for(Integer i:li) {
		    	  if(i==20)  {
		    		  //li.add(55);
		    		  //li.remove(1);
		    	  }
		    	  System.out.println(i);
		      }
		      System.out.println("==================");
		      
		      for(Integer i:li) {
		    	  System.out.println(i);
		    	  
		      }

		
		
		   
		
	}
	public static void main(String[] args) {
		failsafeTest fs=new failsafeTest();
		fs.onMap();
		//fs.onList();
	}

}
