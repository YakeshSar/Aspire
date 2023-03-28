package com.Objects;

import java.io.FileInputStream;
import java.util.Properties;

public class Util {

	public String getUrl() {
		String url = "";
		try {
			FileInputStream f1 = new FileInputStream("D:\\Java Testing\\Aspire\\config.properties");
			Properties prop = new Properties();
			prop.load(f1);
			url = prop.getProperty("url");
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
		return url;
	}
	
	public String getDriver() {
		String driver = "";
		try {
			FileInputStream f1 = new FileInputStream("D:\\Java Testing\\Aspire\\config.properties");
			Properties prop = new Properties();
			prop.load(f1);
			driver = prop.getProperty("driver");
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
		return driver;
	}
}
