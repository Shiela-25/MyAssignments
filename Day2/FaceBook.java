package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FaceBook {

	public static void main(String[] args) {


				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.linkText("Create New Account")).click();
				driver.findElement(By.name("firstname")).sendKeys("Shiela");
				driver.findElement(By.name("lastname")).sendKeys("Calvin");
				driver.findElement(By.name("reg_email__")).sendKeys("9840908417");
				driver.findElement(By.name("reg_passwd__")).sendKeys("Shiela@123");
				WebElement drop1 = driver.findElement(By.id("day"));
				Select date = new Select(drop1);
				date.selectByIndex(24);
				WebElement drop2 = driver.findElement(By.id("month"));
				Select month = new Select(drop2);
				month.selectByValue("4");
				WebElement drop3 = driver.findElement(By.id("year"));
				Select year = new Select(drop3);
				year.selectByVisibleText("1989");
				driver.findElement(By.className("_8esa")).click();
				String title = driver.getTitle();
				System.out.println(title);
				
				
				

	}

}
