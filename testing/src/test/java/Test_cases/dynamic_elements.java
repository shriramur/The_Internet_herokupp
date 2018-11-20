package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class dynamic_elements extends testbase {
	@Test
	public void dynamicelements() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(Selwebddriver.driver, 20);
		linknavigator.hreflink("http://the-internet.herokuapp.com/dynamic_controls");
		/*
		//Working with dynamic checkbox
		Selwebddriver.driver.findElement(By.id("checkbox")).click();
		String button_name = Selwebddriver.driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).getText();
		//1st time clicking on remove button
		if(button_name.equals("Remove")){
			Selwebddriver.driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
			WebElement web = Selwebddriver.driver.findElement(By.xpath("//*[@id='loading']/img"));
			wait.until(ExpectedConditions.invisibilityOf(web));
			String message = Selwebddriver.driver.findElement(By.xpath("//*[@id='message']")).getText();
			if(message.equals("It's gone!")){
				System.out.println("The ajax waiting is successfully worked, The webdriver waited fot loading image to disappear. Now the check box is not in the page");
			}
			else{
				System.out.println("Your code is wrong stupid the checkbox is still in the page, Debug it!!!!!!!!!!!");
			}
		}
		//2nd time clicking on add button
		String button_name1 = Selwebddriver.driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).getText();
		if(button_name1.equals("Add"))
		{
			Selwebddriver.driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
			WebElement web = Selwebddriver.driver.findElement(By.xpath("//*[@id='loading']/img"));
			wait.until(ExpectedConditions.invisibilityOf(web));
			String message = Selwebddriver.driver.findElement(By.xpath("//*[@id='message']")).getText();
			if(message.equals("It's back!")&&Selwebddriver.driver.findElement(By.id("checkbox")).isDisplayed()){
				System.out.println("The ajax waiting is successfully worked, The webdriver waited fot loading image to disappear. Now the check box is appearing back in the page");
			}
			else{
				System.out.println("Your code is wrong stupid the checkbox is not back in the page, Debug it!!!!!!!!!!!");
			}
		
		}
		*/
		//Working with dynamic textbox
		//Enabling the text box by clicking enable button
		String button_name3 = Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/button")).getText();
		//String onclickevent = Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/button")).getAttribute("onclick");
		if(button_name3.equals("Enable")/*&&onclickevent.equals("swapInput()")*/){
			Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
			Thread.sleep(3000);
			WebElement web = Selwebddriver.driver.findElement(By.xpath("//*[@id='loading']/img"));
			//wait.until(ExpectedConditions.visibilityOf(web));
			Thread.sleep(3000);
			wait.until(ExpectedConditions.invisibilityOf(web));
			Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/input")).sendKeys("The textbox is enabled");
			System.out.println("The values entered in the textbox successfully");
			String message = Selwebddriver.driver.findElement(By.xpath("//*[@id='message']")).getText();
			if(message.equals("It's enabled!")){
				System.out.println("The ajax waiting is successfully worked, The webdriver waited fot loading image to disappear. Now the Inputbox is enabled and the values entered successfuly in it");
			}
			else{
				System.out.println("Your code is wrong stupid the inputbox is still disabled in the page, Debug it!!!!!!!!!!!");
			}
		}
		//Enabling the text box by clicking enable button
		String button_name4 = Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/button")).getText();
		String onclickevent4 = Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/button")).getAttribute("onclick");
		if(button_name4.equals("Disable")&&onclickevent4.equals("swapInput()")){
			Selwebddriver.driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
			WebElement web = Selwebddriver.driver.findElement(By.xpath("//*[@id='loading']/img"));
			wait.until(ExpectedConditions.invisibilityOf(web));
			String message = Selwebddriver.driver.findElement(By.xpath("//*[@id='message']")).getText();
			if(message.equals("It's disabled!")){
				System.out.println("The ajax waiting is successfully worked, The webdriver waited fot loading image to disappear. Now the Inputbox is dis-enabled and the values cant be entered in it");
			}
			else{
				System.out.println("Your code is wrong stupid the inputbox is still enabled in the page, Debug it!!!!!!!!!!!");
			}
		}
	}

}


