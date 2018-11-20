package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class dynamic_loading extends testbase{
	@Test
	public void dynamicloading() throws InterruptedException{
		linknavigator.hreflink("http://the-internet.herokuapp.com/dynamic_loading");
		WebDriverWait wait=new WebDriverWait(Selwebddriver.driver, 20);
		//Example 1: Element on page that is hidden
		/*linknavigator.hreflink("http://the-internet.herokuapp.com/dynamic_loading/1");
		String verify = Selwebddriver.driver.findElement(By.xpath("//*[@class='example']/h4")).getText();
		if(verify.contains("Element on page that is hidden")){
			WebElement strtbtn = Selwebddriver.driver.findElement(By.xpath("//*[@id='start']/button"));
			Selwebddriver.driver.findElement(By.xpath("//*[@id='start']/button")).click();
			//wait.until(ExpectedConditions.invisibilityOf(strtbtn));
			Thread.sleep(3000);
			WebElement ajaximage = Selwebddriver.driver.findElement(By.xpath("//*[@id='loading']/img"));
			wait.until(ExpectedConditions.invisibilityOf(ajaximage));
			String Helloworld = Selwebddriver.driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
			if(Helloworld.equals("Hello World!")){
				System.out.println("The Page has waited till the hidden text is triggred. The hidden text is "+Helloworld);			
			}
		}*/
		//Example 2: Element rendered after the fact
		linknavigator.hreflink("http://the-internet.herokuapp.com/dynamic_loading/2");
		String verify1 = Selwebddriver.driver.findElement(By.xpath("//*[@class='example']/h4")).getText ();
		if(verify1.contains("Element rendered after the fact")){
			Selwebddriver.driver.findElement(By.xpath("//*[@id='start']/button")).click();
			Thread.sleep(3000);
			WebElement ajaximage1 = Selwebddriver.driver.findElement(By.xpath("//*[@id='loading']/img"));
			wait.until(ExpectedConditions.invisibilityOf(ajaximage1));
			String Helloworld1 = Selwebddriver.driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
			if(Helloworld1.equals("Hello World!")){
				System.out.println("The Page has waited till the Element rendered after the fact triggred. The triggered text is "+Helloworld1);
			}
		}
	}

}


