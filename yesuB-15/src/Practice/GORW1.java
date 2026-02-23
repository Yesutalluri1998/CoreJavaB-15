package Practice;

  public class GORW1 extends NSE1{


  @Override
  public void brokerageCharges() {
	 System.out.println("GORW1 charges..30");
	
 }
  public static void main(String[] args) {
	 GORW1 g=new GORW1();
	g.stockInfo();
	g.Ipo();
	g.holidays();
	g.brokerageCharges();
}

}