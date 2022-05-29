package myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")
	private WebElement profilebutton;
	
	@FindBy(xpath="//a[text()='login / Signup']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement mobileno;
	
	@FindBy(xpath="//div[text()='CONTINUE']")
	private WebElement continuebutton;
	
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	

	public void clickonprofilebutton()
	{
		profilebutton.click();	
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();	
	}
	public void entermobileno()
	{
		mobileno.sendKeys("7264964385");	
	}
	
	public void clickoncontinuebutton()
	{
		continuebutton.click();	
	}
}
