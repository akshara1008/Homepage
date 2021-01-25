package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import org.testng.annotations.Test;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.util.SystemOutLogger;
import org.apache.xpath.operations.Equals;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.jce.provider.BrokenJCEBlockCipher.BrokePBEWithSHA1AndDES;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.MyWishlistPage;
import com.dollardays.pages.HomePage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;
import com.dollardays.commons.BrowserUtil;

public class HomePageTestcase extends BaseTest{
	

	@Test (priority=1)
	public void HomePageTest1() throws InterruptedException
	{
		HomePage a1 = new HomePage(driver);
		driver.manage().deleteAllCookies();
		
		a1.displayTitle();
		String title1 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Title is "+title1);  
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Title is displayed");
		
		String expected  = a1.getContactNumber().getText();
		String actual = "(877) 837-9569";
	    Thread.sleep(2000);
	    System.out.println("Expected ContactNumber is"+expected); 
	    System.out.println("Actual ContactNumber is "+"(877) 837-9569");
	    Assert.assertTrue(true);
		ExtentTestManager.getTest().log(Status.PASS, "Step2: Contact Number is displayed as expected");
		
		a1.clickSearchBar();
		Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step3: Click SearchBar");
	    
		a1.getSearchBar("backpack");
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.PASS, "Step4: Entered valid data in SearchBar");
		
