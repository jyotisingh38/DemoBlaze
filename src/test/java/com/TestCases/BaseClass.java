package com.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.Pages.*;

public class BaseClass 
{

	public WebDriver driver;
	public HomePage hp;
	public IndexPage ip;
	public String un="jyotiTest"+System.currentTimeMillis();
	public CartPage cp;



	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		hp=new HomePage(driver);
		ip=new IndexPage(driver);
		cp=new CartPage(driver);
	}


}