package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class infinite_scroll extends testbase {
	@Test
	public void infynite_scrll(){
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/infinite_scroll");
		while(Selwebddriver.driver.findElement(By.id("page-footer")).isDisplayed()){
		JavascriptExecutor js = (JavascriptExecutor) Selwebddriver.driver;
		js.executeScript("window.scrollBy(0,150)");
		/*Taking this as javascriptexecutor example please research from below link
		 http://toolsqa.com/selenium-webdriver/javascript-and-selenium-javascriptexecutor/
		 */
		}
	}

}
