package org.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A {
	@Parameters({"username","password"})
	@Test
	private void A1(String user,String pass) {
		System.out.println("A1");
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Parameters({"userName","Password"})
	@Test
	private void A2(String user1,String pass1) {
		System.out.println("A2");
		System.out.println(user1);
		System.out.println(pass1);
	}
	
	@Test
	private void A3() {
		System.out.println("A3");
	}
}
