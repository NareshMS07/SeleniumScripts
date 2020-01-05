package jan4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIterator {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// get parent id
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Iterator<String>x=allwindows.iterator();
		while (x.hasNext()) 
		{
		String child=x.next();
		if (!parent.equals(child)) 
		{
		//switch to child
			String pagetitle=driver.switchTo().window(child).getTitle();
			System.out.println(pagetitle);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		}
		}
      // switch to parent
		driver.switchTo().window(parent);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}
