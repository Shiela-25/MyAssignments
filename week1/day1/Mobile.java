package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Make a Call");
		String mobileModel ="IPhone 12 Mini";
		float mobileWeight =133f;
	}
	
	public void sendMessage() {
		System.out.println("Send Message");
		boolean isFullCharged =true;
		int mobileCost = 35000;
		
				
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
				obj.makeCall();
				obj.sendMessage();
				System.out.println("This is my Mobile");
					
		
	}
}
