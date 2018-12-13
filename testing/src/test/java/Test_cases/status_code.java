package Test_cases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.openqa.selenium.By;

import Common_functions.Brokenlinks_finder;
import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class status_code extends testbase{
	
	Scanner reader = new Scanner(System.in);
	String code=null;
	@Test
	public void status_codes(){
		System.out.println("Enter the staus code you need to see");
		int read_code=reader.nextInt();
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/redirector");
		Selwebddriver.driver.findElement(By.id("redirect")).click();
		String code_url=Selwebddriver.driver.getCurrentUrl();
		assertEquals(code_url,"http://the-internet.herokuapp.com/status_codes");
		System.out.println("In status code page");
		String url=null;
		switch(read_code){
		case 200:
			code = Integer.toString(read_code);
			Selwebddriver.driver.findElement(By.xpath("//*[@href='status_codes/"+code+"']")).click();
			url=Selwebddriver.driver.getCurrentUrl();
			Brokenlinks_finder.verifyLink(url);
		case 301:
			code = Integer.toString(read_code);
			Selwebddriver.driver.findElement(By.xpath("//*[@href='status_codes/"+code+"']")).click();
			url=Selwebddriver.driver.getCurrentUrl();
			Brokenlinks_finder.verifyLink(url);
		case 404:
			code = Integer.toString(read_code);
			Selwebddriver.driver.findElement(By.xpath("//*[@href='status_codes/"+code+"']")).click();
			url=Selwebddriver.driver.getCurrentUrl();
			Brokenlinks_finder.verifyLink(url);
		case 500:
			code = Integer.toString(read_code);
			Selwebddriver.driver.findElement(By.xpath("//*[@href='status_codes/"+code+"']")).click();
			url=Selwebddriver.driver.getCurrentUrl();
			Brokenlinks_finder.verifyLink(url);
		}
	}
}
