package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Mathu");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Engineer");
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
		
		WebElement opt = driver.findElement(By.name("industryEnumId"));
		Select options=new Select(opt);
		options.selectByVisibleText("Computer Software");
		
		WebElement opt1 = driver.findElement(By.name("ownershipEnumId"));
		Select options1=new Select(opt1);
		options1.selectByVisibleText("S-Corporation");
		
		WebElement opt2 = driver.findElement(By.id("dataSourceId"));
		Select options2=new Select(opt2);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement opt3 = driver.findElement(By.id("marketingCampaignId"));
		Select options3=new Select(opt3);
		options3.selectByIndex(6);
			
		WebElement opt4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4=new Select(opt4);
		options4.selectByValue("TX");
	
		driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		
		driver.close();	

	}

}
