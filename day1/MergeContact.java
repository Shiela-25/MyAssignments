package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id("username")).sendKeys("demosalesManager");
				Thread.sleep(1000);
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				Thread.sleep(1000);
				driver.findElement(By.className("decorativeSubmit")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Contacts")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img)[1]")).click();
				System.out.println(driver.getWindowHandle());
				System.out.println(driver.getTitle());
				
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles.size());
				
				List<String> listwindow = new ArrayList<String>(windowHandles);
			//	String string = listwindow.get(1);
				
				driver.switchTo().window(listwindow.get(1));
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
				driver.switchTo().window(listwindow.get(0));
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//input[@id='partyIdTo']/following::img)[1]")).click();
				System.out.println(driver.getWindowHandle());
				System.out.println(driver.getTitle());
				
				Set<String> windowHandles1 = driver.getWindowHandles();
				System.out.println(windowHandles1.size());
				
				List<String> listwindow1 = new ArrayList<String>(windowHandles1);
				driver.switchTo().window(listwindow1.get(1));
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
				driver.switchTo().window(listwindow.get(0));
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				Thread.sleep(1000);
				
				driver.switchTo().alert().accept();
				System.out.println(driver.getTitle());
				
				Thread.sleep(1000);
				driver.quit();
				

	}

}
