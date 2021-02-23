package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop = new Properties();

	public void init_properties() {
		try {
			FileInputStream fis = new FileInputStream(".src/main/java/com/config/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
