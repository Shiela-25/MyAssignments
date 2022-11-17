package Week2.Day2;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.id("ext-gen270")).sendKeys("9840908417");
			driver.findElement(By.id("ext-gen334")).click();
			Thread.sleep(2000);
			String LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
			System.out.println(LeadID);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Delete")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Find Leads")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("id")).sendKeys(LeadID);
			Thread.sleep(2000);
			driver.findElement(By.id("ext-gen334")).click();
			Thread.sleep(2000);
			String text = driver.findElement(By.className("x-paging-info")).getText();
			System.out.println(text);
			if (text.contains("No records to display")) {
				System.out.println("Successfully Deleted");
			}
			else {
				System.out.println("Not Successfully Deleted");
			}
			Thread.sleep(2000);
			driver.close();
		
		

	}

}
