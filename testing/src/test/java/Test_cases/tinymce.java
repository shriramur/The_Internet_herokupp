package Test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class tinymce extends testbase{
	@Test
	public void tinymecc() throws InterruptedException{
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/tinymce");
		List<WebElement> wb = Selwebddriver.driver.findElements(By.xpath("//div[@id='mceu_14-body']/child::*"));
		//List<WebElement> wb = Selwebddriver.driver.findElements(By.xpath("//*"));
		for(int i=0;i<wb.size();i++){
			System.out.println(wb.get(i).getAttribute("id"));
		}
		
		/*Selwebddriver.driver.findElement(By.id("tinymce")).clear();
		Selwebddriver.driver.findElement(By.id("tinymce")).sendKeys("This is a sample text");
		Thread.sleep(5000);*/
	}
}
