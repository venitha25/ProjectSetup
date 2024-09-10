package FreshTestNg;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
import java.sql.Date;
//import java.text.SimpleDateFormat;

//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	// Browser Launch
	public static void browserLaunch(String browserName) {
		// get the driver setup and type and the browser
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	// Url launch and window maximize
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	// Time Duration
	public static void implicitWait(long sec) {
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void timeDuration() {
		Date d = new Date(1);
		System.out.println(d);
	}
	// sendKeys
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	// getText method
	public static void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}

	// get Current url
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	// move to element
	public static void moveToElement(WebElement e) {
		Actions act = new Actions(driver);
		act.moveToElement(e).build().perform();
	}

	// Drag and Drop
	public static void DragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).build().perform();
	}

	// Select and Deselect
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		((Select) e).selectByIndex(index);
		System.out.println(s);
	}

	public static void deselectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		((Select) e).deselectByIndex(index);
		System.out.println(s);
	}

	public static void scrollElementIntoView(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	// getAttribute
	public static void getAttribute(WebElement e) {

	}

//	// Excel Read
//	public static String excel(String name, String sheet, int row, int cell) throws IOException {
//		File f = new File(
//				"C:\\Users\\vinitha\\eclipse-workspace\\maven\\MavenPractice\\src\\test\\resources" + name + ".xlsx");
//		FileInputStream fi = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fi); // (Workbook is interface so cannot create object, so we used updacasting
//											// concept with child class)
//
//		// getSheet
//		Sheet s = w.getSheet(sheet);
//
//		// getRow
//		Row r = s.getRow(row);
//
//		// getCell
//		Cell c = r.getCell(cell);
//		int type = c.getCellType();
//
//		// to convert Date and numbers(double) to string
//		String value;
//		if (type == 1) { // String
//			value = c.getStringCellValue();
//		} else if (DateUtil.isCellDateFormatted(c)) {
//			Date d = c.getDateCellValue();
//			SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
//			value = sd.format(d);
//		} else {
//			double nc = c.getNumericCellValue();
//			long lg = (long) nc;
//			value = String.valueOf(lg);
//		}
//		return value;
//	}

	public static void quit() {
		driver.quit();
	}
}
