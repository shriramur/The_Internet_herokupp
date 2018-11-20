package Test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class ABTesting extends testbase {
	
	@Test
	public void ABTesting_test() throws InterruptedException{
		String expected = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
		//click on Hotel link to navigate to hotel page
		linknavigator.hreflink("/abtest");
		String actual = Selwebddriver.driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
		Assert.assertEquals(expected,actual);	
	}
	
}
