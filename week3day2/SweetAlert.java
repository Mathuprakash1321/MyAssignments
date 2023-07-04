package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SweetAlert {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//from
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext')]")).sendKeys("MS");
		//to
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext')]")).sendKeys("Cape");
		//search
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		//refresh
		driver.findElement(By.xpath("//div[@class='col-xs-12 link']")).click();
		//click WL
		driver.findElement(By.xpath("//div[@class='WL col-xs-12']")).click();
		//click bookNow
		driver.findElement(By.xpath("//button[text()=' Book Now ']")).click();	
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
	
	
	}

}
