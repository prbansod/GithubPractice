package browserSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openChromeBrowser()
	{
     System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
     WebDriver driver= new ChromeDriver();
     return driver;
		
	}
	public static WebDriver openOperaBrowser()
	{
     System.setProperty("webdriver.opera.driver", "F:\\Automation\\operadriver_win64\\operadriver.exe");
		
     WebDriver driver= new OperaDriver();
     return driver;
		
	}
	
	


}
