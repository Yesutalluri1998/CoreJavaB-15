package loops;

public class Bookmyshow {
	public void ticketBooking(String catg) {
		if(catg.equals("platinum")) {
			System.out.println("your set allocatted in plantinum category");
		}else if(catg.equals("gold")) {
			System.out.println("your seat allocatted in gold category");
		}else if(catg.equals("silver")) {
			System.out.println("your seat allocatted in silver category");
		}else {
			System.out.println("your seat allocatted in nela ticket");
		}
	}
	public static void main(String[] args) {
		Bookmyshow bms=new Bookmyshow();
		bms.ticketBooking("silver");
	}

}
