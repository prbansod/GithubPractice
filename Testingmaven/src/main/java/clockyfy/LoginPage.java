package clockyfy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	@FindBy  (xpath= "//input[@name='username'] ")
	private WebElement UserName1;
	
	@FindBy  (xpath= "")
	private WebElement Password;
	
	@FindBy  (xpath= "")
	private WebElement loginButton;

}
