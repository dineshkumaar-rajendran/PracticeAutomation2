package com.qa.driverfactory;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.threadlocal.ThreadLocalDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {


	public static void init_driver(String BrowserName) {
		if (Objects.isNull(ThreadLocalDriverTest.getdriver()) && BrowserName.equals("chorome")) {
			WebDriverManager.chromedriver().setup();
			ThreadLocalDriverTest.setdriver(new ChromeDriver());
			ThreadLocalDriverTest.getdriver().manage().window().maximize();
			
			
			
		}
	}

	public static void close_Driver() {
		if (Objects.nonNull(ThreadLocalDriverTest.getdriver())) {
			ThreadLocalDriverTest.getdriver().close();
			ThreadLocalDriverTest.unload();
		}
	}
}
