package IOS.iosRetail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WayfairDemo {

	@Test
	public void testPrice(){

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		

		String[] keys = { "XA1608" };
		
		String search = "";

		for (int i = 0; i < keys.length; i++) {

			search = keys[i];
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.wayfair.com/");
			driver.findElement(By.cssSelector("input#searchInput")).sendKeys(search);
			driver.findElement(By.cssSelector("input#searchInput")).sendKeys(Keys.ENTER);

			String price = driver
					.findElement(By.cssSelector(
							"span.pl-Box--mr-1.pl-Box--pr-1.pl-Price-V2.pl-Price-V2--5000.pl-Box--baseColor"))
					.getText();
			System.out.println(i+1+". Price of the sku " + search + " is : " + price);

			Assert.assertEquals(price, "$407.3");
			
			driver.close();

		}

	}
}
