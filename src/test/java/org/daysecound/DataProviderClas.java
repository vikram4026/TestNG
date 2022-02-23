package org.daysecound;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclasses.BaseClass;
import com.baseclasses.PojoClass;

public class DataProviderClas extends BaseClass {
	@BeforeClass
	private void beforeLaunch() {
		launchBrowse();
	}

	@AfterClass
	private void afterLaunch() {
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

	@Test(dataProvider = "input")
	private void tc1(String user, String pass) {
		PojoClass p = new PojoClass();
		toInput(p.getTxtUser(), user);
		toInput(p.getTxtPass(), pass);
		clickBtn(p.getLgn());

	}

	@DataProvider(name = "input")
	private String[][] data() throws IOException  {
		return new String[][] {
			
			{excelRead(0,0),excelRead(0, 1)} ,{excelRead(0, 2),excelRead(0, 3)}};
	}
	
}

