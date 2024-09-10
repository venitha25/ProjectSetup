package org.reruntest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	private void A1() {
		System.out.println("A1");
	}
	
	@Test(retryAnalyzer=WithKnownFail.class)
	private void A2() {
		System.out.println("A2");
		Assert.assertTrue(false);
	}
	
	@Test
	private void A3() {
		System.out.println("A3");
	}
}
