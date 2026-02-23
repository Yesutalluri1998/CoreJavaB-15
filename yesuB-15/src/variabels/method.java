package variabels;

public class method {
	public int mobiles() {
		System.out.println("mobiles method");
		return 123;
	}
    public int amount() {
    	System.out.println("amount method called");
    	return 1200;
    	
    }
    public static void main(String[] args) {
		method m=new method();
		
		System.out.println(m.mobiles());
		
		int salaryAmount=m.amount();
		System.out.println(salaryAmount);
		System.out.println(m.amount());
		int salaryAmountwithBonus=salaryAmount+5000;
		System.out.println(salaryAmountwithBonus);
	}
}
