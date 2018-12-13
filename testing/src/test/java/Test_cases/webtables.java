package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class webtables extends testbase{
	@Test
	public void webTable() throws InterruptedException{
		Selwebddriver.driver.get("http://toolsqa.com/automation-practice-table/");
		WebElement trdata = Selwebddriver.driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th[text()='Taipei 101']/ancestor::tr"));
		System.out.println(trdata.getText().toString());
		Thread.sleep(5000);
		Selwebddriver.driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th[text()='Taipei 101']/ancestor::tr/td/a[@href='#']")).click();
		System.out.println("clicked");
	}
}


//table[@class='tsc_table_s13']/tbody/tr/th[text()='Taipei 101']/ancestor::tr
