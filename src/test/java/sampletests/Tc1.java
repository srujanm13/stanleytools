package sampletests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tc1 {
@Test
	public void open() {
	System.setProperty("webdriver.chrome.driver", "D:\\Learn\\WorkSpace\\GitUpload\\stanleytools.com\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		
	}
	
}
