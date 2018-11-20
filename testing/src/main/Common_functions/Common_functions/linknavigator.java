package Common_functions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class linknavigator {
	public static void hreflink(String href) {
        List<WebElement> anchors = Selwebddriver.driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains(href)) {
                anchor.click();
                break;
            }
        }
    }

}
