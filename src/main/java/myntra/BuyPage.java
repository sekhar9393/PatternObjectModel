package myntra;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class BuyPage extends ProjectMethods {
	public BuyPage() {		
		PageFactory.initElements(driver,this);
	}
	static final String actualPrice="";
	@FindBy(how=How.XPATH,using="//div[@class='pdp-price-info']/h1")
	private WebElement priceOfItem;
	public   BuyPage getPriceOfItem() {
		String actualPrice = getText(priceOfItem);
		System.out.println(actualPrice);
		return this ;		
	}

	@FindBy(how=How.XPATH,using="//button[@class='pdp-add-to-bag pdp-button']")
	private WebElement AddButton;
	public   BuyPage clickAddButton() {
		click(AddButton);
		return this ;		
	}

	@FindBy(how=How.XPATH,using="//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']")
	private WebElement goToCart;
	public    ShoppingBag clickgoToCart() {
		click(goToCart);
		return new ShoppingBag() ;		
	}
	
	
	
}
