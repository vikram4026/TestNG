package com.dayfourth;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.baseclasses.BaseClass;
import com.baseclasses.PojoClass;

public class HardAssertClasss extends BaseClass {

	@BeforeClass
	private void beforeLaunch() {
		launchBrowse();
		maxWindow();
	}

	@AfterClass
	private void afterLaunch() {
		driver.quit();

	}

	@BeforeMethod
	private void startTime() {
		toPassUrl("https://www.facebook.com/");
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@Test
	private void tc1() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("facebook"), "to chck the url of the login webpage");
        PojoClass p = new PojoClass();
        
        toInput(p.getTxtUser(), "java");
        Assert.assertEquals("java", "java", "check the username");
	
        toInput(p.getTxtPass(), "java@123");
        Assert.assertEquals("java@123", "java@123", "to check the password");
        
        clickBtn(p.getLgn());
        String currentUrl2 = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl2.contains("privacy_mutation_token"), "to check the error login page");
	
	
	}
	
	
	
	

}
