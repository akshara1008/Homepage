package com.dollardays.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage {
	
	WebDriver driver;
	
	public MyWishlistPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Finding the WebElements
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/img[1]")
	WebElement iconWishlist;
	
	@FindBy(linkText = "Learn More")
	WebElement linkLearnMore;
	
	
	@FindBy(partialLinkText = "Donate Tod")
	WebElement linkDonToday;
	
	
	@FindBy(xpath = "//body/div[@id='carousel-home']/div[1]/div[1]/a[1]/img[1]")
	WebElement imgBanner1;
	
	
	@FindBy(xpath = "//body/div[@id='carousel-home']/div[1]/div[2]/a[1]/img[1]")
	WebElement imgBanner2;
	
	@FindBy(xpath = "//body/div[@id='carousel-home']/div[1]/div[3]/a[1]/img[1]")
	WebElement imgBanner3;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSearchWl;
	
	@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3]/div[1]/input[1]")
	WebElement txtCityWl;
	
	@FindBy (xpath = "//button[contains(text() = 'SEARCH']")
	WebElement btnSearch;
	
	//*[text()='any text']
	@FindBy (xpath = "//a[contains(text(),'Create a Wishlist')]")
	WebElement lnkCreateWishlist;
	
	@FindBy(linkText = "View all projects »")
	WebElement lnkViewProjects;
	
	@FindBy(xpath = "//body/div[@id='wishlistmidblock']/div[@class='container']/div[@class='row']/div[1]/div[1]")
	WebElement imgChristChild;
	
	@FindBy(xpath = "//body/div[@id='wishlistmidblock']/div[@class='container']/div[@class='row']/div[2]/div[1]")
	WebElement imgFreeLaun;
	
	@FindBy(xpath = "//body/div[@id='wishlistmidblock']/div[@class='container']/div[@class='row']/div[3]/div[1]")
	WebElement imgCoats;
	
	//tagname[@attribute = 'value']
	@FindBy(xpath = "//a[@href='/sp-occ/wishlist.html']")
	WebElement lnkDonateNow1;
	
	
	@FindBy(xpath = "//a[@href='/chsblessingbox/wishlist.html']")
	WebElement lnkDonateNow2;
	
	@FindBy(xpath = "//a[@href='/thirtysixthannualcoatsforkids/wishlist.html']")
	WebElement lnkDonateNow3;
	
	@FindBy(xpath = "//*[@id=\"modal-nonregoffer\"]/div/div/div")
	WebElement popupWindow;
	
	
	
	@FindBy(xpath = "//*[@id=\"close2\"]/span")
	WebElement popupClose;

	
	//after finding the elements, below are the methods to perform actions
	
	public void clickWishlist() {
		iconWishlist.click();
	}
	public void clickLearnMore() {
		linkLearnMore.click();
	}
	public void clickDonToday() {
		linkDonToday.click();
	}

	public boolean displayBanner1() {
		boolean imagePresent = imgBanner1.isDisplayed();
		return imagePresent;
	} 
	public boolean displayBanner2() {
		boolean imagePresent = imgBanner2.isDisplayed();
		return imagePresent;
	} 
	public boolean displayBanner3() {
		boolean imagePresent = imgBanner3.isDisplayed();
		return imagePresent;
	}
	public void setSearchWl(String sname){
		 txtSearchWl.sendKeys(sname);
    }
	public void setCityWl(String cname) {
			txtCityWl.sendKeys(cname);
	}
	public void clickSearch() {
			btnSearch.click();
	}
	public void clickCreateWishlist() {
		lnkCreateWishlist.click();
	}
	public void clickViewProjects() {
		lnkViewProjects.click();
	}
	public boolean displayChrist() {
		
		boolean imagePresent = imgChristChild.isDisplayed();
		return imagePresent;
		
		/*boolean imagePresent = (boolean)((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof argumants[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth>0",imgChristChild);
		return imagePresent;*/
		
	}
	public boolean displayFreeLaun() {
		
		boolean imagePresent = imgFreeLaun.isDisplayed();
		return imagePresent;
	}
	public boolean displayCoats() {
	
	boolean imagePresent = imgCoats.isDisplayed();
	return imagePresent;
	}
	public void clickDonateNow1() {
		lnkDonateNow1.click();
	}
	public void clickDonateNow2() {
		lnkDonateNow2.click();
	}
	public void clickDonateNow3() {
		lnkDonateNow3.click();
	}
	public void checkImage(boolean imagePresent) {
		if(!imagePresent) {
			System.out.print("The image not displayed");
		}else
			System.out.println("The image got displayed sucessfully");
	}
	
	public void findPopup() {
		Actions action = new Actions(driver);
		action.moveToElement(popupWindow).build().perform();
		popupClose.click();
	}
	
	
	/*public void mousehover(webElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}*/
	public void colorValidation()
	{
		
		Actions action = new Actions(driver);
		action.moveToElement(lnkCreateWishlist).build().perform();
		String color = lnkCreateWishlist.getCssValue("background-color");
		System.out.println("The color is "+color);
	}	
	
}
