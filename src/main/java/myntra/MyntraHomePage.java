package myntra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import pages.CreateLead;
import wdMethods.ProjectMethods;

public class MyntraHomePage extends ProjectMethods {
	public MyntraHomePage() {		
		PageFactory.initElements(driver,this);
	}	

	/*public   MyntraHomePage getTitle() {
		MyntraHomePage Title = getTitle();
		return this ;		
	}*/
	
	@FindBy(how=How.XPATH,using="//input[@class='desktop-searchBar']")
	private WebElement SearchBox;
	@And("enter the search data as (.*)")
	public  MyntraHomePage EnterSearchBox(String data) {
		type(SearchBox, data);
		return this ;		
	}
	@FindBy(how=How.XPATH,using="//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement ClickSearchBox;

	public  SunGlasses ClickSearchBox() {
		click(ClickSearchBox);
		return new SunGlasses() ;		
	}


}
