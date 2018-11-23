package Test_cases;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class Multiple_windows extends testbase{
	@Test
	public void mul_win() throws InterruptedException{
		
		Selwebddriver.driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(5000);
		Selwebddriver.driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		String current_window = Selwebddriver.driver.getWindowHandle();
		System.out.println(current_window);
		Set<String> id = Selwebddriver.driver.getWindowHandles();
		System.out.println(id);
		Iterator<String> ite = id.iterator();
		while(ite.hasNext()){
			String next_window = ite.next();
			String nextwin_title=Selwebddriver.driver.switchTo().window(next_window).getTitle();
			if(nextwin_title.equals("New Window")){
				Selwebddriver.driver.switchTo().window(next_window);
				System.out.println("The content of the page is"+Selwebddriver.driver.findElement(By.tagName("h3")).getText());
				break;
			}
		}
	}

}
