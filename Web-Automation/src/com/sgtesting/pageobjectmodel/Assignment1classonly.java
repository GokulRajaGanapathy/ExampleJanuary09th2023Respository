package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment1classonly {

	public Assignment1classonly(WebDriver o)
	{
		PageFactory.initElements(o, this);
		
	}
	
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	
	@FindBy (xpath="//*[@id='loginButton']/div")
	private WebElement login;
	public WebElement login1()
	{
		return login;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement minimizewindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy (xpath ="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement usertab;
	public WebElement clickusertab()
	{
		return usertab;
	}
	
	@FindBy (xpath ="//*[@id='createUserDiv']/div")
	private WebElement adduser;
	public WebElement addusericon()
	{
		return adduser;
	}
	
	private WebElement firstName;
	public WebElement entername()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement enterlastname()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement entermail()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement enterusername()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement password;
	public WebElement enterpassword()
	{
		return password;
	}
	
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement enterRePassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement entercreateuser()
	{
		return userDataLightBox_commitBtn;
	}
	
	private WebElement logoutLink;
	public WebElement clicklogout()
	{
		return logoutLink;
	}

}
