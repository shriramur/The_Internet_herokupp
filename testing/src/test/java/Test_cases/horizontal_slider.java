package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class horizontal_slider extends testbase{

	@Test
	public void hori_slider() throws InterruptedException{
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/horizontal_slider");
		WebElement slider = Selwebddriver.driver.findElement(By.xpath("//*[@type='range']"));
		String max = slider.getAttribute("max");
		String min = slider.getAttribute("min");
		String step = slider.getAttribute("step");
		System.out.println(min);
		System.out.println(max);
		System.out.println(step);
		Actions builder = new Actions(Selwebddriver.driver);
		builder.clickAndHold();
		Action dragAndDrop = builder.dragAndDropBy(slider,5,0).build();
		dragAndDrop.perform();
		Thread.sleep(3000);
	}
}
