package dec28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_NoOfLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://yahoo.com");
		driver.manage().window().maximize();
		//get collection of links in a page which are stored under html tag a
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+links.size());
		Thread.sleep(3000);
		for (int i = 0; i < links.size(); i++) 
		{
			//get each linktext
			String linkname=links.get(i).getText();
			//get each url
			String linkurl=links.get(i).getAttribute("href");
		}
		Thread.sleep(4000);
		driver.close();
	}

}
