package Practice;

  public class DHAN1 extends NSE1 {


  @Override
  public void brokerageCharges() {
	 System.out.println("DHAN1 charges ..20");
 }
  public static void main(String[] args) {
	DHAN1 d=new DHAN1();
	d.stockInfo();
	d.Ipo();
	d.holidays();
	d.brokerageCharges();
	
}

}
