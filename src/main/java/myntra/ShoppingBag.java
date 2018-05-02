package myntra;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBag extends BuyPage {
	public ShoppingBag() {		
		PageFactory.initElements(driver,this);
	}
	static final String  cartAmt="";
	@FindBy(how=How.XPATH,using="//div[@class='prod-name']")
	private WebElement cartValue;
	public    ShoppingBag getPriceOfCartItem() {
		String cartAmt = getText(cartValue);
		System.out.println(cartAmt);
		return this ;		
	}

	public  ShoppingBag verifyCartValue() {
		if(cartAmt.contains(actualPrice)) {
			System.out.println("Added and verified the prices");
		}
		else {
			System.out.println("error");
		}	
		return this;
	}

}
