package Week3.Day1;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {

				String input1 = "Stop";
				String input2 = "Spot";
				int length1 = input1.length();
				int length2 = input2.length();
				
				if(length1 == length2) {
					
					System.out.println("Length Same");
					
				}
				
				char[] charArray1 = input1.toCharArray();
				char[] charArray2 = input2.toCharArray();
				
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
				
				if (Arrays.equals(charArray1, charArray2)) {
					
					System.out.println("It is an Anagram");
					
				} else {
					
					System.out.println("Not an Anagram");

				}
		

	}

}
