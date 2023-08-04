package packageselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {


		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
	
		driver.manage().window().maximize();
		driver.close();
	
		driver.quit();
	
	}

}
