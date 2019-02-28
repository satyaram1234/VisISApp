package TestNGDemoNike;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	
	
	@BeforeSuite
	 public void setupBase()
	 {
		   System.out.println("BeforeSuite");
		   
	       }
	@BeforeTest
	 public void logIn()
	 {
		   System.out.println("BeforeRest");
		   
	       }
	 @BeforeClass
	 public void launchBrowser()
	 {
		   System.out.println("BeforeClass");
		   
	       }
	 
	 @BeforeMethod
	 public void enterURL()
	 {
		   System.out.println("..BeforeMethod");
		   
	       }
	
	 @Test
	 public void testCase1()
	 {
		   System.out.println("...testCase1");
		   
	       }
	 
	 @Test
	 public void testCase2()
	 {
		   System.out.println("...testCase2");
		   
	       }
	 @Test
	 public void testCase3()
	 {
		   System.out.println("...testCase3");
		   
	       }
	 
	 @AfterMethod
	 public void logOut()
	 {
		   System.out.println("..afterMethod");
		   
	       }
	 
	 @AfterClass
	 public void closeBrowser()
	 {
		   System.out.println("afterClass");
		   
	       }
	 @AfterTest
	 public void deleteCookies()
	 {
		   System.out.println("afterTest");
		   
	       }
	 @AfterSuite
	 public void closeBaseSetups()
	 {
		   System.out.println("afterSuite");
		   
	       }
	 
}
