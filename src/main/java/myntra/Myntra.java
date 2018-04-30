package myntra;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		//		Print the unique sunglasses brand names
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",Keys.ENTER);
		
		List<WebElement> list = driver.findElementsByClassName("product-brand");
		
		/*System.out.println(list.size());
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.numberOfElementsToBe(By.className("product-brand"), 48));
*/
		TreeSet<String> treeSet = new TreeSet<>();
		for(WebElement brand: list)
		{
			treeSet.add(brand.getText());
		}
		System.out.println("Unique Sunglasses :");
		System.out.println(treeSet);
		System.out.println("Unique Sunglasses count : " +treeSet.size());
		//		Count of sunglasses with 40% discount and unisex product
		List<WebElement> discount = driver.findElementsByXPath
				("//div[@class='product-productMetaInfo']");
//		System.out.println(discount.size());
		int uniqueCount=0;
		for(WebElement count : discount)
		{
			if(count.getText().contains("(40% OFF)") && count.getText().contains("Unisex"))
				uniqueCount++;
		}
		System.out.println("Products with 40% off and Unisex count :" +uniqueCount);
//		Click Green colour icon
		driver.findElementByXPath("//li[@data-colorhex='green']").click();
//		Click 2nd green colour sunglasses
		String price1 = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[2]").getText();
//		System.out.println("Price1 " +price1);
		driver.findElementByXPath("(//div[@class='product-productMetaInfo'])[2]").click();
		String text1 = driver.findElementByXPath("//h1[@class='pdp-title']").getText();
		System.out.println("Green Sunglass Product name is : " +text1);
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		driver.findElementByXPath("//span[text()='GO TO BAG']").click();
		String text2 = driver.findElementByXPath("//div[@class='prod-name']/a").getText();
//		System.out.println("text2 " +text2);
		String price2 = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();
		price2=price2.replaceAll("[,]", "");
//		System.out.println("Price2 " +price2);
		if(text1.contains(text2))
		{
			System.out.println("Product name matched");
		}
		if(price1.contains(price2))
		{
			System.out.println("Product price matched");
		}
		driver.close();


	}

}