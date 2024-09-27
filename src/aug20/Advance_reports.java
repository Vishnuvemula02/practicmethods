package aug20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.ActualMain;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_reports {
	//globle variables
	ExtentReports reports;
	ExtentTest logger;
	WebDriver driver;

	@BeforeTest
	public void generatereports()
	{
		//define path of Html
		reports = new ExtentReports("./ExtenReports/DEMO.html");
	}
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/google.com");
	}
	@Test
	public void firsttestcase() {
		logger = reports.startTest("Pass Test");
		logger.assignAuthor("vishnu vardhan");
		String Expected = "Google";
		String Actaul = driver.getTitle();
		if (Actaul .equalsIgnoreCase(Expected)) 
		{

			logger.log(LogStatus.PASS, "Title is Matching::::"+Expected+"----------------"+Actaul);

		}else {
			logger.log(LogStatus.FAIL, "Title is  Not Matching::::"+Expected+"----------------"+Actaul);
		}

	}

	@Test
	public void secondTestcase() {
		logger =reports.startTest("Fail Test");
		String Expected = "Gmail";
		String Actual = driver.getTitle();
		if(Actual.equalsIgnoreCase(Expected)) {
			logger.log(LogStatus.PASS, "Title is Matching::::"+Expected+"----------------"+Actual);

		}else {
			logger.log(LogStatus.FAIL, "Title is  Not Matching::::"+Expected+"----------------"+Actual);


		}

	}
	@AfterMethod
	public void tearDown() {
		reports.endTest(logger);
		reports.flush();
		driver.quit();
	}
}



