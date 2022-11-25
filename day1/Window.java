package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver();
					driver.get("https://www.leafground.com/window.xhtml");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Open']")).click();
					Thread.sleep(2000);
					Set<String> windowHandles = driver.getWindowHandles();
					
					List<String> listwindow = new ArrayList<String>(windowHandles);
					Thread.sleep(2000);
					driver.switchTo().window(listwindow.get(1));
					System.out.println("Title of the Opened Window is: " + driver.getTitle() + '\n');
					driver.close();
					
					driver.switchTo().window(listwindow.get(0));
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
					Set<String> windowHandles2 = driver.getWindowHandles();
					System.out.println("Number of Opened Tabs: " + windowHandles2.size() + '\n');
					List<String> listwindow1 = new ArrayList<String>(windowHandles2);
					Thread.sleep(2000);
					driver.switchTo().window(listwindow1.get(1));
					driver.close();
					Thread.sleep(2000);
					driver.switchTo().window(listwindow1.get(2));
					driver.close();
					driver.switchTo().window(listwindow1.get(0));
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
					Set<String> windowHandles3 = driver.getWindowHandles();
					List<String> listwindow2 = new ArrayList<String>(windowHandles3);
					Thread.sleep(2000);
					driver.switchTo().window(listwindow2.get(1));
					driver.close();
					driver.switchTo().window(listwindow2.get(2));
					driver.close();
					driver.switchTo().window(listwindow2.get(3));
					driver.close();
					
					driver.switchTo().window(listwindow2.get(0));
					driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
					Thread.sleep(10000);
					
					Set<String> windowHandles4 = driver.getWindowHandles();
					List<String> listwindow3 = new ArrayList<String>(windowHandles4);
					driver.switchTo().window(listwindow3.get(2));
					driver.quit();
					
					
						

	}

}
