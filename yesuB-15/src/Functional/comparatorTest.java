package Functional;

import java.util.Comparator;

public class comparatorTest {
	public static void main(String[] args) {
		  
		Comparator<String> ct1=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				 
				return o1.compareTo(o2);
	} 
 
		};
		int res1=ct1.compare("yesu","karthik");
		System.out.println(res1);
		
		System.out.println("==================");

		Comparator<String> ct2=(o1,o2)->o1.compareTo(o2);
				

		int res2=ct2.compare("yesu", "sai");
		System.out.println(res2);
		}
		}

