package drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	private static WebDriver driverWeb;

	public static Driver chrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		   options.addArguments("--incognito");
		    options.addArguments("--disable-local-storage");
		driverWeb = new ChromeDriver(options);
		driverWeb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return new Driver();
	}
	
	public  WebDriver pagina() {
		driverWeb.get("https://www.utest.com/");
		return driverWeb;
	}
	
	public static Driver getDriver() {
		return new Driver();
	}
	
	 
}
