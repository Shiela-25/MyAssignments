package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

					String text = "We learn java basics as part of java sessions in java week1";
					int	count = 0;
					
					String[] split = text.split(" ");
					
					List<String> list = new ArrayList<String>(Arrays.asList(split));
					
				
				//	System.out.println(list);
		
					for (int i = 0; i < list.size(); i++)
					{
						
						count = 0;
						
						for (int j = 0; j < list.size(); j++) 
						{
						
							if(list.get(i).equals(list.get(j)))
							{
								
								count = count + 1;
								
													
							}
							
						}
						
									
						if(count > 1)
							
						{
						
							
								text = text.replace(list.get(i), "");
								
						
						}
		
					}
		
		
					System.out.println(text);		
					
	}

}
