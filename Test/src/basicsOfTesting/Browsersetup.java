package basicsOfTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsersetup {

	WebDriver driver;
	
	public void browser(String browser, String url)
	{
	if(browser.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","/home/kaaspro-ld4/20Q/Test/Jar and Drivers/chromedriver");
	driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "/home/kaaspro-ld4/20Q/Test/Jar and Drivers/geckodriver");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		
		Browsersetup run=new Browsersetup();
		run.browser("firefox", "https://www.75health.com/");
				

	}

}
