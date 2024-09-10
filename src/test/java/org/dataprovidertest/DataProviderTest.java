package org.dataprovidertest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import FreshTestNg.BaseClass;

public class DataProviderTest extends BaseClass {

	@Test
	@DataProvider(name = "tester")
	public void test1() {
		System.out.println("test1");
	}

	@Test
	private void test2() {
		System.out.println("test2");
	}
}
