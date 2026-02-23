package oops;

public class Deliverypartner {
	
	public void acceptOrder() {
		System.out.println("order accepted by restuarent.");
		
	}
	public void pickuporder() {
		System.out.println("pickuporder from restuarent..");
	}
	public void deliveryorder() {
		System.out.println("deliver order by deliver partner...");
	}
	public static void main(String[] args) {
		Deliverypartner dp=new Deliverypartner();
		dp.acceptOrder();
		dp.pickuporder();
		dp.deliveryorder();
		
	}
}
