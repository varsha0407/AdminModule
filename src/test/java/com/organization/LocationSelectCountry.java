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

public class LocationSelectCountry {
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
		String general_Information = p.getProperty("general_information");
		String locations = p.getProperty("locations");
		String add = p.getProperty("add");
		String name = p.getProperty("name");
		String name_Input = p.getProperty("name_input");
		String city = p.getProperty("city");
		String city_Input = p.getProperty("city_input");
		String state = p.getProperty("state");
		String state_Input = p.getProperty("state_input");
		//String country = p.getProperty("country");
		String countryListbox = p.getProperty("country_listbox");
		String phone = p.getProperty("phone");
		String phone_number = p.getProperty("phone_number");
		String save_Btn = p.getProperty("save_btn");
		String chechbox1 = p.getProperty("chechbox1");
		String chechbox = p.getProperty("chechbox");
		String delete_Btn = p.getProperty("delete_btn");
		String yes_Delete_Btn = p.getProperty("yes_delete_btn");
		String structure = p.getProperty("structure");
		String edit = p.getProperty("edit");
		String name1 = p.getProperty("name1");
		String city1 = p.getProperty("city1");
		String city1_Input = p.getProperty("city1_input");
		String country = p.getProperty("country0");
		String reset_Btn = p.getProperty("reset_btn");

			
		d.get(url);
		Thread.sleep(2000);
	
        // loginpage
		d.findElement(By.name(username)).sendKeys(usernameInput);
		Thread.sleep(2000);
		
		d.findElement(By.name(password)).sendKeys(passwordInput);
		Thread.sleep(2000);
		
		d.findElement(By.xpath(loginButton)).click();
		Thread.sleep(2000);
		
        //click on admin
		d.findElement(By.xpath(admin)).click();
		Thread.sleep(2000);
		
        //click on organization
		d.findElement(By.xpath(organization)).click();
		Thread.sleep(2000);	

		// click on locations
		d.findElement(By.xpath(locations)).click();
		Thread.sleep(2000);
		
		// Select India From Country listbox
		
		WebElement country1 = d.findElement(By.xpath(country));
		country1.click();
		   
		Thread.sleep(2000);
			
		d.findElement(By.xpath(countryListbox)).click();	
		Thread.sleep(2000);
			
	    d.quit();
	
    }
   catch (Exception e) {
System.out.println(e);
  }	
 }
}
