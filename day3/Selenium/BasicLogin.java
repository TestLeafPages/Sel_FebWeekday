package weekday.day3.Selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicLogin {

	public static void main(String[] args) {
		
		//Setting up the property for the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		
		//Declare an Object for ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();
		
		// Launching the Browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the Launched Browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Leads button
		driver.findElementByPartialLinkText("Leads").click();
		
		//Click on create Lead
//		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByPartialLinkText("Create Lead").click();
		//Enter the company name 
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
		//Enter the Firstname 
		WebElement firstname = driver.findElementById("createLeadForm_firstName");
		firstname.sendKeys("Naveen");

		//Enter the Lastname
		driver.findElementById("createLeadForm_lastName").sendKeys("Elumalai");
		
		//Select Source Dropdown
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		System.out.println(size);
		
		//dd.selectByIndex(size - 4);
	//	dd.selectByVisibleText("Employee");
	//	dd.selectByValue("LEAD_CONFERENCE");
	dd.selectByIndex(6);
		
		
		//Click on Create Lead Button
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		// Close the browser
       	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
