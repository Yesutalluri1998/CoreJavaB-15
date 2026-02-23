package Logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FindVowelsAndConsonentsCount {
	public static void main(String[] args) {
		
		 String name="Your Java Stop!";
     
			name=name.toLowerCase();
			int vowels_count=0;
			int Consonants_count=0;
			
			for(int i=0; i<name.length();i++) {
				
				char ch=name.charAt(i);
				 
				if(ch=='a'||ch=='i'||ch=='o'||ch=='u') {
					 
					vowels_count++;
				}
				else {
					Consonants_count++;
				}
			}
			System.out.println(vowels_count);
			System.out.println(Consonants_count);
			
	}
}
 