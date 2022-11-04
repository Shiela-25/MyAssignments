package week1.day2;

public class Palindrome {
	
	

	public static void main(String[] args) {
				
		int num=34343;
		int remainder;
		int sum=0;
		int temp = num;
			
		while(num>0)
		{
			remainder = num % 10;
			sum = sum * 10 + remainder;
			num = num / 10;
			
		}
		
		if(temp==sum)
			
		{
			
			System.out.println(temp + " :This is Palindrome Number");
		}
		
		
		else
			
		{
			
			System.out.println(temp + " :This is not a Palindrome Number");
			
		}
		
		
	
	}

	
}