package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	@Test
	public void createRun(){
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
	}
}






