package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeBrowserDemo {

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
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
			
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
