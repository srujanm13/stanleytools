package sampletests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc1 {
@Test
	public static void open() {
		WebDriver d=new ChromeDriver();
		d.get("www.google.com");
		
	}
	
}
