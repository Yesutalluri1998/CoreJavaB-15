package StringHandling;

public class StringTest2 {
	public static void main(String[] args) {
		
	    //SCP-dosen't allow duplicate objects
		//before create a new object in SCP ,the object will compare with .equals methods
		//if the same object available in SCP,new object won't create
		//but in heap always create new object,it doesn't consider duplication,bcz it doesn't compare with .equlas method
		
		String s="java";//literal-SCP
		String s1=new String("java");//object-heap
		String s2="teja";
		String s3=new String("java");
		String s4="teja";
		String s5="java";
		String s6=new String("teja");
		String s7="bharath";
		String s8="teja";
		String s9=new String("teja");
		//==compare the object reference(address)
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s2==s4);//true
		System.out.println(s4==s5);//false
		System.out.println(s6==s9);//false
	    System.out.println("=================");
	    //.equals compare the content,it diesn't care about address,and memory location
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s9));
		System.out.println(s1.equals(s5));


}
	
}

