package com.sgtesting.seleniumclassfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4 {

	public static WebDriver o=null;
	
	public static void main(String[] args) {
		
		launchbrowser();
		navigateURL();
		login();
		createuser1();
		logout();
		loginuser1();
		createuser2();
		loginuser2();
		createuser3();
		loginuser3();
		loginuser2();
		modifypassword();
		logout();
		loginasuser3();
		logout();
		loginuser1();
		modifypassworduser2();
		logout();
		loginuasser2();
		logout();
		login();
		modifypassworduser1();
		logout();
		loginasuser1();
		logout();
		loginuasser2();
		Deleteuser3();
		logout();
		loginasuser1();
		Deleteuser2();
		logout();
		login();
		Deleteuser1();
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
	
	private static void createuser1()
	{
		try
		{
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			o.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			o.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")).click();
			Thread.sleep(4000);
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
	
	private static void logout()
	{
		try
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void loginuser1()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("Gokul");
		o.findElement(By.name("pwd")).sendKeys("GokulRaja");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(3000);
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(5000);
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser2()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			o.findElement(By.name("firstName")).sendKeys("Gokul2");
			o.findElement(By.name("lastName")).sendKeys("Raja");
			o.findElement(By.name("email")).sendKeys("demo@gmail.com");
			o.findElement(By.name("username")).sendKeys("Gokul2");
			o.findElement(By.name("password")).sendKeys("GokulRaja2");
			o.findElement(By.name("passwordCopy")).sendKeys("GokulRaja2");
			o.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(5000);
			logout();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser2()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("Gokul2");
		o.findElement(By.name("pwd")).sendKeys("GokulRaja2");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(3000);
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(5000);
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser3()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			o.findElement(By.name("firstName")).sendKeys("Gokul3");
			o.findElement(By.name("lastName")).sendKeys("Raja");
			o.findElement(By.name("email")).sendKeys("demo@gmail.com");
			o.findElement(By.name("username")).sendKeys("Gokul3");
			o.findElement(By.name("password")).sendKeys("GokulRaja3");
			o.findElement(By.name("passwordCopy")).sendKeys("GokulRaja3");
			o.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(5000);
			logout();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser3()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("Gokul3");
		o.findElement(By.name("pwd")).sendKeys("GokulRaja3");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(3000);
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(5000);
		logout();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void modifypassword() 
	{
		try
		{
			o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(4000);
			o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(4000);
			o.findElement(By.name("password")).sendKeys("GokulRaja33");
			o.findElement(By.name("passwordCopy")).sendKeys("GokulRaja33");
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser3()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("Gokul3");
		o.findElement(By.name("pwd")).sendKeys("GokulRaja33");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(3000);
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(5000);
		logout();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	private static void modifypassworduser2() 
	{
		try
		{
			o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(4000);
			o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(4000);
			o.findElement(By.name("password")).sendKeys("GokulRaja22");
			o.findElement(By.name("passwordCopy")).sendKeys("GokulRaja22");
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuasser2()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("Gokul2");
		o.findElement(By.name("pwd")).sendKeys("GokulRaja22");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(3000);
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(5000);
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifypassworduser1() 
	{
		try
		{
			o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(4000);
			o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(4000);
			o.findElement(By.name("password")).sendKeys("GokulRaja11");
			o.findElement(By.name("passwordCopy")).sendKeys("GokulRaja11");
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasuser1()
	{
		try
		{
		o.findElement(By.id("username")).sendKeys("Gokul");
		o.findElement(By.name("pwd")).sendKeys("GokulRaja11");
		o.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		Thread.sleep(3000);
		o.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
		Thread.sleep(5000);
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void Deleteuser3()
	{
		try
		{
		o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(4000);
		o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
		Thread.sleep(4000);
		o.findElement(By.id("userDataLightBox_deleteBtn" )).click();
		o.switchTo().alert().accept();
		Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void Deleteuser2()
	{
		try
		{
		o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(4000);
		o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(4000);
		o.findElement(By.id("userDataLightBox_deleteBtn" )).click();
		o.switchTo().alert().accept();
		Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void Deleteuser1()
	{
		try
		{
		o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(4000);
		o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(4000);
		o.findElement(By.id("userDataLightBox_deleteBtn" )).click();
		o.switchTo().alert().accept();
		Thread.sleep(5000);
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
			System.out.println("Sucessfully Executed");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}
	
}
