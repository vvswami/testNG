
package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Services extends test1  {
	
	
	
	@Test
	public void searchaservices()
	
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		System.out.println("Enter a services class");
		
		driver.get("https://www.buildeeji.com/Services/Hyderabad/house-keeping-and-cleaning-services/All-Sublocations");
		//driver.get("https://www.buildeeji.com");
		
		//driver.findElement(By.xpath(".//*[@id='proname']")).sendKeys("swami");
	
		//search a services page 
		//driver.get("https://www.buildeeji.com/Services/Hyderabad/house-keeping-and-cleaning-services/All-Sublocations");
		
		//Read more button click
		//driver.findElement(By.xpath(".//*[@id='menu1']/div[1]/div[4]/div[3]/div/div/div[2]/a/button")).click();
		System.out.println("Exit services loop");
		
		
	}
	

}