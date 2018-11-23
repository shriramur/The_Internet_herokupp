package Test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class nested_frames extends testbase{
	@Test
	public void nested_frame() throws InterruptedException{
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/nested_frames");
		WebElement fname = Selwebddriver.driver.findElement(By.name("frame-top"));
		Selwebddriver.driver.switchTo().frame(fname);
		Selwebddriver.driver.switchTo().frame("frame-middle");
		System.out.println(Selwebddriver.driver.findElement(By.xpath("//*[@id='content']")).getText());
	}
}
