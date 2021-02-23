package com.qa.threadlocal;

import org.openqa.selenium.WebDriver;

public final class ThreadLocalDriverTest {

	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

	public  static void setdriver(WebDriver driver) {
		dr.set(driver);
	}

	public static WebDriver getdriver() {
		return dr.get();
	}

	public static void unload() {
		dr.remove();
	}

}
