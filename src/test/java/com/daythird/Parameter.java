package com.daythird;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclasses.BaseClass;
import com.baseclasses.PojoClass;

public class Parameter extends BaseClass {

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

	@Parameters({ "username", "password" })
	@Test
	private void tc1(String user, String pass) {
		PojoClass p = new PojoClass();

		toInput(p.getTxtUser(), user);
		toInput(p.getTxtPass(), pass);
		clickBtn(p.getLgn());
	}

}