	    a1.clickSearchBarButton();
		Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.PASS, "Step5: Click Search Bar Button and Valid data item shown in new window");
	    
	    a1.clickTitle();
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step6: Go back to Homepage");
	    
	    a1.clickSignIn();
	    Thread.sleep(3000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step7: Click SignIn Dropdown appears");
	    
	    a1.findPopup();
	    Thread.sleep(2000);
	    
	    a1.clickWishlist();
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step8: Click Wishlist Dropdown appears");
		
	    a1.clickCart();
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step9: Click Cart New Window Opens");
		
	    a1.findPopup();
	    Thread.sleep(2000);
	    
	    a1.clickDDLink();
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step10: Go back to Homepage");
	    
	    a1.clickMenuBar();
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step11: Click MenuBar dropdown appears");
	    
	    a1.closeMenuBar();
	    Thread.sleep(2000);
	    ExtentTestManager.getTest().log(Status.INFO, "Step12: Click to close MenuBar");
	}
	
	
	@Test (priority=2)
	public void HomePageTest2() throws InterruptedException
	{
		HomePage a2 = new HomePage(driver);
		driver.manage().deleteAllCookies();
	   
	    a2.ImgSharetheHealth();
		String title01 = driver.getCurrentUrl();
	    Thread.sleep(6000);
	    System.out.println("CurrentUrl is "+title01);  
		ExtentTestManager.getTest().log(Status.INFO, "Step1: CurrentUrl is displayed");
		
		a2.findPopup();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Navigate to previous page");
	
		a2.ImgSmallerCasePacks();
		String title02 = driver.getCurrentUrl();
	    Thread.sleep(2000);
	    System.out.println("CurrentUrl is "+title02);  
		ExtentTestManager.getTest().log(Status.INFO, "Step3: CurrentUrl is displayed");
		
		driver.navigate().back();
		Thread.sleep(10000);
		ExtentTestManager.getTest().log(Status.INFO, "Step4: Navigate to previous page");
		
		a2.ImgPPEMasks();
		String title03 = driver.getCurrentUrl();
	    Thread.sleep(2000);
	    System.out.println("CurrentUrl is "+title03);  
		ExtentTestManager.getTest().log(Status.INFO, "Step5: CurrentUrl is displayed");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.INFO, "Step6: Navigate to previous page");
	}
	
	@Test (priority=3)
	public void HomePageTest6() throws InterruptedException
	{
		HomePage a6 = new HomePage(driver);	
		driver.manage().deleteAllCookies();
		
	    a6.ImgPPEPersonalCare();
		String title3 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("PPEPersonalCare title is "+title3);  
		ExtentTestManager.getTest().log(Status.PASS, "Step7: Click on Image PPEPersonalCare");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.INFO, "Step8: Navigate to previous page");
		
	    a6.findPopup();
		Thread.sleep(2000);
			
		a6.clickPPEPersonalCare();
	    String title4 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("PPEPersonalCare title is "+title4);
	    ExtentTestManager.getTest().log(Status.PASS, "Step9: Click on Link PPEPersonalCare");
	    
	    a6.findPopup();
		Thread.sleep(2000);
		
	   if (title3.equals(title4) )
	    {
		   Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking PPEPersonalCare title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking PPEPersonalCare title -Not Navigates to same Page");
	    }
	  
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.INFO, "Step10: Navigate to previous page");
		
		    a6.ImgWinterWearBlankets();
			String title5 = driver.getTitle();
			Thread.sleep(2000);
		    System.out.println("WinterWearBlankets title is "+title5);  
			ExtentTestManager.getTest().log(Status.PASS, "Step11: Click on Image WinterWearBlankets");
			
			driver.navigate().back();
			Thread.sleep(2000);
			ExtentTestManager.getTest().log(Status.PASS, "Step12: Navigate to previous page");
			
			a6.clickWinterWearBlankets();
		    String title6 = driver.getTitle();
		    Thread.sleep(2000);
		    System.out.println("WinterWearBlankets title is "+title6);
		    ExtentTestManager.getTest().log(Status.PASS, "Step13: Click on Link WinterWearBlankets");
		   
		    if (title5.equals(title6) )
		    {
		    	Assert.assertTrue(true);
		    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking WinterWearBlankets title - Navigates to same Page");
		    }
			
		    else {
		    	//screenshot
		    	Assert.assertTrue(false);
		    	System.out.println("Fail");
		    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking WinterWearBlankets title -Not Navigates to same Page");
		    }
		    
		    driver.navigate().back();
		    Thread.sleep(2000);
			ExtentTestManager.getTest().log(Status.INFO, "Step14: Navigate to previous page");
			
			    a6.ImgFoodSnacks();
				String title7 = driver.getTitle();
				Thread.sleep(2000);
			    System.out.println("FoodSnacks title is "+title7);  
				ExtentTestManager.getTest().log(Status.PASS, "Step15: Click on Image FoodSnacks");
				
				driver.navigate().back();
				Thread.sleep(2000);
				ExtentTestManager.getTest().log(Status.PASS, "Step16: Navigate to previous page");
				
				a6.clickFoodSnacks();
			    String title8 = driver.getTitle();
			    Thread.sleep(2000);
			    System.out.println("FoodSnacks title is "+title8);
			    ExtentTestManager.getTest().log(Status.PASS, "Step17: Click on Link FoodSnacks");
			   
			    if (title7.equals(title8) )
			    {
			    	Assert.assertTrue(true);
			    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking FoodSnacks title - Navigates to same Page");
			    }
				
			    else {
			    	//screenshot
			    	Assert.assertTrue(false);
			    	System.out.println("Fail");
			    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking FoodSnacks title -Not Navigates to same Page");
			    }
			    
			    driver.navigate().back();
			    Thread.sleep(2000);
				ExtentTestManager.getTest().log(Status.INFO, "Step18: Navigate to previous page");
	    
		
	}
	    
	@Test(priority=4)
    public void HomePageTest5() throws InterruptedException
	{
		HomePage a5 = new HomePage(driver);
		driver.manage().deleteAllCookies();
		
		a5.displayShopByCategory();
		String expectedText  = a5.getShopByCategory().getText();
		String actualText = ("ShopByCategory");
		Thread.sleep(2000);
	    System.out.println("Expected Text is "+expectedText);
	    System.out.println("Actual Text is "+"ShopByCategory");  
	    Assert.assertTrue(true);
	    ExtentTestManager.getTest().log(Status.PASS, "Step1: ShopByCategory is displayed");	
		 
		a5.findPopup();
		
		a5.setList();
		ArrayList<WebElement> list = a5.getList();
		for(int i=0;i<list.size();i=i+2) {
			a5.function(list.get(i));
			String title1 = driver.getTitle();
			Thread.sleep(2000);
			System.out.println(title1);
			a5.findPopup();
		    Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			a5.function(list.get(i+1));
			String title2 = driver.getTitle();
			System.out.println(title2);
			
			Assert.assertTrue(title1.equals(title2) );
		    driver.navigate().back();
		    Thread.sleep(2000);
			}
		
	}
	
	
	   /* @Test(priority=5)
	    public void HomePageTest3() throws InterruptedException
		{
			HomePage a3 = new HomePage(driver);
		
			a3.displayShopByCategory();
		    String title01 = driver.getTitle();
		    Thread.sleep(2000);
		    ExtentTestManager.getTest().log(Status.PASS, "ShopByCategory is displayed");	
	
		    a3.ImgPPE();
		String title1 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("PPE title is "+title1);  
		ExtentTestManager.getTest().log(Status.PASS, "Step1: Click on Image PPE");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step2: Navigate to previous page");
		
		a3.LinkPPE();
	    String title2 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("PPE title is "+title2);
	    ExtentTestManager.getTest().log(Status.PASS, "Step3: Click on Link PPE");
	    
	    a3.findPopup();
	    Thread.sleep(2000);
	    
	    
	    if (title1.equals(title2) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking PPE title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking PPE title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step4: Navigate to previous page");
	    
		a3.findPopup();
		Thread.sleep(2000);
		
	    a3.ImgTravelSize();
		String title3 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("TravelSize title is "+title3);  
		ExtentTestManager.getTest().log(Status.PASS, "Step5: Click on Image TravelSize");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step6: Navigate to previous page");
		
		a3.LinkTravelSize();
	    String title4 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("TravelSize title is "+title4);
	    ExtentTestManager.getTest().log(Status.PASS, "Step7: Click on Link TravelSize");
	    
	    if (title3.equals(title4) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking TravelSize title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.FAIL, "By Clicking TravelSize title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step8: Navigate to previous page");
	    
	    
	    a3.ImgToys();
		String title5 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Toys title is "+title5);  
		ExtentTestManager.getTest().log(Status.PASS, "Step9: Click on Image Toys");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step10: Navigate to previous page");
		
		a3.LinkToys();
	    String title6 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Toys title is "+title6);
	    ExtentTestManager.getTest().log(Status.PASS, "Step11: Click on Link Toys");
	    
	    if (title5.equals(title6) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Toys title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Toys title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step12: Navigate to previous page");
		
		a3.ImgGamesPuzzles();
		String title7 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("GamesPuzzles title is "+title7);  
		ExtentTestManager.getTest().log(Status.PASS, "Step13: Click on Image GamesPuzzles");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step14: Navigate to previous page");
		
		a3.LinkGamesPuzzles();
	    String title8 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("GamesPuzzles title is "+title8);
	    ExtentTestManager.getTest().log(Status.PASS, "Step15: Click on Link GamesPuzzles");
	    
	    if (title7.equals(title8) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking GamesPuzzles title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking GamesPuzzles title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step16: Navigate to previous page");
		
		a3.ImgElectronics();
		String title9 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Electronics title is "+title9);  
		ExtentTestManager.getTest().log(Status.PASS, "Step17: Click on Image Electronics");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step18: Navigate to previous page");
		
		a3.LinkElectronics();
	    String title10 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Electronics title is "+title10);
	    ExtentTestManager.getTest().log(Status.PASS, "Step19: Click on Link Electronics");
	    
	    a3.findPopup();
	    Thread.sleep(2000);
	    
	    if (title9.equals(title10) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Electronics title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Electronics title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step20: Navigate to previous page");
		
		a3.findPopup();
	    Thread.sleep(2000);
		
		a3.ImgHolidayParty();
		String title11 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("HolidayParty title is "+title11);  
		ExtentTestManager.getTest().log(Status.PASS, "Step21: Click on Image HolidayParty");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step22: Navigate to previous page");
		
		a3.LinkHolidayParty();
	    String title12 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("HolidayParty title is "+title12);
	    ExtentTestManager.getTest().log(Status.PASS, "Step23: Click on Link HolidayParty");
	    
	    if (title11.equals(title12) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking HolidayParty title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking HolidayParty title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step24: Navigate to previous page");
		
		a3.ImgBlankets();
		String title13 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Blankets title is "+title13);  
		ExtentTestManager.getTest().log(Status.PASS, "Step25: Click on Image Blankets");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step26: Navigate to previous page");
		
		a3.LinkBlankets();
	    String title14 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Blankets title is "+title14);
	    ExtentTestManager.getTest().log(Status.PASS, "Step27: Click on Link Blankets");
	    
	    if (title13.equals(title14) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Blankets title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Blankets title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step28: Navigate to previous page");
		
		a3.ImgSocks();
		String title15 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Socks title is "+title15);  
		ExtentTestManager.getTest().log(Status.PASS, "Step25: Click on Image Socks");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step26: Navigate to previous page");
		
		a3.LinkSocks();
	    String title16 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Socks title is "+title16);
	    ExtentTestManager.getTest().log(Status.PASS, "Step27: Click on Link Socks");
	    
	    if (title15.equals(title16) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Socks title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Socks title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step28: Navigate to previous page");
		
		a3.ImgWinterWear();
		String title17 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("WinterWear title is "+title17);  
		ExtentTestManager.getTest().log(Status.PASS, "Step29: Click on Image WinterWear");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step30: Navigate to previous page");
		
		a3.LinkWinterWear();
	    String title18 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("WinterWear title is "+title18);
	    ExtentTestManager.getTest().log(Status.PASS, "Step31: Click on Link WinterWear");
	    
	    if (title17.equals(title18) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking WinterWear title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking WinterWear title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step32: Navigate to previous page");
		}
		
		
		@Test(priority=6)
		    public void HomePageTest4() throws InterruptedException
			{
				HomePage a4 = new HomePage(driver);
		
		a4.ImgShoes();
		String title19 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Shoes title is "+title19);  
		ExtentTestManager.getTest().log(Status.PASS, "Step33: Click on Image Shoes");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step34: Navigate to previous page");
		
		a4.findPopup();
	    Thread.sleep(2000);
		
		a4.LinkShoes();
	    String title20 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Shoes title is "+title20);
	    ExtentTestManager.getTest().log(Status.PASS, "Step35: Click on Link Shoes");
	    
	    if (title19.equals(title20) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Shoes title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Shoes title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step36: Navigate to previous page");
		
		a4.ImgWinterAccessories();
		String title21 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("WinterAccessories title is "+title21);  
		ExtentTestManager.getTest().log(Status.PASS, "Step37: Click on Image WinterAccessories");
		
		a4.findPopup();
	    Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step38: Navigate to previous page");
		
		a4.LinkWinterAccessories();
	    String title22 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("WinterAccessories title is "+title22);
	    ExtentTestManager.getTest().log(Status.PASS, "Step39: Click on Link WinterAccessories");
	    
	    if (title21.equals(title22) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking WinterAccessories title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking WinterAccessories title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step40: Navigate to previous page");
		
		a4.findPopup();
	    Thread.sleep(2000);
		
		a4.ImgBaby();
		String title23 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Baby title is "+title23);  
		ExtentTestManager.getTest().log(Status.PASS, "Step41: Click on Image Baby");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step42: Navigate to previous page");
		
		a4.LinkBaby();
	    String title24 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Baby title is "+title24);
	    ExtentTestManager.getTest().log(Status.PASS, "Step43: Click on Link Baby");
	    
	    if (title23.equals(title24) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Baby title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Baby title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step44: Navigate to previous page");
		
		a4.ImgFood();
		String title25 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Food title is "+title25);  
		ExtentTestManager.getTest().log(Status.PASS, "Step45: Click on Image Food");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step46: Navigate to previous page");
		
		a4.LinkFood();
	    String title26 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Food title is "+title26);
	    ExtentTestManager.getTest().log(Status.PASS, "Step47: Click on Link Food");
	    
	    if (title25.equals(title26) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Food title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Food title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step48: Navigate to previous page");
		
		a4.ImgBackpack();
		String title27 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Backpack title is "+title27);  
		ExtentTestManager.getTest().log(Status.PASS, "Step49: Click on Image Backpack");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step50: Navigate to previous page");
		
		a4.LinkBackpack();
	    String title28 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Backpack title is "+title28);
	    ExtentTestManager.getTest().log(Status.PASS, "Step51: Click on Link Backpack");
	    
	    if (title27.equals(title28) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Backpack title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Backpack title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step52: Navigate to previous page");
		
		a4.ImgSchoolOffice();
		String title29 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("SchoolOffice title is "+title29);  
		ExtentTestManager.getTest().log(Status.PASS, "Step53: Click on Image SchoolOffice");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step54: Navigate to previous page");
		
		a4.LinkSchoolOffice();
	    String title30 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("SchoolOffice title is "+title30);
	    ExtentTestManager.getTest().log(Status.PASS, "Step55: Click on Link SchoolOffice");
	    
	    if (title29.equals(title30) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking SchoolOffice title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking SchoolOffice title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step56: Navigate to previous page");
		
		a4.ImgHygieneKits();
		String title31 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("HygieneKits title is "+title31);  
		ExtentTestManager.getTest().log(Status.PASS, "Step57: Click on Image HygieneKits");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step58: Navigate to previous page");
		
		a4.LinkHygieneKits();
	    String title32 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("HygieneKits title is "+title32);
	    ExtentTestManager.getTest().log(Status.PASS, "Step59: Click on Link HygieneKits");
	    
	    if (title31.equals(title32) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking HygieneKits title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking HygieneKits title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step60: Navigate to previous page");
		
		a4.ImgCleaningSupplies();
		String title33 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("CleaningSupplies title is "+title33);  
		ExtentTestManager.getTest().log(Status.PASS, "Step61: Click on Image CleaningSupplies");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step62: Navigate to previous page");
		
		a4.LinkCleaningSupplies();
	    String title34 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("CleaningSupplies title is "+title34);
	    ExtentTestManager.getTest().log(Status.PASS, "Step63: Click on Link CleaningSupplies");
	    
	    if (title33.equals(title34) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking CleaningSupplies title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking CleaningSupplies title -Not Navigates to same Page");
	    }
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step64: Navigate to previous page");
		
		a4.ImgMedicineTreatment();
		String title35 = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println("Medicine & Treatments title is "+title35);  
		ExtentTestManager.getTest().log(Status.PASS, "Step65: Click on Image Medicine Treatment");
		
		driver.navigate().back();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step66: Navigate to previous page");
		
		a4.LinkMedicineTreatment();
	    String title36 = driver.getTitle();
	    Thread.sleep(2000);
	    System.out.println("Medicine & Treatments title is "+title36);
	    ExtentTestManager.getTest().log(Status.PASS, "Step67: Click on Link Medicine Treatment");
	    
	    if (title35.equals(title36) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Medicine & Treatments title - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	System.out.println("Fail");
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Learn More/Donate Today-Not Navigates to same Page");
	    }
	    
	}*/
		 }