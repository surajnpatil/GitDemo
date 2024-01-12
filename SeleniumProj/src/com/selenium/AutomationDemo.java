package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Suraj");
		d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Patil");
		d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Sadashiv peth ,pune");
		d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("suraj23@gmail.com");
		d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9657527735");
		d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
	
		
		

		
		Select city=new Select(d.findElement(By.id("Skills")));
		city.selectByIndex(4);
		Select yr=new Select(d.findElement(By.xpath("//select[@id='yearbox']")));
		yr.selectByValue("1995");
		Select mn=new Select(d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
		mn.selectByValue("May");
		Select day=new Select(d.findElement(By.xpath("//select[@id='daybox']")));
		day.selectByValue("15");
		
	}

}
