package modul;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Practive4 {
	WebDriver driver;
  @Test(enabled=false)
  public void popup() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
  } 
  
	  @Test(enabled=false)
		public void alertsendtextokcancelbutton() throws InterruptedException {
			driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
			Thread.sleep(3000);
			driver.findElement(By.className("screen-reader-text skip-link")).click();
			driver.findElement(By.className("screen-reader-text skip-link")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
  }  
	  
	  @Test
		public void noalertbutton() throws InterruptedException {
			driver.get("https://www.techlearn.in/");
			Thread.sleep(3000);		
			driver.switchTo().alert().accept();
			
		}
		
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
