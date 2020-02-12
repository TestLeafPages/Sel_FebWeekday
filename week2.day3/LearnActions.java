package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		
		WebElement drop = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop);
		
		
		
		
		
		
		
		
		

	}

}
