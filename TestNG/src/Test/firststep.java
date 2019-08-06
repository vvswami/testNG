package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firststep {

	public String baseurl = "https://www.buildeeji.com/Professional/Postprofessional";

	public WebDriver driver;

	@BeforeTest

	public void launchBrowser()

	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		System.out.println("Enter before Test");
	}

	
	/*@BeforeMethod
	public void verifyhomepageTitle()
	{
		
		Assert.assertEquals("Buildeeji.com", "Buildeeji.com");
		System.out.println("BeforeMethod");
	}
	*/
	
	@Test(priority=1)
	public void login() throws Exception
	{

		//driver.get(baseurl);
		// driver.get("https://www.buildeeji.com/Professional/Postprofessional");

		Thread.sleep(1000);

		// Login with E-Mail Id & Password

		driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).click();
		Thread.sleep(1000);

		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("7989353166");

		// pass word
		driver.findElement(By.id("txtloginpassword")).sendKeys("123456");
		Thread.sleep(1000);

		// submit
		driver.findElement(By.id("btnloginsubmitt")).submit();
		System.out.println("Test p=1");
	}
	

	@Test(priority=2)
	public void postaprof()
	{

		driver.findElement(By.xpath(".//*[@id='proname']")).sendKeys("swami");
		System.out.println("Test p=2");
	}

	@Test(priority=3)

	public void submit()
	{

		driver.findElement(By.xpath(".//*[@id='subid']")).click();
		System.out.println("Test p=3");
	}
	
	
/*	@AfterMethod
	
	public void home()
	{

		driver.findElement(By.xpath("html/body/div[3]/nav/div/div[1]/a/img")).click();
		System.out.println("AfterMethod");

	}*/
	
	

	@AfterTest()
	public void close() {

	//	System.out.println("Enter after text method");
		System.out.println("AfterTest");
		driver.close();
	}

}
