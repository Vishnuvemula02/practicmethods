package pratic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromedriver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.navigate().to("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	//	driver.close();
	/*	
		WebDriver driver2 = new FirefoxDriver();
        driver2.manage().deleteAllCookies();
		driver2.manage().window().maximize();
		driver2.get("http://facebook.com");
		driver2.close();
		
		WebDriver driver3 = new EdgeDriver();
		driver3.close();
		*/
	}

}
