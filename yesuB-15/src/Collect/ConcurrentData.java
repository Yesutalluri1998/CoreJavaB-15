package Collect;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentData {
	// while we are iterating the data, if you distrub by adding element or remove then we can using 	Concurrentdata
 
	public void onMap() {
		Map<Integer, String>map=new ConcurrentHashMap<Integer,String>();
		map.put(101, "abc");
		map.put(103, "def");
		map.put(105, "klm");
		
		
		for(Entry<Integer,String>entry:map.entrySet()) {
			map.put(107, "pqrs");
			map.remove(105);
			System.out.println(entry);
		}
		
		System.out.println("============");
		
		 for(Entry<Integer,String>entry:map.entrySet()) {
			System.out.println(entry);
		 }
		}
	public void onList() {
		List<Integer>li=new CopyOnWriteArrayList<Integer>();
		li.add(101);
		li.add(102);
		li.add(103);
		li.add(105);
		
		for(Integer i:li) {
			if(i==105) {
				li.add(104);
			System.out.println(i);
	}
		System.out.println("==================");
		}
		for(Integer i:li) {
			System.out.println(i);
}
}
	
	public void onSet() {
		Set<Integer>set=new CopyOnWriteArraySet<Integer>();
		set.add(102);
		set.add(101);
		set.add(107);
		set.add(108);
		
		for(Integer i:set) {
			set.add(201);
			System.out.println(i);
			
		}
		System.out.println("===============");
		
		for(Integer i:set) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ConcurrentData cd=new ConcurrentData();
		cd.onMap();
		//cd.onList();
		//cd.onSet();
	}
}
