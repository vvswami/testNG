package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
	public WebDriver driver;
	
@Test(groups="car")
public void login() throws Exception
	{
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		// driver.get("https://www.buildeeji.com/Services/Hyderabad/house-keeping-and-cleaning-services/All-Sublocations");
			driver.get("https://www.buildeeji.com/Professional/Postprofessional");

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
	}
	

@Test(groups="car")
public void postaprof()
{
	
	driver.findElement(By.xpath(".//*[@id='proname']")).sendKeys("swami");

}

@Test(groups="car")
public void submit()
{
	
	driver.findElement(By.xpath(".//*[@id='subid']")).click();

}

@Test
public void car()
{
	System.out.println("individual");
}
@Test
public void cars()
{
	
}




}
