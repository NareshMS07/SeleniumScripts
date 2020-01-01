package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https:://google.com");
	driver.manage().window().maximize();
	String url=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
	System.out.println(url);
	driver.close();
	}

}
