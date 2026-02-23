package oops;

public class Dhan extends NSE {

	@Override
	public void brokerageCharges() {
		 System.out.println("Dhan charges ..20");
	}
	public static void main(String[] args) {
		Dhan d=new Dhan();
		d.stockInfo();
		d.Ipo();
		d.holidays();
		d.brokerageCharges();
	}

}
