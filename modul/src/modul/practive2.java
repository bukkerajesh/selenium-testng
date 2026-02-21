package modul;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class practive2 {
	WebDriver driver;
	
  @Test(priority=0)
	public void twitter() {
		driver.get("https://x.com/");
	}
	@Test(priority=1)
	public void flipkart() {
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void amazon() {
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
