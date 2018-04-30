package week9day2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MytraIntegration {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();


		driver.findElementByXPath("//input[@class='desktop-searchBar']").sendKeys("sunglasses",Keys.ENTER);


		List<WebElement> sunglassescount = driver.findElementsByXPath("//div[@class='product-brand']");
		int count = sunglassescount.size();
		System.out.println("Total shoe count:"+count);

		List<WebElement> sunglassnameWithDup = driver.findElementsByXPath("//div[@class='product-brand']");

		TreeSet<String> sunglassnameWithOutDup = new TreeSet<>();
		for (WebElement sunname : sunglassnameWithDup) {
			String sunnames=sunname.getText();
			sunglassnameWithOutDup.add(sunnames);
		}
		System.out.println(sunglassnameWithOutDup);
		for (String eacchName : sunglassnameWithOutDup) {
			System.out.println(eacchName);
		}



		//40 Percent
		System.out.println("--------40%----------");

		List<WebElement> discPer = driver.findElementsByClassName("product-productMetaInfo");
		int count1=0;

		for (WebElement eachDiscPer : discPer) {
			//	String eachDiscPerVal = eachDiscPer.getText();
			//	System.out.println(eachDiscPerVal);			
			if(eachDiscPer.getText().contains("40% OFF")&&eachDiscPer.getText().contains("Unisex")) {
				count1++;
			}
		}

		System.out.println(count1);


		//Green Colour
		Thread.sleep(2000);

		driver.findElementByXPath("//li[@data-colorhex='green']").click();
		driver.findElementByXPath("(//img)[2]").click();


		//String text1 = driver.findElementByClassName("pdp-price-info").getText();
		String text1 = driver.findElementByXPath("//div[@class='pdp-price-info']/h1").getText();
		System.out.println(text1);
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']").click();
		Thread.sleep(1000);
		String text2 = driver.findElementByXPath("//div[@class='prod-name']").getText();
		System.out.println(text2);
		if(text2.contains(text1)) {
			System.out.println("Added and verified the prices");
		}
		else {
			System.out.println("error");
			}
		driver.close();

	}
	
	
}



