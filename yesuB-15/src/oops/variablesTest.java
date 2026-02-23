package oops;

public class variablesTest extends variablesparent{
	
	int id=10;               //instance variable
	public void test() {
		int id=20;           //local variable
		System.out.println(id);
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}
	public static void main(String[] args) {
		variablesTest vt=new variablesTest();
		vt.test();
	}

}
