package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzonLoginPOMclass {
	
	
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Conti ;

	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password ;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SignIn;
	
	
	public AmzonLoginPOMclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void loginuser()
	{
		Email.sendKeys("7264964385");
		Conti.click();
		Password.sendKeys("Sumedh@19");
		SignIn.click();
	}
	

	
}




