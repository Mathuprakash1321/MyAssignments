package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//simple
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simple = driver.switchTo( ).alert();
		simple.accept();
		Thread.sleep(3000);
		//confirm
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo( ).alert();
		confirm.dismiss();
		Thread.sleep(3000);
		//prompt
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo( ).alert();
		prompt.sendKeys("Mathu");
		prompt.accept();
		Thread.sleep(3000);
		//sweet simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//sweet model
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		
		//delete
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
		
		
		
		
		
		
		
	}
}


