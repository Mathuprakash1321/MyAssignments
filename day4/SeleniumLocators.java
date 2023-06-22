package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		//syntax : driver.findElement(By.locator("")).sendKeys(""); ---> while entering data
		//syntax : driver.findElement(By.locator("")).click(); ---> while clicking some button
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		
		driver.close();

	}

}
