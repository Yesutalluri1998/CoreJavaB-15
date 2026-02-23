package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		
		
		Collections.sort(list);
		Collections.reverse(list);
		for(Integer i:list) {
			System.out.println(i);
		}
		
		Object[] objArr=list.toArray();
		List<Object>objList=Arrays.asList(objArr);
		
		
		Map<Integer, String>map=new HashMap<Integer, String>();
		Map<Integer, String>syncMap=Collections.synchronizedMap(map);
		
		List<Integer>syncList=Collections.synchronizedList(list);
		
		
		Set<Integer>set=new HashSet<Integer>();
		Set<Integer>syncset=Collections.synchronizedSet(set);
		List<Integer>unmodifyList=Collections.unmodifiableList(list);
	}

}
