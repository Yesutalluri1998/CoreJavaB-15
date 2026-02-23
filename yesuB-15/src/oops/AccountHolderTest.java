package oops;

public class AccountHolderTest {
	
	public static void main(String[] args) {
		AccountHolder ac=new AccountHolder();     // setters is nothing but a intilization data  & setters is save,updates,delete
		ac.setHolderName("raju");                  
		ac.setAccountNum(655366466);
		ac.setBalance(300000);
		ac.setIfsc("SBINOO2");
		
		
		System.out.println(ac.getHolderName());   // getters is nothing but a read the data
		System.out.println(ac.getAccountNum());
		System.out.println(ac.getBalance());
		System.out.println(ac.getIfsc());
	}
		
	}

