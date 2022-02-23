package com.dayfiveth;

import org.testng.annotations.Test;

public class B {
	@Test(groups="regression")
	private void tc11() {
		System.out.println("test 11");
	}
	@Test(groups= {"smoke","regression"})
	private void tc22() {
		System.out.println("test 22");
	}
	@Test(groups="sanity")
	private void tc33() { 
		System.out.println("test 33");
	}
	@Test(groups="smoke")
	private void tc44() {
		System.out.println("test 44");
	}
	@Test(groups= {"smoke","sanity"})
	private void tc55() {
		System.out.println("test 55");
	}

}
