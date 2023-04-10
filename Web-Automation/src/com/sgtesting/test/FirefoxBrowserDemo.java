package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	
	 public static WebDriver oBrowser =null;
	 
	public static void main(String[] args) {
		launchbrowser();
		navigateURl();
		closeapp();
	}
	private static void launchbrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURl()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapp()
	{
		try
		{
			oBrowser.close();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
