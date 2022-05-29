package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	
	public static WebDriver OpenChromeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver OpenOperaBrowser()
	{
		
		System.setProperty("webdriver.opera.driver", "F:\\Automation\\operadriver_win64\\operadriver.exe");
		
		WebDriver driver= new OperaDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver OpenFirefoxBrowser()
	{
		
		System.setProperty("webdriver.grcko.driver", "F:\\Automation\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
