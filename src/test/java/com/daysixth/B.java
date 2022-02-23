package com.daysixth;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	private void tc11() {
		System.out.println("test 11");
	}

	@Test
	private void tc22() {
		System.out.println("test 22:");
	}

	@Test
	private void tc33() {
		Assert.assertTrue(false);

		System.out.println("test 33 ");

	}
}
