package org.registrationpage;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Create account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		// inputs
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("kotte");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Kothandan");

		WebElement mobileno = driver.findElement(By.name("re" + "g_email__"));
		mobileno.sendKeys("9876543210");

		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("1234554321");

		// Single select Dropdown:
		// Day
		WebElement d = driver.findElement(By.id("day"));
		Select s1 = new Select(d);
		s1.selectByIndex(12);
		// Month
		WebElement m = driver.findElement(By.id("month"));
		Select s2 = new Select(m);
		s2.selectByValue("9");
		// Year
		WebElement y = driver.findElement(By.id("year"));
		Select s3 = new Select(y);
		s3.selectByVisibleText("2023");

		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();

//		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		signup.click();

		// ------------------------------isMultiple--------------------------------------

		boolean multiple = s1.isMultiple();
		System.out.println("isMultiple " + multiple);

		// ------------------------------get List--------------------------------------

		List<WebElement> option = s1.getOptions();
		WebElement w = option.get(5);
		System.out.println(w.getText());

		// for loop
		for (int i = 0; i < option.size(); i++) {
			WebElement w1 = option.get(i);
			System.out.println(w1.getText());
		}

		// Enhanced for
		for (WebElement x : option) {
			System.out.println(x.getText());
		}

		List<WebElement> option2 = s2.getOptions();
		for (int i = 0; i < option2.size(); i++) {
			WebElement w2 = option2.get(i);
			System.out.println(w2.getText());
		}

		List<WebElement> option3 = s3.getOptions();
		for (int i = 0; i < option3.size(); i++) {
			WebElement w3 = option3.get(i);
			System.out.println(w3.getText());
		}
	}
}

