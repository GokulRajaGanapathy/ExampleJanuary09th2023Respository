package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
	public static WebDriver o=null;
	public static Assignment1classonly o1=null;
	public static void main(String[] args) {

		launchbrowser();
		navigateURL();
		login();
		minimize();
		adduser();
		logout();
	}

	private static void launchbrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			o=new ChromeDriver(options);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigateURL()
	{
		try
		{
			o.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void login()
	{
		try
		{
			o1.getusername().sendKeys("admin");
			o1.getpassword().sendKeys("manager");
			o1.login1().click();
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void minimize()
	{
		o1.minimizewindow().click();	
	}

	private static void adduser()
	{
		try
		{
			Thread.sleep(2000);
			o1.clickusertab().click();
			Thread.sleep(3000);
			o1.addusericon().click();
			Thread.sleep(3000);
			o1.entername().sendKeys("GRG");
			o1.enterlastname().sendKeys("s");
			o1.entermail().sendKeys("gokulrajas2016@gmail.com");
			o1.enterusername().sendKeys("GRG1");
			o1.enterpassword().sendKeys("12345");
			o1.enterRePassword().sendKeys("12345");
			o1.entercreateuser().click();
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	private static void logout()
	{
		o1.clicklogout().click();
	}
}
