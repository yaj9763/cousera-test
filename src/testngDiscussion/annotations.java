package testngDiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	// pre-conditions annotation - Starting with Before
		@BeforeSuite
		void setUp() {
			System.out.println("Setup System Property for chrome");
		}
		
		@BeforeTest
		public void launchBrowser() {
			System.out.println("Launch Chrome Browser");
		}
		
		@BeforeClass
		public void login() {
			System.out.println("Login to app");
		}
		
		
		@BeforeMethod
		public void enterUrl() {
			System.out.println("Enter Url");
		}
		
		// Test Case- starting @Test
		@Test
		public void googleTilte() {
			System.out.println("Google title Test");
		}
		@Test
		public void googleTilte1() {
			System.out.println("Google title1	 Test");
		}

		
		
		//Post-conditions -- Starting with @After
		@AfterMethod
		public void logOut() {
			System.out.println("logout from app");
		}
		
		@AfterClass
		public void deletecookies() {
			System.out.println("Delete All cookies");
		}
		
		@AfterTest
		public void closeBrowser() {
			System.out.println("Close The Chrome Browser");
		}
		
		@AfterSuite
		public void genrateReport() {
			System.out.println("Generate Test Report");
		}
	}

