package com.sundaniu.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sundaniu.commonobject.UseBrowser;
import com.sundaniu.pageobject.HomePageObject;

public class SeleniumLoginTest {
	
	HomePageObject page=new HomePageObject();
	UseBrowser browser = new UseBrowser();
	WebDriver drivers;
	String userName="111";
	String passWord="111";
	String name="Å£½´";
	String age="18";
	String eidtname="Å£½´´ó»µµ°";
	String eidtAge="233";
	
	@Test
	public void testLogin() {
		//µÇÂ½
		page.sendKeysUserName(drivers, userName);
		
		page.sendKeysPassWord(drivers, passWord);
		
		page.clickLoginButton(drivers);
		
		//Ìí¼Ó
		page.addStudent(drivers, name, age);
		
		//²éÑ¯Ìí¼Ó
		page.queryName(drivers, name);
		
		page.querySub(drivers);
		
		page.querySex(drivers, 1);
		
		page.querySub(drivers);
		
		//ÐÞ¸Ä
		page.eidtStudent(drivers, eidtname, eidtAge);
		
		//²éÑ¯
		page.queryName(drivers, eidtname);
		page.querySub(drivers);
		//É¾³ý
		page.delectStudent(drivers);
		
	}
	
	

	@BeforeMethod
	  public void beforeMethod() {
	      System.out.println("Before method success....");
	     
	  }

	  @AfterMethod
	  public void afterMethod() {
	      System.out.println("After Method success....");
	  }

	  @BeforeClass
	  public void beforeClass() {
	      System.out.println("Before Class success....");
	  }

	  @AfterClass
	  public void afterClass() {
	      System.out.println("After Class success....");
	  }

	  @BeforeTest
	  public void beforeTest() {
	      System.out.println("Before Test success....");
	  }

	  @AfterTest
	  public void afterTest() {
	      System.out.println("After Test success....");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
	      drivers = browser.setupChrome("http://112.74.190.69/student/");
	      System.out.println("Before Suite success....");
	  }

	  @AfterSuite
	  public void afterSuite() {
	 //     browser.closeBrowser();
	      System.out.println("After Suite success....");
	  }
	
}
