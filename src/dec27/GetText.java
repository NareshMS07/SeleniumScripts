package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https:://google.com");
	driver.manage().window().maximize();
	//get text of link
	String text=driver.findElement(By.partialLinkText("Gm")).getText();
	String exptext="gmail";
	if (text.equalsIgnoreCase("exptext"))
	{
	System.out.println("text is matching::"+text+"  "+exptext);	
	}
	else 
	{
	System.out.println("text is not matching::"+text+"  "+exptext);
	}
Thread.sleep(5000);
driver.close();
	}

}
