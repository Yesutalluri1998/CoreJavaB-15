package modifiers1;

import modifiers2.C;
import modifiers2.D;

public class A extends C{
	
	public int id;       //protected
	public void m1() {   //protected
		System.out.println("A class m1 method..");
	}
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.id);
		a.m1();
		
		B b=new B();
		System.out.println(b.bid);
		b.bm1();
		
		C c=new C();
		System.out.println(c.cid); //  parent data access only child
	    c.cm1();
	    
		D d=new D();
		System.out.println(d.did);
		d.dm1();
	}

}
