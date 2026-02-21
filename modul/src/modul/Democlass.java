package modul;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Window;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Democlass {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void Facebook() {
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	void Google() {
		driver.get("https://www.google.com/");
		
	}
}
