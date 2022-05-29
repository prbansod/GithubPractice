package testmyntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BARTI {

	
	
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://bartievalidity.maharashtra.gov.in/");
		Thread.sleep(2000);
		
		
		//WebElement home= driver.findElement(By.xpath("//a[@href='home_menu.php']"));
		//home.click();
		
		//String url= driver.getCurrentUrl();
		//String title = driver.getTitle();
	
		
		//if(url.equals("https://bartievalidity.maharashtra.gov.in/home_menu.php"));
		//{
			//System.out.println("pass");
		//}
		//else
		//{
			//System.out.println("fail");
			//}
		
		
		/*WebElement AwarenessandPublicityTab= driver.findElement(By.xpath("//a[@href='https://barti.in/awerness-publicity.php']"));
		AwarenessandPublicityTab.click();
		
		String url1= driver.getCurrentUrl();
		String title1 = driver.getTitle();
		
		
		WebElement SelectByDstrictSearch= driver.findElement(By.xpath("//select[@name='selectCategory']"));
		
		Select s= new  Select(SelectByDstrictSearch);
		s.selectByVisibleText("Beed");
		*/
		
	
		WebElement VeriFyCertificate= driver.findElement(By.xpath("//a[text()='verify Validity certificate']"));
		VeriFyCertificate.click();
		
		String url1= driver.getCurrentUrl();
		String title1 = driver.getTitle();
		
		
		
		
}
}
