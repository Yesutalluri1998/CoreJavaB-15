package oops;

public class cardeliverypartner extends Deliverypartner{
	
	public void largeordersupport() {
		System.out.println("huge order delivery by car..");
		
	}
	@Override
	public void deliveryorder() {
		System.out.println("order deliver by car deliverypartner...");
	}
public static void main(String[] args) {
	cardeliverypartner cdp=new cardeliverypartner();
	cdp.acceptOrder();
	cdp.pickuporder();
	cdp.largeordersupport();
	cdp.deliveryorder();
}
}
