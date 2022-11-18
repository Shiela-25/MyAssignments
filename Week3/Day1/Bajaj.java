package Week3.Day1;

public class Bajaj extends Auto{
	
	public void kickStart() {

			System.out.println("Kick Start");

	}

	public static void main(String[] args) {

				Bajaj obj = new Bajaj();
				obj.applyBreak();
				obj.soundHorn();
				obj.kickStart();
		
		

	}

}
