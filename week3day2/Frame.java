package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert simple = driver.switchTo().alert();
		simple.sendKeys("Mathu");
		simple.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
        if (text.contains("Text entered"))
        {
            System.out.println("Successfull");
        }
        
		
		
		

	}

}
