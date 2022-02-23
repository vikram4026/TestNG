package com.dayfourth;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclasses.BaseClass;
import com.baseclasses.PojoClass;

public class SoftAssertClass extends BaseClass {

	@BeforeClass
	private void beforeLaunch() {

		launchBrowse();
	}

	@AfterClass
	private void afterlaunch() {
		driver.quit();

	}

	@BeforeMethod
	private void startTime() {
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

		SoftAssert s = new SoftAssert();

		String currentUrl = driver.getCurrentUrl();
		s.assertTrue(currentUrl.contains("djhwkj"), "to check the url login page ");

		PojoClass p = new PojoClass();
		toInput(p.getTxtUser(), "khaijk");
		s.assertNotEquals("grkjbf", "bhblrjhb", "to check the username");

		toInput(p.getTxtPass(), "shjkbl");
		s.assertEquals("fkhqwbkjq", "bvjhBHb", "to check the password");

		clickBtn(p.getLgn());

		String currentUrl2 = driver.getCurrentUrl();
		s.assertTrue(currentUrl2.contains("fbwe"), "to check the error page");

		System.out.println("done");

		//assertAll used to verify the softAssertclass
		
		s.assertAll();
	}

}
