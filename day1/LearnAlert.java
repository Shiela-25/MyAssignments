package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {


			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Simple Alert
			driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
			Alert simplealert = driver.switchTo().alert();
			Thread.sleep(3000);
			simplealert.accept();
			
			//Alert Confirm
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]")).click();
			Alert alertconfirm = driver.switchTo().alert();
			Thread.sleep(3000);
			System.out.println(alertconfirm.getText());
			alertconfirm.dismiss();
			
			//Sweet Alert (Simple)
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();
			
			
			//Sweet Model Dialog
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span")).click();
			
			//Promt Alert
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			Alert promtalert = driver.switchTo().alert();
			promtalert.sendKeys("Shiela");
			Thread.sleep(3000);
			System.out.println(promtalert.getText());
			Thread.sleep(3000);
			promtalert.accept();
			Thread.sleep(3000);
			System.out.println(driver.findElement(By.id("confirm_result")).getText());
			
			//Sweet Alert (Confirmation)
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt109\"]/span[2]")).click();
			
			
			//Minimize & Maximize
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[3]/span")).click();
			
			
			
			
			
			
			
			Thread.sleep(2000);
		//	driver.close();
			
			
			
			
			
	}

}
