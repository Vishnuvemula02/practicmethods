package primus_bank;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class using_property {

	WebDriver driver ;
	Properties conpro;
	@BeforeMethod
	public void setup() throws Throwable
	{
		conpro = new Properties();
		//load property file 
		conpro.load(new FileInputStream("primusbank.properties"));
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys(conpro.getProperty("Enteruser"));
		driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(conpro.getProperty("Enterpass"));	
	}
@Test
 public void branchcreation()
 {
	
	driver.findElement(By.xpath(conpro.getProperty(""))).sendKeys(conpro.getProperty(""));
	driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys(conpro.getProperty("Enteruser"));
	
	
	
	
 }

	
	
	
	
	
	
}
