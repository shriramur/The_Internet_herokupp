package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class Key_press extends testbase{
	@Test
	public void key_presses() throws InterruptedException{
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(Selwebddriver.driver);
		act.keyDown(Keys.SHIFT);
		act.keyUp(Keys.SHIFT);
		act.sendKeys("S");
		act.build().perform();
		Thread.sleep(8000);
		String text = Selwebddriver.driver.findElement(By.id("result")).getText();
		System.out.println(text);
	}

}
