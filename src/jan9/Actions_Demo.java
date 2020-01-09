package jan9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//create action class
		Actions ac=new Actions(driver);
		//close the banner
		ac.sendKeys(Keys.ESCAPE).build().perform();
		WebElement men=driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		//move mouse to men
		ac.moveToElement(men).build().perform();
		Thread.sleep(5000);
		//move mouse to best and click it
		ac.moveToElement(driver.findElement(By.linkText("Belts")));
		ac.click();
		ac.perform();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();		
	}

}
