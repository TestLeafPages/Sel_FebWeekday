package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementById("chkSelectDateOnly").click();
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB,Keys.TAB,"CST",Keys.ENTER);
		
		Thread.sleep(2000);
		
		List<WebElement> cells = driver.findElementsByXPath
				("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]");
//		System.out.println(rows.size());
		
		
		for (WebElement each : cells) {
			System.out.println(each.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
