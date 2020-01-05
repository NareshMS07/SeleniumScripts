package jan3;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWindow1 {
	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//get id which is currently loaded
		String parent=driver.getWindowHandle();
		System.out.println("parent id::"+parent);
		Thread.sleep(5000);
		//click on terms links
		driver.findElement(By.partialLinkText("Ter")).click();
		Thread.sleep(5000);
		//get collection windows
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("all windows id::"+allwindows);
		for(String each:allwindows)
		{
			//parent window should not be equal to each window
			if(!parent.equals(each))
			{
				//switch to child window
				driver.switchTo().window(each);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")).click();
				Thread.sleep(5000);
				//switch back to parent
				driver.switchTo().window(parent);
				Thread.sleep(5000);
				driver.findElement(By.name("email")).sendKeys("test@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("test12344");
				driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				driver.quit();
			}
		}
	}

}










