
//import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class ReadingDataFromWeb {
	//Can read data from a file on the Web
	
	/**www.google.com is the Uniform Resource Locator (URL) for the file index.html located on Google's web server*/
	
	//When you enter the URL in a web browser, the web server sends the data from your browser, which renders the data graphically:
	
	/**
				Client											Server
		{							}					{						**DataBase	}
		{	[Web Browser]			}					{	[Web Server]--->(Local Files)	}
		{	[Application Program]	}-----(Internet)--->{									}
		{							}					{									}
	 */
	
	//For an application program to read a URL, use the java.net.URL class with this constructor:
	
	/**	public URL(String spec) throws MalformedURLException*/
	
	//Example
	public static void main(String[] args) {
		
		
		try {
			@SuppressWarnings({"deprecation"})
			URL url = new URL("http://www.google.com/index.html");
			
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
			}
			input.close();
			System.out.println("URL Length: " + count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/**MalformedURLException is thrown if the URL String has a syntax error:
		 	*Example: The URL String "http://www.google.com/index.html" would cause MalformedURLException runtime error b/c
		 two slashes (//) are required after the colon (:).
		 	*NOTE: The http:// prefix is required for the URL class to recognize a valid URL. It would be wrong if you wrote:
		 		new URL("www.google.com/index.html")
		 		
		 */
	}
	
}
