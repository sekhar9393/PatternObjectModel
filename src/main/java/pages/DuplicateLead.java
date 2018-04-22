package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	public DuplicateLead() {
			PageFactory.initElements(driver, this);
		}

	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement eleClickCreateBtn;
	public  ViewLead clickCreateLead( ) {
		click(eleClickCreateBtn);
		return new ViewLead();
	}
	
	
	
}
