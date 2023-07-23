package com.configuration;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocalizationSelectDateFormate {
public static void main(String[] args) {
try {
	WebDriverManager.chromedriver().setup();	
	
	 ChromeOptions c = new ChromeOptions();
     c.addArguments("--remote-allow-origins=*");
	 WebDriver d = new ChromeDriver(c);
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 FileInputStream fis = new FileInputStream("C:\\\\Users\\\\91797\\\\eclipse-workspace\\\\Orangehrm\\\\input.properties");
	 Properties p = new Properties();
	 p.load(fis);
		
	 String url = p.getProperty("url");	
	 String username = p.getProperty("username");
	 String password = p.getProperty("password");
	 String usernameInput = p.getProperty("username_input");
	 String passwordInput = p.getProperty("password_input");
	 String loginButton = p.getProperty("login_button");
	 String admin = p.getProperty("admin");
	 String configuration = p.getProperty("configuration");		 
	 String localization = p.getProperty("localization");		
	 String dateFormate = p.getProperty("dateFormate");		 		 	
	 String dateFormateListbox = p.getProperty("dateFormateListbox");		 	

     d.get(url);
	 Thread.sleep(2000);

	 // Loginpage
	 d.findElement(By.name(username)).sendKeys(usernameInput);
	 Thread.sleep(2000);
		
	 d.findElement(By.name(password)).sendKeys(passwordInput);
	 Thread.sleep(2000);
		
	 d.findElement(By.xpath(loginButton)).click();
	 Thread.sleep(2000);
	
	 // Click on admin
	 d.findElement(By.xpath(admin)).click();
	 Thread.sleep(2000);
	
	 //click on configuration
	 d.findElement(By.xpath(configuration)).click();
	 Thread.sleep(2000);	
		
	 // click on localization
	 d.findElement(By.xpath(localization)).click();
	 Thread.sleep(2000);

	 // select date
	 WebElement dateFormate1 = d.findElement(By.xpath(dateFormate));
	 dateFormate1.click();
     Thread.sleep(2000);	

     d.findElement(By.xpath(dateFormateListbox)).click();
     Thread.sleep(2000);	
	
     d.quit();				
}
catch (Exception e) {
	System.out.println(e);
}	
}	

}
