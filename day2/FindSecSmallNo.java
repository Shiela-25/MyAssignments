package week1.day2;

import java.util.Arrays;

public class FindSecSmallNo {

	public static void main(String[] args) {

			int[] data = {23, 45, 67, 32, 89, 22};
			
			Arrays.sort(data);
						
			int length = data.length;
			
			System.out.println(length);
			
			System.out.println(data[1]);
	}

}
