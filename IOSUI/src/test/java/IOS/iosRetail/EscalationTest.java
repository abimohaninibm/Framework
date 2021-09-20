package IOS.iosRetail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EscalationTest {

	@Test
	public void escalation() {		
		System.out.println("escalation TestCase");
		//Assert.assertFalse(true);
		
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		driver.close();
	}
}
