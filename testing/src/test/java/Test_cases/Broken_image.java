package Test_cases;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Brokenimg_finder;
import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class Broken_image extends testbase {
	Brokenimg_finder bi = new Brokenimg_finder();
	@Test
	public void broken_images() throws ClientProtocolException, IOException{
		int tot=0;
		Selwebddriver.driver.get("http://gcrit.com/build3/");
		List<WebElement> img = Selwebddriver.driver.findElements(By.tagName("img"));
		System.out.println("images"+img.size());
		for(WebElement imgElement: img){
			if(imgElement != null)
			{
				tot=bi.verifyimageActive(imgElement);
			}
		}
		System.out.println("The number of broken images in the page is"+tot);
		
	}

}
