package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	public EditLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how= How.XPATH,using="//input[@id = 'updateLeadForm_companyName']")
	private WebElement eleCompanyName;
	@And("Enter Edit Cname as (.*)")

public   EditLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;		
	}
	@FindBy(how= How.XPATH,using="//input[@type ='submit']")
	private WebElement eleSubmit;
	@And("Click Submit in Edit button")
	public   ViewLead clickSubmit() {
		click(eleSubmit);
		return  new ViewLead();

	}



}
