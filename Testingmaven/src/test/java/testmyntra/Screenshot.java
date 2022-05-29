package testmyntra;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		Calendar cal= Calendar.getInstance();
		Date time= cal.getTime();
		String timestamp= time.toString().replace(":", " ");
		
		System.out.println(time);
		System.out.println(timestamp);
		
		
System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
Thread.sleep(2000);
		
		
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\selenium\\Screenshot"+timestamp+".jpeg");
	FileHandler.copy(source, dest);
		
}

}
