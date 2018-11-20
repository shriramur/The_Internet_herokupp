package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class drag_and_drop extends testbase{
	@Test
	public void drag_drop() throws InterruptedException{
		linknavigator.hreflink("http://the-internet.herokuapp.com/drag_and_drop");
		WebElement drag_obj1 = Selwebddriver.driver.findElement(By.xpath("//*[@id='column-a']/header"));
		WebElement drag_obj2 = Selwebddriver.driver.findElement(By.xpath("//*[@id='column-b']/header"));
		Actions act=new Actions(Selwebddriver.driver);
		Thread.sleep(3000);
		act.dragAndDrop(drag_obj1, drag_obj2).build().perform();
		Thread.sleep(3000);
		String test=Selwebddriver.driver.findElement(By.xpath("//*[@id='column-a']/header")).getText();
		System.out.println(test);
		if(test=="B"){
		System.out.println("done");
		}
		else{
			System.out.println("not done");
		}
		
	}

}
