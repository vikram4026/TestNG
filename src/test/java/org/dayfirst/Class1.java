package org.dayfirst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	@Test(invocationCount=5)
	private void tc1() {
System.out.println("Test 1");
	}
	@Test(priority=-5)
	private void tc5() {
		System.out.println("Test 5");
	}
	@Test(priority=-3)
	private void tc4() {
		System.out.println("Test 4");
	}
	
	@Test(priority=2)
	private void tc8(){
		// asser.true used to manully failed the testcase
		Assert.assertFalse(true);
		System.out.println("Test 8");
	}
	//enabled use to ignore the test case
	@Test(enabled=false)
	private void tc7() {
		System.out.println("Test 7");
	}
	@Test(priority=3)
	private void tc6() {
		System.out.println("Test 6");
	}
	
	private void tc3() {
		System.out.println("Test 3");
	}
	@Test
	private void tc() {
		System.out.println("Test 3");
	}
}
