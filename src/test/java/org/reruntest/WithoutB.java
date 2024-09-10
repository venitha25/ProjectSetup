package org.reruntest;

import org.testng.annotations.Test;

public class WithoutB {

	@Test
	private void B1() {
		System.out.println("B1");
	}

	@Test()
	private void B2() {
		System.out.println("B2");
	}

	@Test
	private void B3() {
		System.out.println("B3");
	}

}
