package oops;

public class CycleDeliverypartner extends Deliverypartner{
	
	public void ecofriendly() {
		System.out.println("deliverypartner ecofriendly..");
	}
	@Override
    public void deliveryorder() {
    	System.out.println("order delivery by cycle delivery partner...");
    }
    public static void main(String[] args) {
		CycleDeliverypartner cdp=new CycleDeliverypartner();
		cdp.acceptOrder();
		cdp.pickuporder();
		cdp.ecofriendly();
		cdp.deliveryorder();
		
	}
}
