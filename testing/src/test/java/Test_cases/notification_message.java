package Test_cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class notification_message extends testbase{
	@Test
	public void notify_me(){
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
		Selwebddriver.driver.findElement(By.xpath("//*[contains(text(),'Click here')]")).click();
		System.out.println(Selwebddriver.driver.findElement(By.xpath("//*[@id='flash' and @class='flash notice']")).getText());
		//to close pop up
		Selwebddriver.driver.findElement(By.xpath("//*[@id='flash' and @class='flash notice']/a[@href='#']")).click();
	}

}
