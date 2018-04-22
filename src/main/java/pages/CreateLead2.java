package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead2 extends ProjectMethods{

	public CreateLead2() {		
		PageFactory.initElements(driver,this);

	System.out.println("Test");
	}	

/*	@FindBy(how= How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	
	public   CreateLead clickCreateLead(String data) {
		click(eleCreateLead);
		return this;		
	}*/
	

	@FindBy(how= How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter Create Lead Cname as (.*)")
	public   CreateLead2 enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;		
	}

	@FindBy(how= How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("Enter Create Lead Fname as (.*)")
	public   CreateLead2 enterFirstName(String data) {
		type(eleFirstName, data);
		return this;		
	}

	@FindBy(how= How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter Create Lead LName as (.*)")
	public   CreateLead2 enterLastName(String data) {
		type(eleLastName, data);
		return this;		
	}
	
	@FindBy(how= How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickCreateLead;
	@And("Click Create Submit button")
	public   ViewLead clickCreateLead() {
		click(eleClickCreateLead);
		return new ViewLead();		
	}

	
	
}
