package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Duplicate {
	
	public static void main(String[] args) {
		
				String[] name = {"Adam","Ben", "Zara", "Adam", "Charlie", "James", "Ben"};
				
							
				List<String> lst = new ArrayList<String>(Arrays.asList(name));
				
			Collections.sort(lst);
					
				System.out.println("Sorted List: " + lst + '\n');
				
				for (int i = 0; i < lst.size()-1 ; i++) 
				{
					
										
						if(lst.get(i) == lst.get(i+1))
						{
						
						
						System.out.println("Duplicate Name: " + lst.get(i) + '\n');
					
						}
					
				}	
					
			
				
	}
}
