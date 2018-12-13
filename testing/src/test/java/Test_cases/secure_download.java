package Test_cases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class secure_download extends testbase{
	@Test
	public void secure_downloads() throws InterruptedException{
		//First method to enter username and passworde in Alert box
		String URL = "http://" + "admin" + ":" + "admin" + "@" + "the-internet.herokuapp.com/download_secure";
		Selwebddriver.driver.get(URL);
		//second method autoit or robot
		/*Selwebddriver.driver.findElement(By.partialLinkText("Secure File Download")).click();
		Alert alt = Selwebddriver.driver.switchTo().alert();
		alt.
		authenticateUsing(new UserAndPassword(_user_name,_password));
		Thread.sleep(5000);
		alt.accept();
		Selwebddriver.driver.switchTo().defaultContent();*/
		
		
	}

}
