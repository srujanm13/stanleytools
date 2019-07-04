package sampletests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {
@Test
	public void open() {
	System.setProperty("webdriver.chrome.driver", "D:\\Learn\\WorkSpace\\GitUpload\\stanleytools.com\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		d.close();	
	}
@Test
public void open2() {
	System.setProperty("webdriver.chrome.driver", "D:\\Learn\\WorkSpace\\GitUpload\\stanleytools.com\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("FaceBook");
		d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
		d.close();
	}
}
