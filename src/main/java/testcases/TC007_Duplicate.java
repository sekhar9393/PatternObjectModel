package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_Duplicate extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC007_DuplicateLead";
		testDescription="Verification of Duplicate Lead";
		testNodes="Leads";
		category="Smoke";
		authors="sekhar";
		browserName="chrome";
		dataSheetName="TC007";
	}



	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String data )  {


		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterLead(data)
		.clickFindButton()
		.clickFirstRes()
		.getViewRecordInfo()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyCreateLead(getViewRecordsInfo)
		;
		
	}

}
