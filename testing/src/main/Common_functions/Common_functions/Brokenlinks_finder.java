package Common_functions;

import java.net.HttpURLConnection;
import java.net.URL;

public class Brokenlinks_finder {
	public static void verifyLink(String urlLink) {
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
		 //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
		 URL link = new URL(urlLink);
		 // Create a connection using URL object (i.e., link)
		 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		 //Set the timeout for 2 seconds
		 httpConn.setConnectTimeout(2000);
		 //connect using connect method
		 httpConn.connect();
		 //use getResponseCode() to get the response code. 
		 if(httpConn.getResponseCode()== 200) { 
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 if(httpConn.getResponseCode()== 404) {
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
 }
 }
 //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
 catch (Exception e) {
 //e.printStackTrace();
 }}}


