package Generic_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constant
{
	public WebDriver driver;
@BeforeMethod
public void openapltn()
{
	System.setProperty("chrome_key","chrome_value");
	driver=new ChromeDriver();
	driver.get("baseURL");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterMethod
public void closeapplctn()
{
	driver.close();
}
}
