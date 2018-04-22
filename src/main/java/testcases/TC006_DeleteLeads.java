package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DeleteLead";
		testDescription="Verification of DeleteLead";
		testNodes="Leads";
		category="Smoke";
		authors="sekhar";
		browserName="chrome";
		dataSheetName="TC006";
	}



	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String ph,String expectedText )  {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhone(ph)
		.clickFindButton()
		.getFirstResult()
		.clickFirstRes()
		.clickDeleteLead()
		.clickFindLeads()
        .enterLeadFOrDelete(getRecordsInfo)
        .clickFindButton()
        .verifyRecords(expectedText)
		
		;
		
	}

}
