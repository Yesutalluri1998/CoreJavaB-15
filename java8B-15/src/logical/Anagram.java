package logical;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
	
	String name1="begin";
	String name2="beign";
	
	if (name1.length()==name2.length()) {
		char[] ch1=name1.toCharArray(); //['b','e','g','i','n']
	    char[] ch2=name2.toCharArray(); //['b'.'e','i','g','n']
	    
	    
	    Arrays.sort(ch1); // b,e,g,i,n
	    Arrays.sort(ch2); //b,e,g,i,n
	    Boolean result=Arrays.equals(ch1, ch2);
	    
	    if(result) {
	    	System.out.println("it is anagram...");
	    }else {
	    	System.out.println("it is not a anagram...");
	    }
	    
	}else {
		System.out.println("it is not anagram...");
	}

}
}