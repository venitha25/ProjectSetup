package org.reruntest;

import org.testng.annotations.Test;

public class AWithout {
	@Test
	private void A1() {
		System.out.println("A1");
	}

	@Test()
	private void A2() {
		System.out.println("A2");
	}

	@Test
	private void A3() {
		System.out.println("A3");
	}

}
