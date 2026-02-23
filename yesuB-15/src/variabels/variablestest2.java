package variabels;

public class variablestest2 {
	int id=10;  //instance variable
	
	public int xyz() {
	int	   id=20;     //local variables      // instance v local v are same variable name then we can using this keyword inside of constructor
		
		this.id=30;     //
		System.out.println(id);
		System.out.println(this.id);
		return 0;
		
	}
	public static void main(String[] args) {
		variablestest2 vt2=new variablestest2();
		vt2.xyz();
	}

}
