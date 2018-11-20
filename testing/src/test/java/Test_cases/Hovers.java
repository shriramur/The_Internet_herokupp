package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class Hovers extends testbase{
@Test
public void hover() throws InterruptedException{
	Selwebddriver.driver.get("http://the-internet.herokuapp.com/hovers");
	Thread.sleep(5000);
	WebElement user1 = Selwebddriver.driver.findElement(By.xpath("//*[@class='figure']/img[1]"));
	Thread.sleep(3000);
	Actions action = new Actions(Selwebddriver.driver);
	action.moveToElement(user1).build().perform();
	System.out.println(Selwebddriver.driver.findElement(By.xpath("//*[@class='figure']/div/h5")).getText());
	action.moveToElement(user1).moveToElement(Selwebddriver.driver.findElement(By.xpath("//*[@class='figure']/div/a"))).click().build().perform();
	Thread.sleep(3000);
	String user1url = Selwebddriver.driver.getCurrentUrl();
	if(user1url.equals("http://the-internet.herokuapp.com/users/1")){
		System.out.println("Hover work  fine try to find more");
	}
	
}
}
