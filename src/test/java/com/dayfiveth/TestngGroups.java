package com.dayfiveth;

import java.util.Date;


import org.testng.annotations.Test;

import com.baseclasses.BaseClass;

public class TestngGroups extends BaseClass {
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("test 1");
	}
	@Test(groups="sanity")
	private void tc2() {
		System.out.println("test 2");
	}
	@Test(groups= {"smoke","sanity"})
	private void tc3() { 
		System.out.println("test 3");
	}
	@Test(groups= {"smoke","regression"})
	private void tc4() {
		System.out.println("test 4");
	}
	@Test(groups="regression")
	private void tc5() {
		System.out.println("test 5");
	}

}
