package jan4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingArrayList {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//get collection of windows
		ArrayList<String>browser=new ArrayList<String>(driver.getWindowHandles());
		String title1=driver.switchTo().window(browser.get(2)).getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.close();
		String title2=driver.switchTo().window(browser.get(0)).getTitle();
		System.out.println(title2);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		Thread.sleep(6000);
		driver.close();
	}


}






























