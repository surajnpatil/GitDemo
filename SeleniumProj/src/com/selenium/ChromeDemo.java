package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/v1/");
		String s=d.getTitle();
		System.out.println(s);
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");	
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		d.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		Thread.sleep(5000);
		d.findElement(By.linkText("About")).click();
		d.navigate().back();
		d.findElement(By.linkText("Logout")).click();
		
		
//		WebDriver d2=new ChromeDriver();
//		d2.manage().window().maximize();
//		d2.get("https://www.facebook.com/");
		//Thread.sleep(5000);
//		String s=d.getTitle();
//		String s2=d.getCurrentUrl();
//		System.out.println(s);
		
//		System.out.println(s2);
//		if(s.equals("Google"))
//		{
//			System.out.println("True");
//		}
//		else
//			System.out.println("false");
		
//		
//		String s3=d.getPageSource();
//		System.out.println(s3);
//		
		
		
//		d2.manage().window().minimize();
//		d.close();
//		d2.close();
	
	}

}
