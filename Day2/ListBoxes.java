package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxes {

	public static void main(String[] args) throws InterruptedException {


				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Thread.sleep(2000);
				WebElement trainprog1 = driver.findElement(By.id("dropdown1"));
				Select drop1 = new Select(trainprog1);
				drop1.selectByIndex(1);
				
				Thread.sleep(2000);
				WebElement trainprog2 = driver.findElement(By.name("dropdown2"));
				Select drop2 = new Select(trainprog2);
				drop2.selectByVisibleText("Appium");
				
				Thread.sleep(2000);
				WebElement trainprog3 = driver.findElement(By.id("dropdown3"));
				Select drop3 = new Select(trainprog3);
				drop3.selectByValue("3");
				
				Thread.sleep(2000);
				WebElement trainprog4 = driver.findElement(By.className("dropdown"));
				Select drop4 = new Select(trainprog4);
				int size = drop4.getOptions().size();
				System.out.println("The number of options in Dropdown are "+size);
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Loadrunner");
				driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[4]")).click();
				
				Thread.sleep(2000);
				driver.close();
		
				
				
				
				

	}

}
