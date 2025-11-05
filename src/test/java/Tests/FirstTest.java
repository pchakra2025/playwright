package Tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

@Test
public class FirstTest {

//	public static void main(String[] args) {
////	 Playwright playwright = Playwright.create();
////	 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
////	 Page page = browser.newPage();
////	 page.navigate("https://amdocs.com");
////	 System.out.println("Hello.. I am " + page.title());
////	 browser.close();
//		System.out.println("i am running and printing");
//	}
	
	public void verifyTitle() {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
		  Page page = browser.newPage();
		  page.navigate("https://amdocs.com");
		  System.out.println("Hello.. I am " + page.title());
		  browser.close();
		 	}
	
		
}
