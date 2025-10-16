package testingBaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseLibrary {

	@Test
	public void launchUrl()
	{
		WebDriver driver = new ChromeDriver();	
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
	}
}
