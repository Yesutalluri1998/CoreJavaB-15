package loops;

public class ForTest {
	
	public void test(){
		// int i=10;     i>5;        i++;//i+1;
		//intialization  condition  increment/decrement
		
		for(int i=1;   i<10;  i++) {
			//i=9;     9<10;true  9+1;
			//i=10      10<10=false
			System.out.println(i);  //execution-1 2 3 4 5 6 7 8 9
		}
	}
	
public static void main(String[] args) {
	ForTest ft=new ForTest();
	ft.test();
}

}
