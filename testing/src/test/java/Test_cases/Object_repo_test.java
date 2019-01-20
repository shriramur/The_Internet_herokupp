package Test_cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class Object_repo_test extends testbase{
	@Test
	public void or() throws IOException, InterruptedException{
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/tinymce");
		// Specify the file location I used . operation here because
		//we have object repository inside project directory only
		File src=new File("C:\\Users\\Rampage Rider\\Desktop\\softwares\\Mylocal_git\\testing\\Object_Repository.properties");
		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		// Create Properties class object to read properties file
		Properties pro=new Properties();
		// Load file so we can use into our script
		pro.load(fis);
		System.out.println("Property class loaded");
		Selwebddriver.driver.findElement(By.id(pro.getProperty("format_button"))).click();
		Thread.sleep(5000);
		}
}
