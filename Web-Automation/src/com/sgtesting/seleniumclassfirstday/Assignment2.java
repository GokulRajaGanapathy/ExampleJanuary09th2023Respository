package com.sgtesting.seleniumclassfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	public static WebDriver o=null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigateURL();
		login();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeApp();
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
			o.findElement(By.id("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try
		{
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			o.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")).click();
			Thread.sleep(3000);
			o.findElement(By.name("firstName")).sendKeys("Gokul");
			o.findElement(By.name("lastName")).sendKeys("Raja");
			o.findElement(By.name("email")).sendKeys("demo@gmail.com");
			o.findElement(By.name("username")).sendKeys("Gokul");
			o.findElement(By.name("password")).sendKeys("GokulRaja");
			o.findElement(By.name("passwordCopy")).sendKeys("GokulRaja");
			o.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser()
	{
		try
		{
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(5000);
			o.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("GokulGRG");
			o.findElement(By.name("email")).clear();
			Thread.sleep(2000);
			o.findElement(By.name("email")).sendKeys("gokul@gmail.com");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try
		{
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(5000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			o.switchTo().alert().accept();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void closeApp()
	{
		try
		{
			o.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}
}
