package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

			int count = 8;
			int n1 = 0;
			int n2 = 1;
			
			System.out.println(n1);
			System.out.println(n2);
			
			for (int i = 0; i < count; i++) {
				
				int sum = n1 + n2;
				n1 = n2;
				n2 = sum;
				
				System.out.println(n2);
				
				
			}
			
			
		

	}

}
