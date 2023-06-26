package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mathimozhi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arulprakash");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mathu");	
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.name("description")).sendKeys("I am a Senior Software Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mathu@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		//get Title
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//clear text field
		WebElement clr = driver.findElement(By.id("createLeadForm_companyName"));
		clr.clear();
		clr.sendKeys("CAPG");
		
		WebElement clr1 = driver.findElement(By.id("createLeadForm_firstName"));
		clr1.clear();
		clr1.sendKeys("Yuhaa");
		
		driver.findElement(By.name("submitButton")).click();
		
		//getting Title after altering data
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.close();
	

	}

}
