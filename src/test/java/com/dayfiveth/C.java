package com.dayfiveth;

import org.testng.annotations.Test;

public class C {
	@Test(groups="sanity")
	private void tc111() {
		System.out.println("test 111");
	}
	@Test(groups= {"smoke","sanity"})
	private void tc222() {
		System.out.println("test 222");
	}
	@Test(groups="regression")
	private void tc333() { 
		System.out.println("test 333");
	}
	@Test(groups="smoke")
	private void tc444() {
		System.out.println("test 444");
	}
	@Test(groups= {"regression","sanity"})
	private void tc555() {
		System.out.println("test 555");
	}


}
