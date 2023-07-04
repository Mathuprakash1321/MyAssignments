package week3day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameCRActivity {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
        if (text.contains("Text clicked "))
        {
            System.out.println("Successfull");
        }
		
		

	}

}
