package com.dollardays.testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.MyWishlistPage;



public class TC_Wishlist extends BaseTest {

	@Test
	public void wishlistTest() throws InterruptedException
	{
		MyWishlistPage wl = new MyWishlistPage(driver);
		
		wl.clickWishlist();
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Step1: Wishlist icon got clicked and dropdown listed");
		
		wl.clickDonToday();
	    String title2 = driver.getTitle();
	    Thread.sleep(3000);
	    System.out.println("The DonateToday title is "+title2);
	    
	    wl.clickWishlist();
	    Thread.sleep(3000);
	    
	    wl.clickLearnMore();
		String title1 = driver.getTitle();
	    Thread.sleep(3000);
	    System.out.println("The LearnMore title is "+title1);
	    
	    if (title2.equals(title1) )
	    {
	    	Assert.assertTrue(true);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Learn More/Donate Today - Navigates to same Page");
	    }
		
	    else {
	    	//screenshot
	    	Assert.assertTrue(false);
	    	ExtentTestManager.getTest().log(Status.PASS, "By Clicking Learn More/Donate Today-Not Navigates to same Page");
	    }
	    
	   boolean img1 =  wl.displayBanner1();
		wl.checkImage(img1);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS,"The Banner1 image got captured Successfully");
		
		boolean img2 =  wl.displayBanner2();
			wl.checkImage(img2);
			Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS,"The Banner2 image got captured Successfully");
			
			boolean img3 =  wl.displayBanner2();
			wl.checkImage(img3);
			Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS,"The Banner3 image got captured Successfully");
			
			
			wl.colorValidation();
			
			ExtentTestManager.getTest().log(Status.PASS,"The Create a Wishlist button color changed during mousehover Successfully");

			
	}
}
