package StringHandling;

public class Test2 {
  public void m1(String str) {
		System.out.println("String...."+ str);
			
}
 public void m1(StringBuffer sbf) {
	 System.out.println("StringBuffer..."+sbf);
	 
 }
 public void m1(StringBuilder sbu) {
	 System.out.println("StringBuilder...."+sbu);
	 
 }
 public static void main(String[] args) {
	Test2 t2=new Test2();
	//t2.m1(null);    /// its comes ambiguity
	
	String str=new String("String value");
	t2.m1(str);
	
	StringBuffer sbf=new StringBuffer("StringBuffer value");
	t2.m1(sbf);
	
	StringBuilder sbu=new StringBuilder("StringBuilder value");
	t2.m1(sbu);
			
}

}
