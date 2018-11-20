package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class checkboxes extends testbase{
	@Test
	public void chkboxes() throws InterruptedException{
		linknavigator.hreflink("http://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox1 = Selwebddriver.driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
		WebElement checkbox2 = Selwebddriver.driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
		if(checkbox1.isSelected()){
			System.out.println("1st check box is selected");
		}
		else{
			Thread.sleep(3000);
			checkbox1.click();
			Thread.sleep(3000);
			System.out.println("1st check box is now selected");
		}
		if(checkbox2.isSelected()){
			System.out.println("2nd check box is selected");
		}
		else{
			Thread.sleep(3000);
			checkbox2.click();
			System.out.println("2nd check box is now selected");
		}
		if(checkbox1.isSelected()&&checkbox2.isSelected()){
			System.out.println("Both the checkboxes are selected");
		}
		
	}
}

//*[@id="checkboxes"]/input[1]
//*[@id="checkboxes"]/input[2]
