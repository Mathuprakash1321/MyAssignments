package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mathimozhi");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arulprakash");
		Thread.sleep(2000);
		WebElement opt = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select options=new Select(opt);
		options.selectByVisibleText("Distribution");
		WebElement opt1= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options1=new Select(opt1);
		options1.selectByVisibleText("Corporation");
		WebElement opt2= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options2=new Select(opt2);
		options2.selectByVisibleText("California");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		driver.close();
		}

}
