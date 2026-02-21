package modul;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Practice0 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  List<WebElement>numberoflinks=driver.findElements(By.tagName("a"));
	  System.out.println(numberoflinks.size());
	  System.out.println("Total links on flipcart Website is:"+numberoflinks.size());
	  		
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
