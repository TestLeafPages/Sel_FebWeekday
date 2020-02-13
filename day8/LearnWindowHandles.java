package weekday.day8;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement home = driver.findElementById("home");

		File elesrc = home.getScreenshotAs(OutputType.FILE);
		File eledst = new File("./snaps/img1.png");
		FileUtils.copyFile(elesrc, eledst);

		

		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);

		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(windowHandles);

		driver.switchTo().window(ls.get(1));
		driver.close();

		driver.switchTo().window(ls.get(0));
		System.out.println(driver.getTitle());

		// driver.quit();

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/img.png");
		FileUtils.copyFile(src, dst);

		String window1 = ls.get(1);
		System.out.println(window1);
		
		
		
		/*
		 * Date obj = new Date(); System.out.println(obj);
		 */

	}

}
