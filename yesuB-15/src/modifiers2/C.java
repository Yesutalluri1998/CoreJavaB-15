package modifiers2;

public class C {
	
	public int cid;    //protected 
    public void cm1() {   //protected 
		System.out.println("C class cm1 method..");
	}
	public static void main(String[] args) {
		C c=new C();
		System.out.println(c.cid);
		
		
	}

}
