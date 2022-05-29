package untils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
public static void captureScreenshot(int testCaseID,WebDriver driver) throws IOException
{
	Calendar cal= Calendar.getInstance();
	Date time= cal.getTime();
	String timestamp= time.toString().replace(":", " ");
	
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\selenium\\Screenshot"+timestamp+".jpeg");
	FileHandler.copy(source, dest);
}
}
