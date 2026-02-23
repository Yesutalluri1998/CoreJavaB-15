package Collect;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ItrTest {
	
	
	public void iteratorTest() {
		List<Integer> a1=new ArrayList<Integer>();
		              a1.add(10);
		              a1.add(20);
		              a1.add(30);
		              a1.add(40);
		             
         Iterator<Integer> itr=a1.iterator();
		          while(itr.hasNext()) {//condition   true or false
		             System.out.println(itr.next());
		        }
	}


	public void ListIteratorTest() {
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		//it traverse data from forward to backward direction
		
		ListIterator<Integer> litr=a1.listIterator();
		while(litr.hasNext()) {
		   System.out.println(litr.next());
		}

		   
		   System.out.println("====================");
		   
		   while(litr.hasPrevious()) {
			   System.out.println(litr.previous());
		   }
	}
public void enumerationTest() {
	
	Vector<String> v=new Vector<String>();
	v.add("Yeshu");
	v.add("Raju");
	v.add("Yassen.");
	
	Enumeration<String> en=v.elements();
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
		
	}
	
	
}
	

	
	
	public static void main(String[] args) {
		ItrTest it=new ItrTest();
		//it.iteratorTest();
		//it.ListIteratorTest();
		
		it.enumerationTest();
	}
	
	}


