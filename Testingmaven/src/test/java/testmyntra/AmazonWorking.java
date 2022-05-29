package testmyntra;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonWorking {
	
	WebDriver driver;
	
	@BeforeClass
	public void amazonlounch() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	Thread.sleep(2000);
	}
	
	
	
	@BeforeMethod
	public void amazonLogin()
	{
		  WebElement Email= driver.findElement(By.xpath("//input[@name='email']"));
		  Email.sendKeys("7264964385");
		    
		  WebElement Conti= driver.findElement(By.xpath("//input[@id='continue']"));
		  Conti.click();
			

          WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
	      Password.sendKeys("Sumedh@19");
			 
	      WebElement SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		  SignIn.click();
	}

	
	@Test(priority=1)
	public void MobileSearch() throws InterruptedException
	
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	 WebElement Searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 Searchbox.click();
		 Searchbox.sendKeys("Mobile");
		 
		 WebElement SearchButton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 SearchButton.click();
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,500)");
	     
	     
	     WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']//span)")));
		
		 WebElement MOBILE1= driver.findElement(By.xpath("(//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']//span)[60]"));
		 MOBILE1.click();
		 
		 //ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		 //String Childbrowseradd=addr.get(1);
		 //driver.switchTo().window(Childbrowseradd);
		 
		//JavascriptExecutor js2 = (JavascriptExecutor)driver;
	     //js2.executeScript("window.scrollBy(0,1000)");
		 
		 //WebElement Addcart= driver.findElement(By.xpath("(//div[@id='dp']//span//input)[6]"));
		 //Addcart.click();
	}
	
	@Test(priority=2)
	public void HeadPhoneSearch() throws InterruptedException
	{
		 WebElement Searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 Searchbox.click();
		 Searchbox.sendKeys("Headphones");
		 
		 
		 WebElement SearchButton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 SearchButton.click();
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,500)");
		
		 WebElement Headphone1= driver.findElement(By.xpath("(//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']//a//span)[57]"));
          Headphone1.click();
		 
		 ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		 String Childbrowseradd=addr.get(1);
		 driver.switchTo().window(Childbrowseradd);
		 
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
	     js2.executeScript("window.scrollBy(0,1000)");
		 
		// WebElement Addcart= driver.findElement(By.xpath("(//div[@id='ppd']//span//input)[1]"));
		 //Addcart.click();

	}

	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	@AfterClass
	public void quite()
	{
		driver.quit();
	}
}


