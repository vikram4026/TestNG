package com.dayseventh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	@Test(retryAnalyzer=Failed.class)
	private void tc7() {
		Assert.assertTrue(false);
		System.out.println("Test 1");
	}
	@Test
	private void tc5() {
		System.out.println("Test 1");

	}
	@Test(retryAnalyzer=Failed.class)
	private void tc() {
		Assert.assertTrue(false);
		System.out.println("Test 1");

	}
	@Test
	private void tc4() {
		System.out.println("Test 1");

	}
	@Test
	private void tc3() {
		System.out.println("Test 1");

	}
	@Test
	private void tc2() {
		System.out.println("Test 1");

	}
	

}
