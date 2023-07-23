package com.organization;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddLocationSave {
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
	 String organization = p.getProperty("organization");		 
	 String addButton = p.getProperty("add_button");		 	
	 String country = p.getProperty("country");		 	
	 String countryListbox = p.getProperty("country_listbox");		 	
	 String locations = p.getProperty("locations");		 	
	 String name = p.getProperty("name");		 	
	 String nameInput = p.getProperty("name_input");		 	
	 String city = p.getProperty("city");		 	
	 String cityInput = p.getProperty("city_input");		 	
	 String state = p.getProperty("state");		 	
	 String stateInput = p.getProperty("state_input");		 	
	 String phone = p.getProperty("phone");		 	
	 String phoneNumber = p.getProperty("phone_number");		 	
	 String saveButton = p.getProperty("save_button");		 	
	 	
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
	
	 //click on organization
	 d.findElement(By.xpath(organization)).click();
	 Thread.sleep(2000);	

	 // click on locations
	 d.findElement(By.xpath(locations)).click();
	 Thread.sleep(2000);		 
		 	
    // click on add button
	 d.findElement(By.xpath(addButton)).click();

	//name
	 d.findElement(By.xpath(name)).sendKeys(nameInput);
	 Thread.sleep(2000);
		
    //city
	 d.findElement(By.xpath(city)).sendKeys(cityInput);
	 Thread.sleep(2000);
		
	 d.findElement(By.xpath(state)).sendKeys(stateInput);
	 Thread.sleep(2000);

	 
	// select country
	 WebElement country1 = d.findElement(By.xpath(country));
	 country1.click();
		   
	 Thread.sleep(2000);
			
	 d.findElement(By.xpath(countryListbox)).click();	
	 Thread.sleep(2000);
		
	 d.findElement(By.xpath(phone)).sendKeys(phoneNumber);
	 Thread.sleep(2000);
		
	 d.findElement(By.xpath(saveButton)).click();
	 Thread.sleep(4000);
	 
	 d.quit();
		
	} 
  catch (Exception e) {
	System.out.println(e);
}	
}
}
