package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {

					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver();
					driver.get("http://testleaf.herokuapp.com/pages/radio.html");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					
					Thread.sleep(2000);
					driver.findElement(By.id("yes")).click();
					
					boolean button1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]")).isSelected();
					boolean button2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]")).isSelected();
					if(button1 == true)
					{
						System.out.println("Unchecked Radio Button is Selected");
					}
					else if(button2 == true)
					{
						System.out.println("Checked Button is Selected");
					}
					else
					{
						System.out.println("Nothing is selected");
					}
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).click();
					
					Thread.sleep(2000);
					driver.close();
					
					
					
					
		
		

	}

}
