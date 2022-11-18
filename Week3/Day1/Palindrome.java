package Week3.Day1;



public class Palindrome {

	public static void main(String[] args) {

			String value = "madam";
			String rev = "";
		
			char[] charArray = value.toCharArray();
					
						
			for (int i = charArray.length-1; i>=0; i--) 
			{
				
					rev = rev + charArray[i];
				
							
			}	
			
			System.out.print("Reverse String is: " + rev + '\n' + '\n');	
		
				if(value.equalsIgnoreCase(rev))
					
					
				{
				
					
					System.out.println(value + " is a Palindrome");
				
				
			}
				
			else
				
			{
				
				System.out.println(value + " is not a Palindrome");
				
				
			}
				
			}
	
	}
	

