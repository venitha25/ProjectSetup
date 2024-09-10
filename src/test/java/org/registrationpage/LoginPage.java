package org.registrationpage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) {

		// browser launch
		WebDriver driver = new ChromeDriver();

		// url launch
		driver.get("https://www.facebook.com/");

		// locators

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("VenithaKothandan");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456789");

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys("Kotteswaran");

		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys("987654321");

		WebElement login1 = driver.findElement(By.name("login"));
		login1.click();
		
		// driver.quit();
	}
}
