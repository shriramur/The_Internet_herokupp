package Test_cases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;

import Common_functions.linknavigator;
import Common_functions.testbase;

public class upload_file extends testbase{
	
	@Test
	public void upload() throws IOException{
		String filename = "small_upload.txt";
		File f = new File(filename);
		String path = f.getCanonicalPath();
		System.out.println(path);
		linknavigator.hreflink("http://the-internet.herokuapp.com/upload");
		Selwebddriver.driver.findElement(By.id("file-upload")).sendKeys(path);
		Selwebddriver.driver.findElement(By.id("file-submit")).click();
		String text = Selwebddriver.driver.findElement(By.id("uploaded-files")).getText();
		System.out.println("The file uploaded is "+text);
		
	}

}
