/**
 * 
 */
/**
 * @author venkataswami
 *
 */
package  final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class small{
public static void main(String[]args)
{
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.goog");
	driver.findElement(By.id("dsfdf")).click();
	
	System.out.println("pass");
	
	
}}