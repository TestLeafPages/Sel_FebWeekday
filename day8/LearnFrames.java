package weekday.day8;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/selectable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElementByXPath("//li[text()='Item 1']").click();
        driver.switchTo().defaultContent();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
	}

}
