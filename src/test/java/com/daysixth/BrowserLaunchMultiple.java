package com.daysixth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchMultiple {
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc1(String browser) {

		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    }
		else if (browser.contains("gecko")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		
		        }
		else  {
		   //WebDriverManager.edgedriver().setup();
			WebDriverManager.iedriver().setup();
		//	driver = new EdgeDriver();
			driver = new InternetExplorerDriver();
		
		        }
		

		driver.get("https://www.facebook.com/");
	}

}
