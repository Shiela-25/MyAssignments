package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {

			String[] color = {"Red", "Green", "Blue", "Yellow", "Brown"};
			List<String> list = new ArrayList<String>(Arrays.asList(color));
		
		//	System.out.println(list);
		
			for (int i = list.size()-1 ; i >= 0 ; i--) {
				
				System.out.println(list.get(i));
				
				
			}
			

	}

}
