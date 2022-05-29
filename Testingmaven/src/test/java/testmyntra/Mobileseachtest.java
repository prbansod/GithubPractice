package testmyntra;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.AmzonLoginPOMclass;

public class Mobileseachtest {
	

	
	public static void main(String[] args) throws InterruptedException {

	
	
System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	Thread.sleep(2000);
	
	AmzonLoginPOMclass amzonLoginPOMclass = new AmzonLoginPOMclass(driver);
	 amzonLoginPOMclass.loginuser();
	
	MobileSearch mobileSearch = new MobileSearch(driver);
	mobileSearch.MobileSeachMethod();
	
	 
	 
	 
	
	}
}
