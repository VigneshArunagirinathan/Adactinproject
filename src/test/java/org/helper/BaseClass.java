package org.helper;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author vignesh
 *
 */

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\MavenProj\\drivers 1\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	/**
	 * 
	 * @param url
	 */

	public static void launch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	/**
	 * @modified Revanth
	 * @modifiedDate 29-12-2019
	 * @param data
	 * @return
	 */

	public String getConfig(String data) {
		String value = null;

		try {
			Properties p = new Properties();
			p.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Configuration\\config.properties"));
			value = (String) p.get(data);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return value;

	}

	public void pageLoad() {
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

	}

	/**
	 * 
	 * @param element
	 * @param st
	 */

	public static void dropDown(WebElement element, String st) {
		Select s = new Select(element);
		s.selectByVisibleText(st);
	}

	public static void write(WebElement loc, String text) throws Throwable {
		loc.sendKeys(text);

	}

	/**
	 * 
	 * @param loc
	 */

	public static void button(WebElement loc) {
		loc.click();
	}

	public static String getAttr(WebElement loc) {
		return loc.getAttribute("value");
	}

	public void quit() {
		driver.quit();
	}

	/**
	 * 
	 * @param loc
	 */

	public static void java(WebElement loc) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object x = js.executeScript("returnarguments[0].getAttribute('value')", loc);
		String sr = (String) x;
		System.out.println(sr);
	}

	public static void robot() {
		Actions acc = new Actions(driver);
		acc.doubleClick().perform();

	}
}
