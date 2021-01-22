package com.dollardays.pages;
import java.util.ArrayList;

import javax.swing.Popup;
import javax.swing.border.TitledBorder;

import org.apache.http.cookie.CookieSpec;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;
import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

import bsh.This;
import freemarker.core.ReturnInstruction.Return;

public class HomePage {
	
	WebDriver driver;
	public WebDriverWait wait;
	public ArrayList<WebElement> listOfElements;
	public HomePage(WebDriver driver) {
	
		
		this.driver = driver;
        listOfElements= new ArrayList<WebElement>();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,(10));
	}
	
	public void waitVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	
	
	    
	    }
	//Home Page Locators
	                
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/figure[1]/div[1]/a[1]/img[1]")
	public WebElement Title;

	@FindBy(xpath="//strong[contains(text(),'(877) 837-9569')]")
	public WebElement ContactNumber;
	
	public WebElement getContactNumber() {
		return ContactNumber;
		
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	public WebElement SearchBar;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	public WebElement SearchBarButton;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/i[1]")
	public WebElement SignIn;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/i[1]")
	public WebElement Wishlist;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/div[1]/a[1]/img[1]")
	public WebElement Cart;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[1]/a[1]/img[1]")
	public WebElement DDLink;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[3]")
	public WebElement MenuBar;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]/img[1]")
	public WebElement CloseMenuBar;
	
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[1]/div[1]/div[1]/a[1]/img[1]")
	public WebElement SharetheHealthImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[1]/div[1]/div[2]/a[1]/img[1]")
	public WebElement SmallerCasePacksImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[1]/div[1]/div[3]/a[1]/img[1]")
	public WebElement PPEMasksImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/figure[1]/img[1]")
	public WebElement PPEPersonalCareImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
	public WebElement PPEPersonalCareLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]/figure[1]/img[1]")
	public WebElement WinterWearBlanketsImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	public WebElement WinterWearBlanketsLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]/figure[1]/img[1]")
	public WebElement FoodSnacksImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")
	public WebElement FoodSnacksLink;
	
	@FindBy(xpath="//h2[contains(text(),'Shop by Category')]")
	public WebElement ShopByCategoryImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/img[1]")
	public WebElement PPEImage;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/h4[1]")
	public WebElement PPELink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[2]/a[1]/img[1]")
	public WebElement TravelSizeImage;
	
	@FindBy(xpath="//h4[contains(text(),'Travel Size')]")
	public WebElement TravelSizeLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[3]/a[1]/img[1]")
	public WebElement ToysImage;
	
	@FindBy(xpath="//h4[contains(text(),'Toys')]")
	public WebElement ToysLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[4]/a[1]/img[1]")
	public WebElement GamesPuzzlesImage;
	
	@FindBy(xpath="//h4[contains(text(),'Games + Puzzles')]")
	public WebElement GamesPuzzlesLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[5]/a[1]/img[1]")
	public WebElement ElectronicsImage;
	
	@FindBy(xpath="//h4[contains(text(),'Electronics')]")
	public WebElement ElectronicsLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[6]/a[1]/img[1]")
	public WebElement HolidayPartyImage;
	
	@FindBy(xpath="//h4[contains(text(),'Holiday + Party')]")
	public WebElement HolidayPartyLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[7]/a[1]/img[1]")
	public WebElement BlanketsImage;
	
	@FindBy(xpath="//h4[contains(text(),'Blankets')]")
	public WebElement BlanketsLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[8]/a[1]/img[1]")
	public WebElement SocksImage;
	
	@FindBy(xpath="//h4[contains(text(),'Socks')]")
	public WebElement SocksLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[9]/a[1]/img[1]")
	public WebElement WinterWearImage;
	
	@FindBy(xpath="//h4[contains(text(),'Winter Wear')]")
	public WebElement WinterWearLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[10]/a[1]/img[1]")
	public WebElement ShoesImage;
	
	@FindBy(xpath="//h4[contains(text(),'Shoes')]")
	public WebElement ShoesLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[11]/a[1]/img[1]")
	public WebElement WinterAccessoriesImage;
	
	@FindBy(xpath="//h4[contains(text(),'Winter Accessories')]")
	public WebElement WinterAccessoriesLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[12]/a[1]/img[1]")
	public WebElement BabyImage;
	
	@FindBy(xpath="//h4[contains(text(),'Baby')]")
	public WebElement BabyLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[13]/a[1]/img[1]")
	public WebElement FoodImage;
	
	@FindBy(xpath="//h4[contains(text(),'Food')]")
	public WebElement FoodLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[14]/a[1]/img[1]")
	public WebElement BackpackImage;
	
	@FindBy(xpath="//h4[contains(text(),'Backpacks')]")
	public WebElement BackpackLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[15]/a[1]/img[1]")
	public WebElement SchoolOfficeImage;
	
	@FindBy(xpath="//h4[contains(text(),'School & Office')]")
	public WebElement SchoolOfficeLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[16]/a[1]/img[1]")
	public WebElement HygieneKitsImage;
	
	@FindBy(xpath="//h4[contains(text(),'Hygiene Kits')]")
	public WebElement HygieneKitsLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[17]/a[1]/img[1]")
	public WebElement CleaningSuppliesImage;
	
	@FindBy(xpath="//h4[contains(text(),'Cleaning Supplies')]")
	public WebElement CleaningSuppliesLink;
	
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[2]/div[18]/a[1]/img[1]")
	public WebElement MedicineTreatmentImage;
	
	@FindBy(xpath="//h4[contains(text(),'Medicine & Treatment')]")
	public WebElement MedicineTreatmentLink;
	
	@FindBy(xpath="//*[@id=\"close2\"]/span")
	public WebElement popupClose;
	
	@FindBy(xpath="//*[@id=\"modal-nonregoffer\"]/div/div/div")
      WebElement popupWindow;
	
	@FindBy(xpath="/html/body/form/footer/div[2]/div")
    WebElement cookiesPopup;
	
	@FindBy(xpath="/html/body/form/footer/div[2]/div/p/input")
    WebElement cookiesPopupClose;
	
	public void closeCookies() {
		try {
			waitVisibility(cookiesPopup);
			cookiesPopupClose.click();
			System.out.println("Cookies Popup closed");
			
		}
		catch (Exception e) {
			System.out.println("No cookies popup found");
		}
	}

  
	
	public void findPopup() {
		try {
			
	  waitVisibility(popupWindow);
	 // WebElement element= popupWindow;
	 // WebDriverWait wait = new WebDeiverWait ((driver,(20));
	 // wait.until(ExpectedConditions.visibilityOf(element));
	  popupClose.click();
	  System.out.println("Popup closed");
		}
		catch (Exception e) {
		System.out.println("No Popup foundnow"+ e);
		}
	}

	
	public void clickTitle() {
		Title.click();
	}
	
	public boolean displayTitle() {
		boolean imagePresent1 = Title.isDisplayed();
		return imagePresent1;
	} 
	
	//public boolean displayContactNumber() {
		//boolean imagePresent2 = ContactNumber.isDisplayed();
		//return imagePresent2;
	//} 
	
	
	public void clickSearchBar() {
		SearchBar.click();
		
	}
	
	public void getSearchBar(String validdata) {
		SearchBar.sendKeys(validdata);
		
	}
	
	public void clickSearchBarButton() {
		SearchBarButton.click();
	}
		
	public void clickSignIn() {
		SignIn.click();
	}
	
	public void clickWishlist() {
		Wishlist.click();
	}
	
	public void clickCart() {
		Cart.click();
	}
	
	public void clickDDLink() {
		DDLink.click();
	}
	
	public void clickMenuBar() {
		MenuBar.click();
	}
	
	public void closeMenuBar() {
		CloseMenuBar.click();
	}
	
	public void ImgSharetheHealth() {
		SharetheHealthImage.click();
	}
	
	public void ImgSmallerCasePacks() {
		SmallerCasePacksImage.click();
	}
	
	public void ImgPPEMasks() {
		PPEMasksImage.click();
	}
	
	public void ImgPPEPersonalCare() {
		PPEPersonalCareImage.click();
	}
	
	public void clickPPEPersonalCare() {
		PPEPersonalCareLink.click();
	}
	public void ImgWinterWearBlankets() {
		WinterWearBlanketsImage.click();
	}
	
	public void clickWinterWearBlankets() {
		WinterWearBlanketsLink.click();
	}
	
	public void ImgFoodSnacks() {
		FoodSnacksImage.click();
	}
	
	public void clickFoodSnacks() {
		FoodSnacksLink.click();
	}

	
	
	
	public boolean displayShopByCategory() {
		boolean imagePresent3 = Title.isDisplayed();
		return imagePresent3;
	} 
	
	public WebElement getShopByCategory() {
		// TODO Auto-generated method stub
		return ShopByCategoryImage;
	}
	
	
	
	public void ImgPPE() {
		PPEImage.click();
	}
	
	
	public void LinkPPE() {
		PPELink.click();
	}
	
	public void ImgTravelSize() {
		TravelSizeImage.click();
	}

	public void LinkTravelSize() {
		TravelSizeLink.click();
	}
	public void ImgToys() {
		ToysImage.click();
	}
	
	
	public void LinkToys() {
		ToysLink.click();
	}
	
	public void ImgGamesPuzzles() {
		GamesPuzzlesImage.click();
	}
	
	public void LinkGamesPuzzles() {
		GamesPuzzlesLink.click();
	}
	
	public void ImgElectronics() {
		ElectronicsImage.click();
	}
	
	public void LinkElectronics() {
		ElectronicsLink.click();
	}
	
	public void ImgHolidayParty() {
		HolidayPartyImage.click();
	}
	
	
	public void LinkHolidayParty() {
		HolidayPartyLink.click();
	}
	
	public void ImgBlankets() {
		BlanketsImage.click();
	}
	
	
	public void LinkBlankets() {
		BlanketsLink.click();
	}
	
	public void ImgSocks() {
		SocksImage.click();
	}
	
	
	public void LinkSocks() {
		SocksLink.click();
	}
	
	public void ImgWinterWear() {
		WinterWearImage.click();
	}
	
	
	public void LinkWinterWear() {
		WinterWearLink.click();
	}
	
	public void ImgShoes() {
		ShoesImage.click();
	}
	
	
	public void LinkShoes() {
		ShoesLink.click();
	}
	
	public void ImgWinterAccessories() {
		WinterAccessoriesImage.click();
	}
	
	public void LinkWinterAccessories() {
		WinterAccessoriesLink.click();
	}
	
	public void ImgBaby() {
		BabyImage.click();
	}
	
	public void LinkBaby() {
		BabyLink.click();
	}
	
	
	public void ImgFood() {
		FoodImage.click();
	}
	
	public void LinkFood() {
		FoodLink.click();
	}
	
	
	public void ImgBackpack() {
		BackpackImage.click();
	}
	
	public void LinkBackpack() {
		BackpackLink.click();
	}
	
	
	public void ImgSchoolOffice() {
		SchoolOfficeImage.click();
	}
	
	public void LinkSchoolOffice() {
		SchoolOfficeLink.click();
	}
	
	public void ImgHygieneKits() {
		HygieneKitsImage.click();
	}
	
	public void LinkHygieneKits() {
		HygieneKitsLink.click();
	}
	
	public void ImgCleaningSupplies() {
		CleaningSuppliesImage.click();
	}
	
	public void LinkCleaningSupplies() {
		CleaningSuppliesLink.click();
	}
	
	public void ImgMedicineTreatment() {
		MedicineTreatmentImage.click();
	}
	
	public void LinkMedicineTreatment() {
		MedicineTreatmentLink.click();
	}
	
	public void function(WebElement data) {
		data.click();
	}
	
	public void setList() {
	this.listOfElements.add(PPEImage);
	this.listOfElements.add(PPELink);
	this.listOfElements.add(TravelSizeImage);
	this.listOfElements.add(TravelSizeLink);
	this.listOfElements.add(ToysImage);
	this.listOfElements.add(ToysLink);
	this.listOfElements.add(GamesPuzzlesImage);
	this.listOfElements.add(GamesPuzzlesLink);
	/*this.listOfElements.add(ElectronicsImage);
	this.listOfElements.add(ElectronicsLink);
	this.listOfElements.add(HolidayPartyImage);
	this.listOfElements.add(HolidayPartyLink);
	this.listOfElements.add(BlanketsImage);
	this.listOfElements.add(BlanketsLink);
	this.listOfElements.add(SocksImage);
	this.listOfElements.add(SocksLink);
	this.listOfElements.add(WinterWearImage);
	this.listOfElements.add(WinterWearLink);
	this.listOfElements.add(ShoesImage);
	this.listOfElements.add(ShoesLink);
	this.listOfElements.add(WinterAccessoriesImage);
	this.listOfElements.add(WinterAccessoriesLink);
	this.listOfElements.add(BabyImage);
	this.listOfElements.add(BabyLink);
	this.listOfElements.add(FoodImage);
	this.listOfElements.add(FoodLink);
	this.listOfElements.add(BackpackImage);
	this.listOfElements.add(BackpackLink);
	this.listOfElements.add(SchoolOfficeImage);
	this.listOfElements.add(SchoolOfficeLink);
	this.listOfElements.add(HygieneKitsImage);
	this.listOfElements.add(HygieneKitsLink);
	this.listOfElements.add(CleaningSuppliesImage);
	this.listOfElements.add(CleaningSuppliesLink);
	this.listOfElements.add(MedicineTreatmentImage);
	this.listOfElements.add(MedicineTreatmentLink);
	*/
	
	}
	
	public ArrayList<WebElement> getList() {
		return this.listOfElements;
		}
	
	
	
	
	public void updateLog(Boolean testScriptRun, String logMessage) {
		if(testScriptRun) {
			Assert.assertTrue(true);
			ExtentTestManager.getTest().log(Status.PASS, logMessage);
			
		}
		else {
			Assert.assertTrue(false);
			ExtentTestManager.getTest().log(Status.PASS, logMessage);

		}
	}

	public WebElement getShopByCategory1() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
		
		
	
	
	
	
	
	
}