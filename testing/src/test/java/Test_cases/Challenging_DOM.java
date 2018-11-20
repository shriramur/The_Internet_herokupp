package Test_cases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common_functions.Selwebddriver;
import Common_functions.linknavigator;
import Common_functions.testbase;

public class Challenging_DOM extends testbase {
	@Test
	public void Challenging_dom()
	{
		String temp;
		linknavigator.hreflink("http://the-internet.herokuapp.com/challenging_dom");
		WebElement table = Selwebddriver.driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/table"));
		//to get all the values of table in a single list
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cols = table.findElements(By.tagName("td"));
		List<String> value = new ArrayList<String>();
		/*System.out.println(rows.size());
		System.out.println(cols.size());*/
		for (int j=0; j<cols.size(); j++){
            System.out.println(cols.get(j).getText());
            value.add(cols.get(j).getText());
        }
		//System.out.println(value);
		List<String> Iuvaret = new ArrayList<String>();
		for(int i=0; i<value.size();i++){
			for(int j=i+1;j<value.size();j++){
				if (value.get(i).compareTo(value.get(j))>0) 
                {
                    temp = value.get(i);
                    value.set(i,value.get(j));
                    value.set(j,temp);
                    System.out.println(value.get(i));
                }
			}
		}
		
		//System.out.println(value);
		/*value.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(value);*/
	
			
		
		
		
		/*System.out.println(rows.size());
		int rows_count = rows.size();
		for(int i=1;i<rows.size();i++){
			String[] str = null;
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			//System.out.println(cols.get(i).getText());
			int cols_count = cols.size();
			System.out.println("The number of rows and columns in the table are:"+rows_count+","+cols_count);
			System.out.println("test"+cols.get(0).getText());
			str[i] = cols.get(i).getText();
			System.out.println(str);*/
		}
		//System.out.println(cols.size());
		//System.out.println("table"+table);
		//*[@id='content']/div/div/div/div[2]/table/thead/tr/th[2]
	}


