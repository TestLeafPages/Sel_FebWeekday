package weekday.day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Alert.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByXPath("//button[text()='Alert Box']").click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        driver.findElementByXPath("//button[text()='Confirm Box']").click();
        TargetLocator switchTo = driver.switchTo();
        switchTo.alert().dismiss();
        
        driver.findElementByXPath("//button[text()='Prompt Box']").click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("TestLeaf");
//        Thread.sleep(3);
        alert2.accept();
        
//        driver.switchTo().alert().accept();
		

	}

}
