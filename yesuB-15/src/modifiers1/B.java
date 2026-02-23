package modifiers1;

public class B {
	public int bid;
	public void bm1() {
		System.out.println("B class bm1 method..");
	}

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.bid);
	}
}
