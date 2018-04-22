package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Verification of EditLead";
		testNodes="Leads";
		category="Smoke";
		authors="sekhar";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fname,String CName)  {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fname)
		.clickFindButton()
		.clickFirstRes()
		.clickEditLead()
		.enterCompanyName(CName)
		.clickSubmit()
		.verifyCreateLead(CName)	
		
		
		;
				
	}

}
