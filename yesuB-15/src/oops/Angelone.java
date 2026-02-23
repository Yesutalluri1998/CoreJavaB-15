package oops;

public class Angelone extends NSE{

	@Override
	public void brokerageCharges() {
		System.out.println("Angelone charges ..40");
	}
	public static void main(String[] args) {
		Angelone ao=new Angelone();
		ao.stockInfo();
		ao.Ipo();
		ao.holidays();
		ao.brokerageCharges();
	}
	

}
