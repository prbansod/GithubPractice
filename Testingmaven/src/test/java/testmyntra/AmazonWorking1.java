package testmyntra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon.AmazonHeaders;
import amazon.AmzonLoginPOMclass;
import browserSetting.Base;
import untils.utility;

public class AmazonWorking1 {public class AmazonHeadersTestClass extends Base{
	
	WebDriver driver;
	AmazonHeaders amazonHeaders;
	AmzonLoginPOMclass amzonLoginPOMclass;
	int testCaseID;
	
	
	
	@BeforeClass
	public void LounchBrouser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
		driver= new ChromeDriver();
		Thread.sleep(2000);
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	
	}
	@BeforeMethod
	public void loginUserAmazon()
	{
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	amzonLoginPOMclass = new AmzonLoginPOMclass(driver);
	amzonLoginPOMclass.loginuser();
	amazonHeaders = new AmazonHeaders(driver);
	

	}

	
	@Test
	public void ClickOnFresh()
	{
		testCaseID=2201;
		amazonHeaders.ClickOnFresh();
		
		String url= driver.getCurrentUrl();
		String Title= driver.getTitle();
		
	Assert.assertEquals(url,"https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh" );
	  Assert.assertEquals(Title, "Amazon.in: Amazon Fresh");
	 
	    
	    if(url.equals("https://www.amazon.in/alm/storefront?almBrandId=ctnow&ref_=nav_cs_fresh")&&(Title.equals("Amazon.in: Amazon Fresh")))
	    
	    {
	    	System.out.println("Test is Pass");
	    	
	    }
	    else
	    {
	    	System.out.println("Test is fail");
	   
	    }
	}
	    
	    @Test
		public void ClickOnGiftCart()
		{
			amazonHeaders.ClickOnGiftCart();
			
			String url= driver.getCurrentUrl();
			String Title= driver.getTitle();
			
			Assert.assertEquals(url,"https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc" );
		    Assert.assertEquals(Title, "Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in");
		    
		    if(url.equals("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc")&&(Title.equals("Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in")))
		    
		    {
		    	System.out.println("Test is Pass");
		    	
		    }
		    else
		    {
		    	System.out.println("Test is fail");
		    }
		}
		    
		    @Test
		    public void ClickOnBuyAgain()
			{
				amazonHeaders.ClickOnBuyAgain();
				
				String url= driver.getCurrentUrl();
				String Title= driver.getTitle();
				
				Assert.assertEquals(url,"https://www.amazon.in/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again" );
			    Assert.assertEquals(Title, "Buy Again");
			    
			    if(url.equals("https://www.amazon.in/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again")&&(Title.equals("Buy Again")))
			    
			    {
			    	System.out.println("Test is Pass");
			    	
			    }
			    else
			    {
			    	System.out.println("Test is fail");
			    }
			    
	   
	}
	
	@AfterMethod
	
	
	public void logoutFromApplicationTestFail(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		     utility.captureScreenshot(testCaseID, driver);
		}
	

    }
	public void logoutFromApplication()
	{ 
ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
String Childbrowseradd=addr.get(0);
	driver.switchTo().window(Childbrowseradd);  
	
		Actions act = new Actions(driver);
		WebElement Actionlist= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
			act.moveToElement(Actionlist).perform();
			WebElement SignOut= driver.findElement(By.xpath("//span[text()='Sign Out']"));
		act.moveToElement(SignOut).click().build().perform();
		
		
	}	

	
		

	@AfterClass
	public void clearPOMobjects()
	{
		driver.close();
	}
	
	
	
	
}

}
