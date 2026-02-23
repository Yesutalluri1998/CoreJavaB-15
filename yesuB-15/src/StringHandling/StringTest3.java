package StringHandling;

public class StringTest3 {
	public static void main(String[] args) {
		
		String s="Teja IT";
		System.out.println(s.charAt(2));
		System.out.println(s.compareTo(s));
		System.out.println(s.concat("Your Java Stop!"));
		System.out.println(s.contains("ja"));
		System.out.println(s.endsWith("IT"));
		System.out.println(s.equals("Teja IT"));
		System.out.println(s.equalsIgnoreCase("teja it"));
		System.out.println(s.hashCode());
		System.out.println(s.indent(4));
		System.out.println(s.indexOf("a"));
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		
		System.out.println(s.length());
		System.out.println(s.replace("T","K"));
		System.out.println(s.startsWith("Te"));
		char[] charArr=s.toCharArray();
		System.out.println(charArr);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String s2="Your Java Stop";
		System.out.println("=============");
		String[] strarr=s2.split(" ");
		for(String words:strarr) {
			System.out.println(words);
		}
	}

}
