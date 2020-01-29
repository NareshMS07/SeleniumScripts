package jan9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Actions {

	static XpathC path= new XpathC();
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("https://jqueryui.com/droppable/");
		driver.navigate().to(path.url);	
		driver.manage().window().maximize();
		List<WebElement> lis = driver.findElements(By.xpath("//div[@class='g-grid']/div[@class='g-block size-80']"));
		
		System.out.println(lis.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Actions ac=new Actions(driver); //switch to frame driver.switchTo().frame(0);
		 * WebElement source=driver.findElement(By.id("draggable")); WebElement
		 * dst=driver.findElement(By.id("droppable")); Thread.sleep(5000);
		 * ac.clickAndHold(source).moveToElement(dst).release().perform(); if
		 * (dst.getText().contains("Drop")) {
		 * System.out.println("Drag and drop success"); } else {
		 * System.out.println("Drag and drop failed"); } Thread.sleep(5000);
		 * //driver.close();
		 */	}

}
