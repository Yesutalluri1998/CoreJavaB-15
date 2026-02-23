package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	
	
	public void arrayListTest() {
		//<>-generic
		//<E>-element type- use only classes
		//type-integer,string,double,employee,customer
		ArrayList<Integer> al=new ArrayList<Integer>();
		                   al.add(10);   //add method..
		                   al.add(20);   //"add method" is to add in arraylist method...
		                   al.add(30);
		                   al.add(40);
		                   al.add(50);
		                  // al.add(1,25); //here element 1 is replacing with 25 instead of 20..
		                                  //now this 25 will occupy element 1 place and othernumber including 20 will shift forward..
		                                  //now o/t will be 10,25,20,30,40,50
		                 //  al.remove(0);  //here element 0 is got remove and other element will shift backword..now o/t will shift forword..
		  for(int i=0;i<al.size();i++){
			  System.out.println(al.get(i));//"get" is used to read the data in arraylist method...get method
			  
		  }
		  System.out.println("=================");
		  for(Integer val:al) {
			  System.out.println(val);
			  
		  }
		  // ARRAY LIST method is preferable when we need to call an specific value.... instead of adding or removing the data..
	}
		  public void linkedListTest() {
			  LinkedList<Integer>  li=new LinkedList<Integer>();
			                       li.add(10);
			                       li.add(20);
			                       li.add(30);
			                       li.add(1, 25);
			                   for(Integer i:li) {
			                	   System.out.println(i);
			                   }    
		
	}
		  public void vectorTest() {
			  Vector<String>  v=new Vector<String>();
					          v.add("raju");
			                  v.add("sai");
			                  v.add("manjithe");
			                  v.add("yaseen");
			                  v.add("naveen");
			                  
			              for(String str:v) {
			            	  System.out.println(str);
			              }
		  }
		  public void StackTest() {
			  Stack<String>  s=new Stack<String>();
			                 s.push("raju");
			                 s.push("sai");
			                 s.push("yaseen");
			                 s.push("manjithe");
			                 s.push("yesu");
			                 s.pop();
			                 s.pop();
			                 s.pop();
			                 s.pop();
			                 
			                 
			               //  System.out.println("pop element  "+s.peek());
			                 System.out.println("=================");
			             for(String str:s){
			                 System.out.println(str);
			                 }
			                 
		  }

	public static void main(String[] args) {
		ListTest lt=new ListTest();
		//lt.arrayListTest();
		//lt.linkedListTest();
		//lt.vectorTest();
		 lt.StackTest();
	}
}
