package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		
		int num = -40;
			
		if (num<0) {
			
			
			System.out.println(num + " : This is negative number");
			
			int positive = num * -1;
		
			System.out.println("The number " + num + " is converted to " + positive);
		}
			
			else {
				
				System.out.println("The number " + num + " is already a positive number");
			}
			
		}

	}

