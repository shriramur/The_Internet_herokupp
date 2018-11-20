package Common_functions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selwebddriver {

 public static WebDriver driver=null;
 public static void Initialize(String weblink, String browser){
	 if(driver==null){
		 System.out.println("Initializing driver");
		 if(browser.equalsIgnoreCase("ff"))
			 driver=new FirefoxDriver();
		 else if(browser.equalsIgnoreCase("ie")){
			 System.setProperty("webdriver.ie.driver", "C:\\Users\\shriram.r\\Desktop\\selenium setup files\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rampage Rider\\Desktop\\softwares\\testing\\Windows_Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 }
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 driver.navigate().to(weblink);
	 }
 public static void close(){
	 System.out.println("Closing browser");
	 driver.close();
	 driver=null;
 }
 public static void quit(){
	 System.out.println("quitting browser");
	 driver.quit();
	 driver=null;
 }
 }

