package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class NewWindowFromMergeLead extends ProjectMethods {
	public NewWindowFromMergeLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how = How.XPATH,using ="(//div/input)[1]")
	public WebElement eleEnterLeadID;
	//@And("Enter LeadID as (.*)")
	public NewWindowFromMergeLead enterLeadID(String data) {
		type(eleEnterLeadID, data);
		return this;	
	}

	@FindBy(how = How.XPATH,using ="(//div/input)[2]")
	public WebElement eleEnterFirstName;
	@And("Enter FirstName as (.*)")
	public NewWindowFromMergeLead enterFirstName(String data) {
		type(eleEnterFirstName, data);
		return this;	
	}
	


	@FindBy(how = How.XPATH,using ="(//button)[1]")
	public WebElement clickFindLead;
	@And("Click Find Lead")
	public NewWindowFromMergeLead clickFindLead() {
		click(clickFindLead);
		return this;	
	}

	@FindBy(how = How.XPATH,using ="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	public WebElement locateFirstElement;
	public  NewWindowFromMergeLead getFirstLead() {

		firstResLeadId=	getText(locateFirstElement)	;

		System.out.println(firstResLeadId);
		return this;
	}

	@And("Click First LeadID in MErgeLeads")
	public  NewWindowFromMergeLead ClickFirstLead() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locateFirstElement));	
		clickWithNoSnap(locateFirstElement);
		return this;
	}

	@And("Navigate to Parent Window from fromLead Screen")
	public  MergeLeads navToMainWindow() {
		switchToWindow(0);
		return new MergeLeads();
	}



}
