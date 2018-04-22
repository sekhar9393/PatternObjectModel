package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Verification of createLead";
		testNodes="Leads";
		category="Smoke";
		authors="sekhar";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String Cname,String FName,String LName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(Cname)
		.enterFirstName(FName)
		.enterLastName(LName)
		.clickCreateLead()
		.verifyCreateLead(Cname)
		;
				
	}

}
