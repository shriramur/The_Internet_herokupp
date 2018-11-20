package Test_cases;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class downloading_file {
	public WebDriver driver;
	
	@BeforeTest
	public void chrompref(){  
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hii\\workspace\\testing\\Windows_Drivers\\chromedriver.exe");  
		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();  
		 chromePrefs.put("profile.default_content_settings.popups", 0); //this will block download pop up for file of chrome browser 
		 chromePrefs.put("download.default_directory", "C:\\Users\\hii\\workspace\\testing\\browser_downloads");//this will change the download path of chrome to specfied path
		 ChromeOptions options = new ChromeOptions();//creating an instance of ChromeOptions, which has convenient methods for setting ChromeDriver-specific capabilities. 
		 options.setExperimentalOption("prefs", chromePrefs);// setting properties in hashmap to chrome
		 options.addArguments("--disable-notifications");//disable any notification in chrome (popUps)
		 DesiredCapabilities cap = DesiredCapabilities.chrome();  
		 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
		 cap.setCapability(ChromeOptions.CAPABILITY, options);//applying capabilities to chrome browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hii\\workspace\\testing\\Windows_Drivers\\chromedriver.exe"); 
		 driver = new ChromeDriver(options);
	}
	
	@Test
	public void filedownload() throws InterruptedException{
		driver.get("http://the-internet.herokuapp.com/download");
		String filename = driver.findElement(By.linkText("test.txt")).getText();
		driver.findElement(By.linkText("test.txt")).click();
		System.out.println("The file has been downloaded");
		Thread.sleep(4000);
		delfil(filename);//comment this to prevent deleting a file
	}
	//function to deleting a file 
	public void delfil(String filename){
		 File file = new File("C:\\Users\\hii\\workspace\\testing\\browser_downloads");//making a file obj to access this location
	        File[] files = file.listFiles();//retrive list of files that is in that location
	        for(File f: files){
	        	if(f.getName().equals(filename)){
	        		f.delete();//deleting a file
	        		System.out.println("The file deleted is "+f.getName());
	        	}
	        }

		}
	@AfterTest
	public void teardown(){
		driver.close();
	}
}
/*
 *  public WebDriver driver;  
 System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");  
 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();  
 chromePrefs.put("profile.default_content_settings.popups", 0); //this will block download pop up for file of chrome browser 
 chromePrefs.put("download.default_directory", downloadFilepath);//this will change the download path of chrome to specfied path
 ChromeOptions options = new ChromeOptions();//creating an instance of ChromeOptions, which has convenient methods for setting ChromeDriver-specific capabilities. 
 options.setExperimentalOption("prefs", chromePrefs);// setting properties in hashmap to chrome
 options.addArguments("--disable-notifications");//disable any notification in chrome (popUps)
 DesiredCapabilities cap = DesiredCapabilities.chrome();  
 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
 cap.setCapability(ChromeOptions.CAPABILITY, options);//applying capabilities to chrome browser
 System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");  
 driver = new ChromeDriver(options);  
 */
