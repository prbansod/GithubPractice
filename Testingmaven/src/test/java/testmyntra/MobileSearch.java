package testmyntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileSearch {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement Searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement SearchButton ;

	
	@FindBy(xpath="(//div[@class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row']//span)[60]")
	private WebElement MOBILE1 ;
	
	@FindBy(xpath="//div[@id='dp']//span//input)[6]")
	private WebElement  Addcart ;
	
	
	
	public MobileSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void  MobileSeachMethod()
	{
		Searchbox.click();
		Searchbox.sendKeys("Mobile");
		SearchButton.click();
		MOBILE1.click();
		Addcart.click();
	}

}
