package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shiela");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Calvin");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shiela");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT - IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual Testing and Automation Testing (Selenium with Java)");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jasmine2504@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jasmine");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(title);
		
		
		
	}

}
