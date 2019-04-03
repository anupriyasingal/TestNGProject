import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch 
{
	WebDriver driver;
	@Test
	public void launchBrowser()
	{
		String driverPath= System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}
	@Test
	public void launchFB()
	{
		driver.get("https://www.facebook.com/");
	}
}
