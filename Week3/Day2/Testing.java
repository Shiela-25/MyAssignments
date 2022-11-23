package Week3.Day2;

public class Testing extends Language implements AutomationTool {

			

	//@Override
			public void phython() {

						System.out.println("Phython");
		
			}
	

			public void selenium() {


						System.out.println("Selenium");
	
				}

				public void playwrite() {
			
							System.out.println("Playwrite");
	
				}
	
	
					public static void main(String[] args) {
						
						Testing obj1 = new Testing();
							obj1.phython();
							obj1.selenium();
							obj1.playwrite();
							obj1.java();
							
	
	
					}
	
	
	
}
