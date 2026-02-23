package variabels;

public class methods1 {
	
	public byte id() {
		return 123;
	}
	public short num() {
		return 1234;
	}
	public int value() {
		return 12345;
	}
	public long mobile() {
		return 12345678l;
	}
	public double amount() {
		return 123.87;
	}
	public float distance() {
		return 232.3f;
	}
	public char name() {
		return'y';
	}
	public boolean areyoustranger() {
		return true;
	}
	public String country() {
		return "india";
	}
	public static void main(String[] args) {
		methods1 n1=new methods1();
		
		byte k1=n1.id();
		short k2=n1.num();
		int k3=n1.value();
		long k4=n1.mobile();
		double k5=n1.amount();
		float k6=n1.distance();
		char k7=n1.name();
		boolean k8=n1.areyoustranger();
		String k9=n1.country();
		
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
		System.out.println(k5);
		System.out.println(k6);
		System.out.println(k7);
		System.out.println(k8);
		System.out.println(k9);
		
		
		
	}

}
