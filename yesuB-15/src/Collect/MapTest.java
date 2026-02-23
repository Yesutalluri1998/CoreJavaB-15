package Collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	
	public void HashMapTest() {
          //panNum      id
	      //key        value
	   Map<String,String> map=new HashMap<String,String>();
	                map.put("BHS123GH","Bharath");   //entry
	                map.put("SAS123GH","sai");   
	                map.put("RAS123GH","raju");   
	                map.put("YAS123GH","yaseen");   
	                map.put("MANS123GH","manjithe");
	                map.put("YSS890GH", "yesu");
	                map.put(null,"nageer");
	                map.put(null, "karhtik");
	                map.put(null,null);
	                      
	          for(Entry<String, String> entry:map.entrySet()) {
	        	  System.out.println(entry);
 }
	}
	          
	public void LinkedHashMapTest() {
		
	  Map<String,String> map=new LinkedHashMap<String,String>();
              map.put("BHS123GH","Bharath");   //entry
              map.put("SAS123GH","sai");   
              map.put("RAS123GH","raju");   
              map.put("YAS123GH","yaseen");   
              map.put("MANS123GH","manjithe");
              map.put("YSS890GH", "yesu");
              map.put(null,"kranthi"); 
              map.put(null,"nazeer");
              
           for(Entry<String, String> entry:map.entrySet()) {
	           System.out.println(entry);
  }
  }
  
  public void treeMapTest() {
	  //sorting order
   Map<String,String> map=new TreeMap<String,String>();
              map.put("BHS123GH","Bharath");   //entry
              map.put("SAS123GH","sai");   
              map.put("RAS123GH","raju");   
              map.put("YAS123GH","yaseen");   
              map.put("MANS123GH","manjithe");
              map.put("YSS890GH", "yesu");
             //map.put(null,"nazeer"); 
              map.put("ABCD123", null);
            // map.put(null,"babu");      ///its not allows null key
      
        for(Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry);
}
  }
   public void HashTableTest() {
	   
    Hashtable<String, Integer>ht=new Hashtable<String, Integer>();
        	  ht.put("AB123", 101);
        	  ht.put("BC123", 102);
        	  ht.put("YZ123", 104);
        	  ht.put("KL123", 103);
        	//  ht.put(null, 106);
        	 // ht.put("ML345", null);
        	  
       for(Entry<String, Integer> entry:ht.entrySet()) {
         //  System.out.println(entry.getkey()+"   "+entry.getvalue());
             System.out.println(entry);
       }
       
   }
 public static void main(String[] args) {
	    MapTest mt=new MapTest();
	   //mt.HashMapTest();
	   //mt.LinkedHashMapTest();
	   mt.treeMapTest();
	    //mt.HashTableTest();
}
}