package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium\\geckodriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");

	}

}
