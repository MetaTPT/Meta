package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test_1_AlphabetiacalOrder {
   WebDriver driver;

@Test (priority=1)
  public void f() {
	driver.get("https://www.facebook.com");
  }

@Test(priority=0)
public void twitter() {
	driver.get("https://www.twitter.com");

}


  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
