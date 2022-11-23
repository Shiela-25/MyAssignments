package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {


					Integer[] num = {1, 2, 3, 4, 7, 6, 8};
		
					List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
					
					Collections.sort(list);
					
					System.out.println(list);
					
					
				for (int i = 0; i < list.size(); i++) 
				{
				
					
					if(list.get(i) != (i+1))
							
					{
					
					System.out.println(i+1);
					break;
						
					}	
					
				}	
					

	}

}
