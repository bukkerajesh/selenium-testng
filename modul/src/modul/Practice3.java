package modul;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Practice3 {
	WebDriver driver;
  @Test(dependsOnMethods="method2")
  public void tc0() {
	  driver.get("https://www.instagram.com/");
  }
  @Test(dependsOnMethods="method0")
  public void tc1() {
	  driver.get("https://www.facebook.com/");
  }
  @Test(dependsOnMethods="method1")
  public void tc2() {
	  driver.get("https://www.amazon.com/");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
