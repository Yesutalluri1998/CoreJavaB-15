package StringHandling;

public class StringTest {
	public static void main(String[] args) {
		//String is characters of sequence or character array
		//String is object type
		//String is class
		//String is immutable class
		
		
		char[] ch={'y','e','s','u'};
		System.out.println(ch);
		
		
		String s1=new String(ch);
		System.out.println(s1);
		
		
		String name="yesu";    //literal
		System.out.println(name);
		
		String name2=new String("yesu");   //String object
		System.out.println(name2);
		
		
	}

}
