package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://testleaf.herokuapp.com/pages/Button.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("home")).click();
			Thread.sleep(2000);
			System.out.println("Title of the Page is " + driver.getTitle());
			driver.navigate().back();
			System.out.println("Location of the Element is " + driver.findElement(By.id("position")).getLocation());
			System.out.println("Colour of the Button is " + driver.findElement(By.id("color")).getCssValue("background-color"));
			System.out.println("Height and Width of the Button is " + driver.findElement(By.id("size")).getSize());
			Thread.sleep(2000);
			driver.close();
			
			
			
		
		
		
		

	}

}
