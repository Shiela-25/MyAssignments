package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {


				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.leafground.com/frame.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Thread.sleep(2000);
				
				driver.switchTo().frame(0);
				WebElement element = driver.findElement(By.id("Click"));
				element.click();
				System.out.println("Dispalyed text after click: " + element.getText() + '\n');
				
				driver.switchTo().parentFrame();
				List<WebElement> count = driver.findElements(By.xpath("//iframe"));
				System.out.println("Total no of frames in this page: " + count.size() + '\n');
		
		
				driver.switchTo().frame(2);
				driver.switchTo().frame("frame2");
				Thread.sleep(2000);
				WebElement element2 = driver.findElement(By.id("Click"));
				element2.click();
				System.out.println("Dispalyed text after click: " + element2.getText());
				
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				driver.close();
		
		
		
		
		

	}

}
