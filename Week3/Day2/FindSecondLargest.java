package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

				Integer[] num = {3, 2, 11, 4, 6, 7};
		
				List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		
				Collections.sort(list);
		
				System.out.println("Sorted List: " + list + '\n');
					System.out.println("Second Largest Number: " + list.get(list.size()-2) + '\n');

	}

}
