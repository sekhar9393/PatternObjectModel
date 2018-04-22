package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {


	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how= How.XPATH,using="(//input[@name ='firstName'])")
	private WebElement eleFirstName;
	@And("FirstName as (.*)")
	public  FindLeads enterFirstName(String data) {
		type(eleFirstName, data);
		return  this;		
	}

	@And("Enter FirstName for ToLead as (.*)")
	public  FindLeads enterFirstNameToLead(String data) {
		type(eleFirstName, data);
		return  this;		
	}

	@FindBy(how= How.XPATH,using="//input[@name = 'id']")
	private WebElement enterLeadID;
	@And("Enter Captured LEadID")
	public  FindLeads enterCapturedLead(String getViewRecordsInfo) {
		type(enterLeadID, getViewRecordsInfo);
		return  this;		
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindButton;
	@And("Click FindLeadBtn")
	public  FindLeads clickFindButton() {
		click(eleFindButton);
		return this;
	}



	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstres;


	public FindLeads getFirstResult() {
		getRecordsInfo = getText(eleFirstres);
		return this;
	}
	@And("Click FirstResID")
	public ViewLead clickFirstRes() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(eleFirstres));
		click(eleFirstres);
		return new ViewLead();
	}



	@FindBy(how= How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhone;
	public  FindLeads clickPhone( ) {
		click(elePhone);
		return  this;		
	}

	@FindBy(how= How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleEnterPhone;
	public  FindLeads enterPhone(String data ) {
		type(eleEnterPhone,data);
		return  this;		
	}



	@FindBy(how= How.XPATH,using="(//input[@name ='firstName'])[3]")
	private WebElement eleLead;
	public  FindLeads enterLead(String firstResLeadIdString ) {
		type(eleLead, firstResLeadIdString);
		return  this;		
	}

	public  FindLeads enterLeadFOrDelete(String getRecordsInfo ) {
		type(eleLead, getRecordsInfo);
		return  this;		
	}



	@FindBy(how= How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement verifyRecord;
	public  FindLeads getRecordsInfo() {
		getRecordsInfo=	getText(verifyRecord)	;	
		return  this;		
	}



	public  FindLeads verifyRecords(String expectedText) {
		verifyPartialText(verifyRecord, expectedText);
		return  this;		
	}







}
