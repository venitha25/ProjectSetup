package org.reruntest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	private void B1() {
		System.out.println("B1");
	}
	
	@Test(retryAnalyzer=WithKnownFail.class)
	private void B2() {
		System.out.println("B2");
		Assert.assertTrue(false);
	}
	
	@Test
	private void B3() {
		System.out.println("B3");
	}
}
