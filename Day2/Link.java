package Week2.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://testleaf.herokuapp.com/pages/Link.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.linkText("Go to Home Page")).click();
				System.out.println("Title of the Page is " + driver.getTitle());
				Thread.sleep(2000);
				driver.navigate().back();
				System.out.println("Link goes to " + driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a")).getAttribute("href"));
				driver.findElement(By.linkText("Verify am I broken?")).click();
				System.out.println("Title: " + driver.getTitle());
				if(driver.getTitle().contains("404 Not Found"))
				{
					System.out.println("The Link is Broken");
				}
				else
				{
					System.out.println("The Link is not Broken");
				}
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				List<WebElement> dup1 = driver.findElements(By.xpath("//a[text()='Go to Home Page']"));
				int dupsize1 = dup1.size();
				if(dupsize1>1)
				{
					System.out.println("Go to Home page is duplicated.And it is duplicated "+ dupsize1 + " times");
				}
				else
				{
					System.out.println("Go to Home page is not duplicated");
				}
				
				Thread.sleep(2000);
				
				driver.findElement(By.tagName("a")).getSize();
				
				List<WebElement> count = driver.findElements(By.tagName("a"));
				int countlink=count.size();
				System.out.println("The total links are available in this page are " + countlink);
				
				driver.close();
				
				
				
				
	}

}
