package week2.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mathu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prakash");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Gold@123");
		WebElement opt = driver.findElement(By.id("day"));
		Select options=new Select(opt);
		options.selectByVisibleText("19");
		WebElement opt1= driver.findElement(By.id("month"));
		Select options1=new Select(opt1);
		options1.selectByVisibleText("Oct");
		WebElement opt2= driver.findElement(By.id("year"));
		Select options2=new Select(opt2);
		options2.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		

	}

}
