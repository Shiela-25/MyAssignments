package Week2.Day2;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImages {

	public static void main(String[] args) throws InterruptedException {


				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://testleaf.herokuapp.com/pages/Image.html");
				driver.manage().window().maximize();
				Actions actions = new Actions(driver);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
				driver.navigate().back();
				 String size = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("naturalWidth");
				 if(size.contentEquals("0")==true)
				 {
					 System.out.println("The image is broken");
				 }
				 
				 else 
					 
				 {
					 System.out.println("The image is not Broken");
				 }
				 
				 WebElement key1 = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
				 actions.moveToElement(key1).click().perform();
				 driver.navigate().back();
				 Thread.sleep(2000);
				 driver.close();
		
		
		
			

	}

}
