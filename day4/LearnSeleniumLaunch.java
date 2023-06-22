package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeleniumLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();

	}

}
