package FreshTestNg;

import org.openqa.selenium.By;
//import org.registrationpage.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg extends BaseClass {

	@BeforeClass
	private void BeforeTest() {
		System.out.println("BeforeClass");
		browserLaunch("Chrome");
		implicitWait(10);
	}
	
//	priority concept and invocation count with login page code 
	@Parameters({"username","password"})
	@Test(priority=1,invocationCount=5)
	private void test1(String user, String pass) {
		System.out.println("test1");
		urlLaunch("https://www.facebook.com/");
//		LoginPage l=new LoginPage();
//		sendKeys(l.email().get(0), user);
//		sendKeys(l.password(), pass);
//		click(l.login());
	}

//	enable concept and registration page code
	@Test //(enabled=false)
	private void test2() {
		System.out.println("test2");
		urlLaunch("https://www.facebook.com/");
//		RegistrationPage r=new RegistrationPage();
//		click(r.getBtnCreate());
//		sendKeys(r.getTxtFname(), "Venitha");
//		sendKeys(r.getTxtlLname(), "Kotteswaran");
//		sendKeys(r.getTxtph(), "987654321");
//		click(r.getBtnSignup());
	}
	
//	negative priority concept and Soft Assert concept
	@Test(priority=-1)
	private void test3() throws InterruptedException {
		System.out.println("test3");
		SoftAssert s = new SoftAssert(); 
        driver.manage().window().maximize(); 
        driver.get("https://www.geeksforgeeks.org/"); 
        String actualResult=driver.getTitle(); 
      
        String expectedResult="GeeksforGeeks "; 
          
        s.assertEquals(actualResult,expectedResult,"Title is not Matching"); 
        Thread.sleep(2000); 
        driver.findElement(By.linkText("Java")).click(); 
        Thread.sleep(2000); 
        s.assertAll(); 
//        driver.close(); 
	}

	@Test
	private void test4() {
		System.out.println("test4");
	}
	
	@Test
	private void test5() {
		System.out.println("test5");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("afterClass");
//		quit();
	}

	@BeforeMethod
	private void beforeMetho() {
		System.out.println("BeforeMethod");
		timeDuration();
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("afterMethod");
		timeDuration();
	}
}
