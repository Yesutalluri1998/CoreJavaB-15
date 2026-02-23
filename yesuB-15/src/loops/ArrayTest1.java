package loops;

public class ArrayTest1 {
	public static void main(String[] args) {
		
	
	String []birlaProducts= {"idea","pantloons","vi","birla soft","birla white","ultra tech"};
	
	
      System.out.println(birlaProducts[0]);
      System.out.println(birlaProducts[2]);
      System.out.println(birlaProducts[3]);
      System.out.println(birlaProducts[4]);
      System.out.println(birlaProducts[5]);
    //System.out.println(birlaProducts[6]);
      
      System.out.println("==============================");
      
      for (int i=0; i<birlaProducts.length; i++) {
    	  System.out.println(birlaProducts[i]);
      }
}
}
