package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myntra.MyntraHomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_Myntra extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_Myntra";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Sekhar";
		browserName="chrome";
		dataSheetName="Myntra";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String product) {
		
		new MyntraHomePage()
		.EnterSearchBox(product)
		.ClickSearchBox()
		.FindSunglassesCount()
		.getNamesOfSunGlasses()
		
		
		;			
	}

}
