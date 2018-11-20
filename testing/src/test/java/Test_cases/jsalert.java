package Test_cases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.testbase;

public class jsalert extends testbase{
	@Test
	public void jsAlert() throws InterruptedException{/*
		//basic alert with OK button
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Selwebddriver.driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alt = Selwebddriver.driver.switchTo().alert();
		alt.accept();
		String Text = Selwebddriver.driver.findElement(By.id("result")).getText();
		if(Text.equals("You successfuly clicked an alert")){
			System.out.println("Ok button is clicked");
		}
		//alert with OK or cancel button
		Selwebddriver.driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alt1 = Selwebddriver.driver.switchTo().alert();
		if(alt1.getText().equals("I am a JS Confirm")){
			System.out.println(alt1.getText());
			alt1.dismiss();
			String Text1 = Selwebddriver.driver.findElement(By.id("result")).getText();
			System.out.println(Text1);
		}*/
		//alert with sendkeys
		Selwebddriver.driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Selwebddriver.driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alt2 = Selwebddriver.driver.switchTo().alert();
		if(alt2.getText().equals("I am a JS prompt")){
			String alertbox=alt2.getText();
			System.out.println(alertbox);
			alt2.sendKeys("hi");
			alt2.accept();
			Thread.sleep(3000);
			String Text1 = Selwebddriver.driver.findElement(By.id("result")).getText();
			System.out.println(Text1);
		}
	}

}
