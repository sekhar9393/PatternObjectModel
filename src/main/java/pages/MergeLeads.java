package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {

	public MergeLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how = How.XPATH,using = "(//img[@alt ='Lookup'])[1]")
	private WebElement clickFromLeadIcon;
	@And("Click FromLeadIcon")
	public    MergeLeads clickFromLeadIcon() {
		clickWithNoSnap(clickFromLeadIcon);
		return this;	
	}
	@And("Switch to New Window")
	public  NewWindowFromMergeLead navToNewWindow() {
		switchToWindow(2);
		return new NewWindowFromMergeLead();
	}
	@FindBy(how = How.XPATH,using = "(//img[@alt ='Lookup'])[2]")
	private WebElement clickFromToIcon;
	@And("Click ToLeadIcon")
	public  MergeLeads   clickToIcon() {
		click(clickFromToIcon);
		return this;	
	}

	@FindBy(how = How.XPATH,using = "(//td/a)[5]")
	private WebElement clickMergeLeads;
	@And ("Click Merge Button")
	public  MergeLeads   clickMergeLeads() {
		click(clickMergeLeads);
		return this;	
	}

	@And ("Accept Alert")
	public ViewLead accAlert() {
		acceptAlert();
		return new ViewLead();	
	}
	
	




}
