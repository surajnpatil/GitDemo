package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest2 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/v4/");
		
		d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(n);
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(s);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "suraj@123", "123" },
    //  new Object[] { 2, "b" },
    };
  }
}
