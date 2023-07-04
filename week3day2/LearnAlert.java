package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAlert {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Mathu");
		prompt.accept();
	}
	

}
