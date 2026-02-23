package fileHandling;

import java.io.Serializable;

public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int cid;
	String name;
	long cardnum;
	transient int cvv;//cannot serialize
	static int pin;//cannot serialize

	public Customer(int cid, String name, long cardnum, int cvv,int pin) {
		super();
		this.cid = cid;
		this.name = name;
		this.cardnum = cardnum;
		this.cvv = cvv;
		this.pin=pin;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cardnum=" + cardnum + "]";
	}
	public static void main(String[] args) {
		Customer c1=new Customer(101, "raju", 5446267625l, 123, 111); 
		System.out.println(c1);
	}
	
	
	
	
	
	
	


}
