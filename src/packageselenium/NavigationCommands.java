package packageselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https:\\WWW.google.com");
		Thread.sleep(1000);
	
		driver.navigate().to("https:\\www.facebook.com");
		Thread.sleep(1000);
		
		driver.navigate().to("https:\\www.zomato.com");
		Thread.sleep(1000);
		
		driver.navigate().to("https:\\www.Twitter.com");
		Thread.sleep(1000);

		driver.navigate().back();
	
		Thread.sleep(1000);


		driver.navigate().forward();

		Thread.sleep(1000);

		driver.navigate().refresh();

		
		
	}

}
