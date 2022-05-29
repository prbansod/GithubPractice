package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHeaders {

	
	@FindBy(xpath="//a[@href='/fresh?ref_=nav_cs_fresh']")
	private WebElement Fresh;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_1']")
	private WebElement GiftCart;

	
	@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_buy_again']")
	private WebElement BuyAgain ;
	
	//@FindBy(xpath="//span[@class='nav-line-2 ']")
	//private WebElement AccandList;
	
	
	//@FindBy(xpath="//span[text()='Sign Out']")
	//private WebElement SignOut;
	
	public AmazonHeaders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnFresh()
	{
		Fresh.click();
		
	}
	public void ClickOnGiftCart()
	{
		GiftCart.click();
		
	}
	public void ClickOnBuyAgain()
	{
		BuyAgain.click();
	}
	
	
	
	

	

}
