package Practice;

public class Angelone1 extends NSE1 {


   @Override
   public void brokerageCharges() {
	 System.out.println("Angelone1 charges ..40");
 }
    public static void main(String[] args) {
    Angelone1 a1=new Angelone1();
	a1.stockInfo();
	a1.Ipo();
	a1.holidays();
	a1.brokerageCharges();
}
}