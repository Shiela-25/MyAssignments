package Week3.Day1;

public class BMW extends Car{
	
			public void absBreak() {

				System.out.println("Apply ABS Break");

			}

	public static void main(String[] args) {

			BMW obj = new BMW();
			obj.applyBreak();
			obj.soundHorn();
			obj.absBreak();

	}

}
