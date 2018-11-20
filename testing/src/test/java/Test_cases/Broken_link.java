package Test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class Broken_link extends testbase{
	@Test
	public void broken_links()
	{
		List<WebElement> links = Selwebddriver.driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size()); 
		for(int i=0; i<links.size(); i++){
			
		}
			
	}
}
