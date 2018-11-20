package Test_cases;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class exit_intent extends testbase{
	@Test
	public void exitintent() throws AWTException, InterruptedException{
		Robot chitti=new Robot();
		linknavigator.hreflink("http://the-internet.herokuapp.com/exit_intent");
		String header=Selwebddriver.driver.findElement(By.xpath("//*[@class='example']/h3")).getText();
		if (header.equals("Exit Intent")) {
			chitti.mouseMove(800,-1000);
			Thread.sleep(4000);
			System.out.println("the mouse pointer is moveed");
		}
	}

}
