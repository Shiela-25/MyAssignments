package Week3.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.ajio.com/");
			//	driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Thread.sleep(3000);
				driver.findElement(By.name("searchVal")).sendKeys("bag", Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(3000);
				System.out.println("Total no of Items: " + driver.findElement(By.className("length")).getText());
				List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
				System.out.println(bagBrandList.size());
				for (WebElement webElement : bagBrandList)
				{
					
					String text = webElement.getText();
					System.out.println(text);
					
					
				}
					
		
				List<WebElement> bagNameList = driver.findElements(By.className("name"));
				System.out.println(" Size :" + bagNameList.size());
				System.out.println(" Names of the Bags");
				
				for (WebElement webElement : bagNameList)
				{
				
					
					String text = webElement.getText();
					System.out.println(text);
					
					
				}
				
		

	}

}
