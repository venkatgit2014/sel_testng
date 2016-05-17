package SeleniumWebDriver.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	WebDriver driver = null;
	
	public AppTest()
    {
        System.out.println("Constructor..");
    	
    }
	
@BeforeMethod

    public void beforeMethod()
    {
		System.out.println("Inside before method..");
	    driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
    }

@Test

public void testGoogle() {
	System.out.println("Inside test method..");
	
}

@AfterMethod

public void afterMethod()
    {
		System.out.println("Inside after method..");
		driver.quit();
	
    }
}
