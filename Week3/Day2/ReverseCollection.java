package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {


		String[] value = {"Red","Green","Blue","Yellow","Brown"};
		
		List<String> colours = new ArrayList<String>(Arrays.asList(value));
		
		Collections.sort(colours);
		
		System.out.println(colours);
		
		
//		for (int i = colours.size()-1; i >= 0; i--) {
//			
//			System.out.println(colours[i]);
//			
//			
//			
//		}
		

	}

}
