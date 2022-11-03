package arrayafter;

import java.util.Arrays;

public class String_Basics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String_Basics2 sb=new String_Basics2(); 	
//		sb.count_the_total_number_of_character_in_string();
//		sb.count_the_total_number_of_vowels_and_consonants_in_a_string();
//		sb.java_program_two_find_strings_are_the_anagram();
		
		
	}

	/*	
	
	private void java_program_two_find_strings_are_the_anagram() {
		// TODO Auto-generated method stub

		String str1 = "Bragyy";
		String str2 = "Grab";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Both the String are not an anagram");
		} else {

			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);

			if (Arrays.equals(char1, char2) == true) {
				System.out.println("Both the string are anagram");
			} else {
				System.out.println("Both the string are not an anagram");
			}

		}

	}
}

*/

	/*	
	private void count_the_total_number_of_vowels_and_consonants_in_a_string() {
		// TODO Auto-generated method stub

		String str = "This is a really simple sentence";
		int vCount = 0, cCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}

		System.out.println("Number of vowel is present in above string is: " + vCount);
		System.out.println("Number of vowel is present in above string is: " + cCount);
	}
}
	
*/

/*
	private void count_the_total_number_of_character_in_string() {
		// TODO Auto-generated method stub

		String string = "The best of both worlds";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Count of the character in string is " + count);
	}
}
*/
