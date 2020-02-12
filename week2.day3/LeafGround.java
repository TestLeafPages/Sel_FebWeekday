package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement table = driver.findElementById("table_id");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		List<WebElement> cols = null;
		for (int i = 1; i <=rows.size(); i++) {
			cols = driver.findElementsByXPath("//table[@id='table_id']//tr["+1+"]/th[3]");
		}
		
		System.out.println(cols.size());
		
		
		
		
		
		
		
		
		
		

	}

}
