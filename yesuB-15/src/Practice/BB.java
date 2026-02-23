package Practice;

public class BB extends  AA {
	
	@Override
	public void m1() {
		System.out.println("child class m1 method");
	}
	@Override
	public void m2() {
		System.out.println("child class m2 method");
	}
	@Override
	public void m3() {       //private methods we con't override
		System.out.println("child class m3 method");
	}
	@Override
    public void m4() {       //final methods we con't override
    	System.out.println("child class m5 method");
    }
	@Override
    public void m5() {      //Static methods we con't override
    	System.out.println("child class m6 method");
    }
}
