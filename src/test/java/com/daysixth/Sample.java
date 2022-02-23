package com.daysixth;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Sample {

	@Test
	private void tc1() {
		System.out.println("test 1");
	}

	@Test
	private void tc2() {
		System.out.println("test 2");
	}

	@Test
	private void tc3() {
		Assert.assertTrue(false);
		
		System.out.println("test 3");
	}

	@Test
	private void tc4() {
		Assert.assertTrue(false);
		System.out.println("test 4");
	}

	@Test
	private void tc5() {
		System.out.println("test 5");
	}

}
