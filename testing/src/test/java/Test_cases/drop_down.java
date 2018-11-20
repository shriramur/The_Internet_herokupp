package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class drop_down extends testbase {
	@Test
	public void dropdown() throws InterruptedException{
		linknavigator.hreflink("http://the-internet.herokuapp.com/dropdown");
		Select options = new Select(Selwebddriver.driver.findElement(By.id("dropdown")));
		Thread.sleep(2000);
		//options.selectByValue("2");
		//options.selectByIndex(2);
		options.selectByVisibleText("Option 1");
		Thread.sleep(2000);
	}

}
