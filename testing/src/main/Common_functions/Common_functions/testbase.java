package Common_functions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testbase {
	@BeforeClass
	public void setup(){
		String weblink = "http://the-internet.herokuapp.com/";// link to open
		String browser = "chrome"; //browser to be used to run the test
		Selwebddriver.Initialize(weblink, browser);
	}
	@AfterClass
	public void teardown(){
		Selwebddriver.close();
	}
}
