package logical;

public class printCharacters {
	public static void main(String[] args) {
		
		String val="your java stop!";
		int count=0;
		for(int i=0;i<val.length();i++) {
		    //System.out.println(val.charAt(i));
			char ch=val.charAt(i);
			if(ch=='a') {
			System.out.println(ch);
			count++;
			}
		}
		System.out.println(count);
		
		String[]words=val.split("");
		for(int i=0;i<words.length;i++) {
			
		System.out.println(words[i]);
	}
	}
}
