package fileHandling;

public class Singlton {
	
	
	private static Singlton singltonobj=null;
	
	public static Singlton getInstance() {
	 if(singltonobj==null) {
		 singltonobj=new Singlton();
	 }
	 return singltonobj;

}
public static void main(String[] args) {
	
	Singlton s1=Singlton.getInstance();
	Singlton s2=Singlton.getInstance();
	Singlton s3=Singlton.getInstance();
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
	
}

}
