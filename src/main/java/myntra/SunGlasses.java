package myntra;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SunGlasses extends ProjectMethods {
	public SunGlasses() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//div[@class='product-brand']")
	private List<WebElement> SunglassesCount;
	public   SunGlasses FindSunglassesCount() {
		getTexts(SunglassesCount);
		return this ;		
	}

	public  SunGlasses getNamesOfSunGlasses() {
		List<WebElement> sunglassnameWithDup = driver.findElementsByXPath("//div[@class='product-brand']");
		TreeSet<String> sunglassnameWithOutDup = new TreeSet<>();{
			for (WebElement sunname : sunglassnameWithDup) {
				String sunnames=sunname.getText();
				sunglassnameWithOutDup.add(sunnames);
			}
			System.out.println(sunglassnameWithOutDup);
			for (String eacchName : sunglassnameWithOutDup) {
				System.out.println(eacchName);
			}
		}

		return this;
	}
	@FindBy(how=How.XPATH,using="//li[@data-colorhex='green']")
	private WebElement greenColour;
	public   SunGlasses ClickGreenColour() {
		click(greenColour);
		return this ;		
	}

	@FindBy(how=How.XPATH,using="(//img)[2]")
	private WebElement secondItem;
	public   BuyPage ClickSecondItem() {
		click(secondItem);
		return new BuyPage() ;		
	}
	
	
}





