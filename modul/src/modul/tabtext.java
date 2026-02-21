package modul;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class tabtext {
	WebDriver driver;
  @Test
  public void Tabtext() throws InterruptedException {
	  driver.get("https://www.google.com/");
	//  Thread.sleep(5000);
	  String exptabtext = "Google";
	  String acttabtext = driver.getTitle();
	  Assert.assertEquals(acttabtext, exptabtext);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
