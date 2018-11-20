package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;


public class Login_page extends testbase{
	
	@Test(dataProvider="credentials")
	//@parameter example
	//@Parameters({"Username", "Password"})
	public void login_page(String Username, String Password){
		linknavigator.hreflink("http://the-internet.herokuapp.com/login");
		/*Selwebddriver.driver.findElement(By.id("username")).sendKeys("tomsmith1");
		Selwebddriver.driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");*/
		//@paramenter example
		Selwebddriver.driver.findElement(By.id("username")).sendKeys(Username);
		Selwebddriver.driver.findElement(By.id("password")).sendKeys(Password);
		Selwebddriver.driver.findElement(By.xpath("//*[@id='login']/button")).click();
		String url = Selwebddriver.driver.getCurrentUrl();
		String page_element = Selwebddriver.driver.findElement(By.xpath("//*[@id='flash']")).getText();
		if((url.equals("http://the-internet.herokuapp.com/secure"))&&page_element.contains("You logged into a secure area!")){
			System.out.println("Logged in successfully.....please press log out button");
			Selwebddriver.driver.findElement(By.partialLinkText("Logout")).click();
			String logout_url = Selwebddriver.driver.getCurrentUrl(); 
			String page_element2 = Selwebddriver.driver.findElement(By.xpath("//*[@id='flash']")).getText();
			if((logout_url.equals("http://the-internet.herokuapp.com/login"))&&page_element2.contains("You logged out of the secure area!")){
				System.out.println("Logged out successfully");
			}
		}
		else if(Selwebddriver.driver.findElement(By.xpath("//*[@id='flash']")).getText().contains("Your username is invalid!")){
			System.out.println("Login failed");
		}
		
	}
	@DataProvider
	public Object[][] credentials()
	{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[1][2];
		data[0][0] ="tomsmith1";
		data[0][1] = "SuperSecretPassword!";
		return data;
	}
}
