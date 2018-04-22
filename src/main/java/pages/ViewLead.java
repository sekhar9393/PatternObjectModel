package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	public ViewLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyCreated;
	public  ViewLead verifyCreateLead(String data) {
		verifyPartialText(eleVerifyCreated, data);
		
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleClickEditBtn;
	@And("Click EditBtn")
	public  EditLead clickEditLead( ) {
		click(eleClickEditBtn);
		return new EditLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleClickDeleteBtn;
	@And("Click DeleteButton")

	public   MyLeads clickDeleteLead( ) {
		click(eleClickDeleteBtn);
		return new MyLeads();
	}
	
	@FindBy(how= How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads	;
	public    FindLeads clickFindLeads() {
		click(eleFindLeads);
		return new FindLeads();		
	}
	
	
	@FindBy(how= How.XPATH,using="(//span[@class = 'tabletext'])[4]")
	private WebElement getViewRecInfo;
@And("Get FirstRecordInfo")
	public  ViewLead getViewRecordInfo() {
		getViewRecordsInfo = getText(getViewRecInfo)	;	
		return  this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleClickDuplicateBtn;
	public   DuplicateLead clickDuplicateLead( ) {
		click(eleClickDuplicateBtn);
		return new DuplicateLead();
	}
}
