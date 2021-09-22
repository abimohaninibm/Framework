package IOS.iosRetail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArmenLiving {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.armenliving.com/index.php?route=common/home");
		
		//search
		driver.findElement(By.cssSelector("input.search_input")).sendKeys("LCBRSIBLGR");
		driver.findElement(By.cssSelector("i.fa.fa-search.button-search")).click();
		
		String text = driver.findElement(By.cssSelector("div.information_wrapper")).getText();
		
		System.out.println("The Searched product name and availablity is : "+text);
		driver.close();
		
	}

}
