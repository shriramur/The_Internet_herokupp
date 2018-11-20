package Test_cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.javamail;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class forgot_password extends testbase{
	@Test
	public void forgotpwd() throws Exception{
		String emailid = "shriramur96@gmail.com";
		boolean ismailreceived;
		linknavigator.hreflink("http://the-internet.herokuapp.com/forgot_password");
		Selwebddriver.driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailid);
		Selwebddriver.driver.findElement(By.xpath("//*[@id='form_submit']")).click();
		javamail mail = new javamail();
		ismailreceived = mail.redmail(emailid);
		if(ismailreceived){
			mail.sendMail("shriamur96@gmail.com","password recovery link has sent to mail");
		}
	}

}
