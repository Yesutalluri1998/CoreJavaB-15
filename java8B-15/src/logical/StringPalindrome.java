package logical;

public class StringPalindrome {
	public static void main(String[] args) {
		
	
	String name="madam";
	String reverse="";
	
	for(int i=name.length()-1;i>=0;i--) {
		reverse=reverse+name.charAt(i);
		
	}
	if(reverse.equals(name)) {
		System.out.println("it is a palindrome...");
	}else {
		System.out.println("it is not a palindrome...");
	}
}
}
