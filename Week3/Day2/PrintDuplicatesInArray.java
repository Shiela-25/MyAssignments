package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {


			Integer[] num = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		
			Collections.sort(list);
		
			System.out.println("Sorted List: " + list + '\n');
		
		
			for (int i = 0; i < list.size()-1; i++)
			
			{
				
				if(list.get(i).equals(list.get(i+1)))
					
				{
					
					System.out.println("Duplicate Value: " + list.get(i));
					
				}
				
				
			}
		

	}

}
