package testmyntra;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgKeyword {
	
	
	@BeforeClass
	public void alpha()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void beta()
	{
		System.out.println("Beforemethod");
	}

	
	@Test()
	public void alpha1()
	{
		System.out.println("alpha1");
	}
	
	@Test(timeOut = 3000)
	public void beta2() throws InterruptedException
	{
		System.out.println("beta2");
		Thread.sleep(5000);
		System.out.println("hiii");
	}
	
	@Test(enabled = false)
	public void gyamma2()
	{
		System.out.println("gyamma2");
		
	}
	
	
	
	@AfterMethod
	public void gyamma()
	{
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void delta()
	{
		System.out.println("AfterClass");
	}
}
