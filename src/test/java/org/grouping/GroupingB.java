package org.grouping;

import org.testng.annotations.Test;

public class GroupingB {

	@Test(groups = { "smoke", "regression" })
	public void B1() {
		System.out.println("B1");
	}

	@Test(groups = { "functional", "smoke" })
	private void B2() {
		System.out.println("B2");
	}

	@Test(groups = { "regression", "integration" })
	private void B3() {
		System.out.println("B3");
	}

}