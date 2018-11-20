package Test_cases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class disappearing_elements extends testbase{
@Test
public void dispear_elem(){
	linknavigator.hreflink("http://the-internet.herokuapp.com/disappearing_elements");
	//List<WebElement> links_context = Selwebddriver.driver.findElements(By.tagName("a"));
	for(int i1=0;i1<=1;i1++){
	WebElement content = Selwebddriver.driver.findElement(By.id("content"));
	List<WebElement> links_context = content.findElements(By.tagName("a"));
	Iterator<WebElement> i = links_context.iterator();
	List<String> contextlinks = new ArrayList<String>();
	 while(i.hasNext()) {
         WebElement anchor = i.next();
        		contextlinks.add(anchor.getAttribute("href")); 
         }
	 System.out.println("The no of links under content ids are: "+contextlinks);
	 Selwebddriver.driver.navigate().refresh();
	}
}
}


