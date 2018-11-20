package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class Frames_nested extends testbase{
	/*@Test
	public void nested_frames(){
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/nested_frames");
		Selwebddriver.driver.switchTo().frame("frame-left");
		System.out.println("Moved to left frame");
		Selwebddriver.driver.switchTo().frame("frame-middle");
		String middle=Selwebddriver.driver.findElement(By.id("content")).getText();
		System.out.println(middle);
	}*/
	@Test
	public void iframes() throws InterruptedException{
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/iframe");
		// if u see a tag frame or iframe we should switch to that frame to access the elements inside the frame
		Selwebddriver.driver.switchTo().frame("mce_0_ifr");
		WebElement mec_textbox = Selwebddriver.driver.findElement(By.id("tinymce"));
		mec_textbox.clear();
		mec_textbox.sendKeys("This is a sample text");
		//Selwebddriver.driver.switchTo().defaultContent();//use to get back to default content of the page when a control within a iframe
		//Selwebddriver.driver.findElement(By.xpath("//*[@id='mceu_15']/button")).click();
	
	}

}
