package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) throws InterruptedException {

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				//	driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
					//Click Try It Button
					driver.switchTo().frame("iframeResult");
					WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
					element.click();
					
					Alert sa = driver.switchTo().alert();
					Thread.sleep(2000);
					sa.accept();
					Thread.sleep(2000);
					System.out.println("Text after Click: " + driver.findElement(By.id("demo")).getText());
					driver.close();
		
		
		

	}

}
