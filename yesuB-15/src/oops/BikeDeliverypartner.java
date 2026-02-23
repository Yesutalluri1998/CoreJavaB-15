package oops;

public class BikeDeliverypartner extends Deliverypartner{
	
	public void wearhelmet() {
		System.out.println("delivery partner wearhelmet");
	}
	@Override
	public void pickuporder() {
		System.out.println("pickuporder from retuarent.. ");
		
	}
	@Override
	public void deliveryorder() {
		System.out.println("deliveryorder by delivery partner");
	}
	public static void main(String[] args) {
		BikeDeliverypartner bdp=new BikeDeliverypartner();
		bdp.acceptOrder();
		bdp.wearhelmet();
		bdp.pickuporder();
		bdp.deliveryorder();
	}

}
