package jan9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Actions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		ac.clickAndHold(source).moveToElement(dst).release().perform();
		if (dst.getText().contains("Drop")) 
		{
		System.out.println("Drag and drop success");	
		}
		else {
			System.out.println("Drag and drop failed");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
