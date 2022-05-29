package testmyntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import myntra.loginpage;

public class TestingLogin {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
	
		
		loginpage login = new loginpage(driver);
		login.clickonprofilebutton();
		login.clickonloginbutton();
		login.entermobileno();
		login.clickoncontinuebutton();
		
	}
}
