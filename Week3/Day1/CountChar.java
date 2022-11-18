package Week3.Day1;

public class CountChar {

	public static void main(String[] args) {
		
		String name="Shiela Jasmine Joshua";
        
        int count=0;
        
        char[] charArray = name.toCharArray();
        
        
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]=='a') {
                count=count+1;
            }
        }
        System.out.println(count);
		
		
		

	}

}
