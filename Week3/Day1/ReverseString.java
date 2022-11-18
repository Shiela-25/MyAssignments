package Week3.Day1;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Shiela";
	
		char[] charArray = name.toCharArray();
		
//		for (int i = 0; i < charArray.length; i++) {
//			
//			System.out.println(charArray[i]);
//		
//			
//		}
		for (int i = name.length()-1; i >= 0; i--) {
			
			System.out.println(charArray[i]);
			
		}
		

	}

}
