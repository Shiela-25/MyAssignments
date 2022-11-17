package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.id("ext-gen248")).sendKeys("Shiela");
			driver.findElement(By.id("ext-gen334")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='Shiela'])[2]")).click();
			String title = driver.getTitle();
			if (title.contains(title))
			{
				System.out.println("The page is Loaded");
			}
			else
			{
				System.out.println("The page is not loaded");
			}
		
			Thread.sleep(2000);
			driver.findElement(By.linkText("Edit")).click();
			Thread.sleep(2000);
			WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
			Thread.sleep(2000);
			findElement.clear();
			Thread.sleep(2000);
			findElement.sendKeys("Testing Sofware Solutions");
			Thread.sleep(2000);
			driver.findElement(By.name("submitButton")).click();
			Thread.sleep(2000);
			driver.close();
			
			
			
			
			
	}

}
