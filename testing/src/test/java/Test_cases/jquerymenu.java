package Test_cases;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class jquerymenu extends testbase{
	public WebDriver driver;
	@BeforeTest
	public void chrompref(){  
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hii\\workspace\\testing\\Windows_Drivers\\chromedriver.exe");  
		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();  
		 chromePrefs.put("profile.default_content_settings.popups", 0); //this will block download pop up for file of chrome browser 
		 chromePrefs.put("download.default_directory", "C:\\Users\\Rampage Rider\\Desktop\\softwares\\testing\\browser_downloads");//this will change the download path of chrome to specfied path
		 ChromeOptions options = new ChromeOptions();//creating an instance of ChromeOptions, which has convenient methods for setting ChromeDriver-specific capabilities. 
		 options.setExperimentalOption("prefs", chromePrefs);// setting properties in hashmap to chrome
		 options.addArguments("--disable-notifications");//disable any notification in chrome (popUps)
		 DesiredCapabilities cap = DesiredCapabilities.chrome();  
		 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
		 cap.setCapability(ChromeOptions.CAPABILITY, options);//applying capabilities to chrome browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rampage Rider\\Desktop\\softwares\\testing\\Windows_Drivers\\chromedriver.exe"); 
		 driver = new ChromeDriver(options);
	}
	@Test
	public void jqmenu() throws InterruptedException{
		driver.get("http://the-internet.herokuapp.com/jqueryui/menu");
		WebElement menu = driver.findElement(By.id("menu"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).moveToElement(driver.findElement(By.xpath("//*[@id='ui-id-4']"))).moveToElement(driver.findElement(By.xpath("//*[@id='ui-id-6']")));
		String filename = driver.findElement(By.id("ui-id-6")).getAttribute("href");
		System.out.println(filename);
		Thread.sleep(3000);
		action.moveToElement(menu).moveToElement(driver.findElement(By.xpath("//*[@id='ui-id-4']"))).moveToElement(driver.findElement(By.xpath("//*[@id='ui-id-6']"))).click().build().perform();
		System.out.println("file downloaded");
		
	}
	@AfterTest
	public void teardown(){
		driver.close();
	}

}
