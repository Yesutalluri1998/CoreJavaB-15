package variabels;

public class methods2 {
	public int mobileprice() {
		System.out.println("mobile method called");
		return 123;
	}
	public int electronicsprice() {
		System.out.println("electronics method called");
		return 4000;
	}
	public double amount() {
		System.out.println("amount methd called");
		return 123.45;
	}
	public float miles() {
		System.out.println("miles method called");
		return 4.4f;
	}
	public String ProductName () {
		System.out.println("ProductName method called");
		return "iphone";
	}
	public void Something() {
		System.out.println("Something method called");
	}
   public static void main(String[] args) {
	 methods2 m2=new methods2();
	 int mobileprice=m2.mobileprice();
	 int electronicsprice=m2.electronicsprice();
	 double amount=m2.amount();
	 float miles=m2.miles();
	 String ProductName=m2.ProductName();
	 m2.Something();
	 
	 System.out.println("mobileprice::"+mobileprice);
	 System.out.println("electronicsprice::"+electronicsprice);
	 System.out.println("amount::"+amount);
	 System.out.println("miles::"+miles);
	 System.out.println("ProductName::"+ProductName);
}
}