package Test_cases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class Basic_Auth extends testbase {
	@Test
	public void BasicAuth() throws Exception{
		Selwebddriver.driver.findElement(By.partialLinkText("Basic Auth")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\UB\\automation\\autoit\\auto it executables\\windows_login_authenticator.exe");
		
		}
	}
	
	


