package org.grouping;

import org.testng.annotations.Test;

public class GroupingA {
	@Test(groups= {"smoke","regression"})
	public void A1() {
		System.out.println("A1");
	}

	@Test(groups= {"functional","smoke"})
	private void A2() {
		System.out.println("A2");
	}
	
	@Test(groups= {"regression","integration"})
	private void A3() {
		System.out.println("A3");
	}
}
