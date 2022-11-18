package Week3.Day1;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		String uppercase = "";
		
		char[] charArray = test.toCharArray();
		
		for (int i = 0; i < charArray.length; i++)
		
		{
		
			char a = charArray[i];
		
			if (i%2 != 0)
				
			{
				
				uppercase = uppercase + Character.toUpperCase(a);
				
			}
			
			else
				
			{
				
				uppercase = uppercase + charArray[i];
				
				
			}
		}
		
					System.out.println(uppercase);
		
		}
		
		
	}
	
	
	
	
	
	


