package amazon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazonlogin {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(2000);
		
		
		//WebElement Actionlist= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		//Actionlist.click();	
		//Thread.sleep(2000);
		
		
		//WebElement SignIN= driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[2]"));
		//Actions act = new Actions(driver);
        //act.moveToElement(Actionlist).moveToElement(SignIN).click().build().perform();
        
        
        WebElement Email= driver.findElement(By.xpath("//input[@name='email']"));
	    Email.sendKeys("7264964385");
	    
	    WebElement Conti= driver.findElement(By.xpath("//input[@id='continue']"));
		Conti.click();
		

		 WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
		 Password.sendKeys("Sumedh@19");
		 
		 WebElement SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		 SignIn.click();
			
		 
		
		 
		 WebElement Searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 Searchbox.click();
		 Searchbox.sendKeys("Mobile");
		 
		 WebElement SearchButton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 SearchButton.click();
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,500)");
		
		 WebElement MOBILE1= driver.findElement(By.xpath("(//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']//span)[60]"));
		 MOBILE1.click();
		 
		 ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		 String Childbrowseradd=addr.get(1);
		 driver.switchTo().window(Childbrowseradd);
		 
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
	     js2.executeScript("window.scrollBy(0,1000)");
		 
		 WebElement Addcart= driver.findElement(By.xpath("(//div[@id='dp']//span//input)[6]"));
		 Addcart.click();
}
}