package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Verification of MergeLead";
		testNodes="Leads";
		category="Smoke";
		authors="sekhar";
		browserName="chrome";
		dataSheetName="TC005";
	}



	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fromId,String toId,String expectedText )  {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.navToNewWindow()
		.enterLeadID(fromId)
		.clickFindLead()
		.getFirstLead()
		.ClickFirstLead()
		.navToMainWindow()
		.clickToIcon()
		.navToNewWindow()
		.enterLeadID(toId)
		.clickFindLead()
		.ClickFirstLead()
		.navToMainWindow()
		.clickMergeLeads()
		.accAlert()
		.clickFindLeads()
		.enterLead(firstResLeadId)
		.clickFindButton()
		.getRecordsInfo()
		.verifyRecords(expectedText)
		
		
		
		
		;





		;

	}

}
